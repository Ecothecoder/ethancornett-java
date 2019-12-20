<template>
  <div>
    <h1>Information for pokemon # {{ pokemon.id }}</h1>
    <table>
      <tr>
        <th>Name</th>
        <th>Type</th>
        <th>Stats</th>
      </tr>
      <tr>
        <td>{{pokemon.name}}</td>
        <td v-for="type in pokemon.types" :key="type.slot">{{type.type.name}}</td>
      </tr>
    </table>
    <button @click="addFavorite()">insert pokemon into team.</button>
  </div>
</template>

<script>

import auth from '@/auth.js'
export default {
  data() {
    return {
     
      user: auth.getUser(),
      currentUrl: this.$route.params.url,
      pokemon: []
    };
  },
  methods: {
    addFavorite(){
    fetch(process.env.VUE_APP_REMOTE_API + '/api/user/team',{
        headers: {Authorization: 'Bearer ' + auth.getToken(), 'Content-Type': 'application/json'},
        method: 'POST',
        body: JSON.stringify({pokeName: this.pokemon.name, apiUrl: this.currentUrl})
      }).then(() => this.$router.push('/user/team'))
    }  
  },
  created() {
    fetch(this.$route.params.url)
      .then(response => {
        return response.json();
      })
      .then(poke => (this.pokemon = poke));
  }
};
</script>

<style>
</style>