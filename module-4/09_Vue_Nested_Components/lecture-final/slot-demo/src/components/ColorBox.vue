<template>
  <div :style="{backgroundColor: color}">
      <slot>No Content</slot>
  </div>
</template>

<script>
export default {
    props: {
        color: String
    }
}
</script>

<style scoped>
div {
    width: 300px;
    height: 300px;
}
</style>