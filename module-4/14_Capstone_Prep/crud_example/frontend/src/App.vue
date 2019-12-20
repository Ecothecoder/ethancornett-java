<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link>
      <router-link to="/favorites">My Favorites</router-link>
    </div>
    <router-view/>
  </div>
</template>

<style scoped>
  a {
    margin: 10px;
  }
</style>