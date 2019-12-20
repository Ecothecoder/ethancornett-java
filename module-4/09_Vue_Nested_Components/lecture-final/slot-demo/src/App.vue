<template>
  <div id="app">
    
    <labeled-input @changed-value="updateWord" input-id="wordInput" label-text="Word:"/>
    <labeled-input @changed-value="updateSize" input-id="sizeInput" label-text="Size:"/>
    <emoji-display :word="currentWord" :size="currentSize" :visible="true"/>
   
    <color-box color="magenta">
       <simple-counter :starting-value="10"/>
    </color-box>
    <color-box color="turquoise">
      <img alt="Vue logo" src="./assets/logo.png">
    </color-box>
    <color-box color="orange"></color-box>
  </div>
</template>

<script>
import LabeledInput from '@/components/LabeledInput';
import EmojiDisplay from '@/components/EmojiDisplay';
import SimpleCounter from '@/components/SimpleCounter';
import ColorBox from '@/components/ColorBox';

export default {
  name: 'app',
  components: {
    LabeledInput,
    EmojiDisplay,
    SimpleCounter,
    ColorBox
  },
  data() {
    return {
      currentWord: '',
      currentSize: 1
    }
  },
  methods: {
    updateWord(newWord) {
      this.currentWord = newWord;
    },
    updateSize(newSize) {
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
