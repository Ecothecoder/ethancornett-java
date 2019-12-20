<template>
  <table>
      <tr v-for="r in rowCount" :key="r">
          <td v-for="c in colCount" :key="c" @mouseenter="changeCellColor(c, r, $event)">
              <span v-show="currentRow === r && currentCol === c">👻</span>
          </td>
      </tr>
  </table>
</template>

<script>
export default {
    data() {
        return {
            rowCount: 10,
            colCount: 10,
            currentRow: 5,
            currentCol: 5
        }
    },
    methods: {
        handleArrowKeys(event) {
            if (event.key === 'ArrowLeft' && this.currentCol > 1) this.currentCol--;
            if (event.key === 'ArrowRight' && this.currentCol < this.colCount) this.currentCol++;
            if (event.key === 'ArrowUp' && this.currentRow > 1) this.currentRow--;
            if (event.key === 'ArrowDown' && this.currentRow < this.rowCount) this.currentRow++;
        },
        changeCellColor(col, row, event) {
            let color = 'blue';
            if (col + row > 10) color = `rgb(${this.random256()}, ${this.random256()}, ${this.random256()})`;

            event.target.style.backgroundColor = color;
            
            
        },
        random256() {
            return Math.floor(Math.random() * 256);
        }
    },
    created() {
        document.addEventListener('keyup', this.handleArrowKeys);
    },
    destroyed() {
        document.removeEventListener('keyup', this.handleArrowKeys);
    },


}
</script>

<style scoped>
table {
    border: 1px solid black;
    width: 100%;
    font-size: 2em;
    table-layout: fixed;
    border-collapse: collapse;
}

td {
    border: 1px solid black;
    height: 2em;
}
</style>