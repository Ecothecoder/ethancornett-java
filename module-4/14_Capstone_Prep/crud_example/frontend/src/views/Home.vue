<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this. You are logged in as {{user.sub}}.</p>

    <img :src="catPictureUrl" >
    <div>{{ catFact }}</div>
    <button @click="addFavorite">Add Favorite</button>

    <button @click="logout">logout</button>

  </div>
</template>

<script>
import auth from '@/auth.js'

export default {
  name: 'home',
  data() {
    return {
      user: auth.getUser(),
      catFact: '',
      catPictureUrl: ''
    }
  },
  methods: {
    logout() {
      auth.logout();
      this.$router.push('/login');
    },
    addFavorite() {
      
      fetch(process.env.VUE_APP_REMOTE_API + '/api/user/favorites', {
        headers: {Authorization: 'Bearer ' + auth.getToken(), 'Content-Type': 'application/json'},
        method: 'POST',
        body: JSON.stringify({text: this.catFact, picturePath: this.catPictureUrl})
      })
      .then(() => this.$router.push('/favorites'));
    }
  },
  created() {
    fetch(process.env.VUE_APP_REMOTE_API + '/api/fact', {headers: {Authorization: 'Bearer ' + auth.getToken()}})
    .then(response => response.json())
    .then(data => this.catFact = data.text);

    fetch('https://aws.random.cat/meow')
    .then(response => response.json())
    .then(data => this.catPictureUrl = data.file);
  }
}
</script>

<style scoped>
img {
  max-height: 400px;
}
</style>
