<template>
  <div id="app">
    <TheHeader/>
    <LeftSide/>
    <MainCont/>
    <RightSide/>
    <FootNote/>
    
  </div>
</template>

<script>
import TheHeader from '@/components/TheHeader';
import LeftSide from '@/components/LeftSide';
import MainCont from '@/components/MainCont';
import RightSide from '@/components/RightSide';

import FootNote from '@/components/FootNote';
export default {
  name: "app",
  components: {
    TheHeader,
    LeftSide,
    MainCont,
    RightSide,
    FootNote
  
  }
};
</script>

<style>
body {
  margin: 0px;
  padding: 0px;
}
#app {
  display: grid;
  grid-template-columns: 150px auto 150px;
  grid-template-rows: 60px 1fr 100px;
  grid-gap: 1em;
  height: 100vh;
}

header,
aside,
article,
footer {
  background: #eaeaea;
  padding: 1em;
  color: #949494;
}

header,
footer {
  grid-column: 1 / 4;
}
</style>