<template>
  <button @click="counterValue++" type="button">{{counterValue}}</button>
</template>

<script>
export default {
    props: {
        startingValue: Number
    },
    data() {
        return {
            counterValue: this.startingValue
        }
    }

}
</script>

<style>

</style>