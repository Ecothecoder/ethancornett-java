<template>
  <div v-show="visible" :style="{fontSize: size + 'em'}">
      {{emojifiedWord}}
  </div>
</template>

<script>
import emoji from 'node-emoji';
export default {
props: { 
    word:String,
    size: Number,
    visible: Boolean
},
computed: {
    emojifiedWord(){
        return emoji.get(this.word);
    }
}
}
</script>

<style>

</style>