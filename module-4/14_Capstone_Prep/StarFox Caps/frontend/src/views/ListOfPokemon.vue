<template>
  <div class="pokedex">
    <h1>POKEDEX</h1>
    <p>You must be authenticated to see this. You are logged in as {{user.sub}}.</p>
    <p>HEY! I'M HERE DUDE!</p>

    <table>
      <tr v-for="(poke, index) in pokemon" :key="index">
        <td @click="clickedName(poke.url)">{{poke.name}}</td>
        <td>{{poke.url}}</td>
      </tr>
    </table>
  </div>
</template>


<script>
import auth from "@/auth.js";

import pokeAPI from "@/script/pokeAPI";

export default {
  name: "pokedex",
  data() {
    return {
      user: auth.getUser(),
      pokemon: []
    };
  },
  methods: {
    logout() {
      auth.logout();
      this.$router.push("/login");
    },
    clickedName(url) {
      this.$router.push({ name: "pokemon", params: {url: url}});
    }
  },

  created() {
    pokeAPI.list().then(parsePoke => (this.pokemon = parsePoke.results));
  }
};
</script>

<style>
</style>