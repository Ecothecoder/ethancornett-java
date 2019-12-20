<template>
  <button @click="counter++" type="button">HIT ME YOU PANSY! {{counter}}</button>
</template>

<script>
export default {
    props:{
        startCount: Number
    },
    data(){
        return{
       counter: this.startCount
        }    }
}
</script>

<style>
</style>