<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <labeled-input @change-value="updateWord" input-id="wordInput" label-text="Word:"/>
    <labeled-input @change-value="updateSize" input-id="sizeInput" label-text="Size:"/>
    <simple-counter :startCount="10"/>
    <emoji-display :word="currentWorld" :size="currentSize" :visible="true"/>
    <color-box color="blue"/>
  </div>
</template>

<script>
import LabeledInput from '@/components/LabeledInput';
import emojiDisplay from '@/components/EmojiDisplay';
import simpleCounter from '@/components/simpleCounter';
import colorBox from '@/components/ColorBox';

export default {
  name: 'app',
  components: {
    LabeledInput,
    emojiDisplay,
    simpleCounter,
    colorBox
  },
  data(){
    return {
      currentWorld: '',
      currentSize: 1
    }
  },
  methods:{
    updateWord(newWord){
      this.currentWorld = newWord;
    },
    updateSize(newSize){
      this.currentSize = Number(newSize);
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
