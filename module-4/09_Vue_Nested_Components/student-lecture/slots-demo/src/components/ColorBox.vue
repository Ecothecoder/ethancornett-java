<template>
  <div :style="{backgroundColor: color}" id="color">

  </div>
</template>

<script>
export default {
    props:{
        color: String
    }

}
</script>

<style>
div #color{
    width: 300px;
    height: 300px;
}

</style>