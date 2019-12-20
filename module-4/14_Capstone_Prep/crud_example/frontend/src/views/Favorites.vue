<template>
  <div>
      <div class="favoritesItem" v-for="favorite in allFavorites" :key="favorite.id">
          <img :src="favorite.picturePath">
          <div>{{favorite.text}}</div>
      </div>
  </div>
</template>

<script>
import auth from '@/auth.js'

export default {
    data() {
        return {
            allFavorites: []
        }
    },
    created() {
        fetch(process.env.VUE_APP_REMOTE_API + '/api/user/favorites', {headers: {Authorization: 'Bearer ' + auth.getToken()}})
        .then(response => response.json())
        .then(data => this.allFavorites = data);
    }

}
</script>

<style scoped>

.favoritesItem {
    display: flex;
    border: 1px solid gray;
}

.favoritesItem div {
    padding: 10px;
}

img {
    max-height: 200px;
}

</style>