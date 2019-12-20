<template>
  <div>
      <div class="favoritesItem" v-for="favorite in allFavorites" :key="favorite.id">
          <div >{{favorite.pokeName}}<!--make this into a component--> 
              {{favorite.id}}
              <button @click="updateTeam">EDIT NAME</button>
              <input v-if="seen" type="text"/><!-- add a submit button that appears with seen and a delete button next to edit-->
          </div>
      </div>
  </div>
</template>
<script>
import auth from '@/auth.js'

export default {
    data() {
        return {
            allFavorites: [],
            seen: true
        }
    },
    methods: {
        updateTeam(){
            this.seen = !this.seen;
        }
    },
    created() {
        fetch(process.env.VUE_APP_REMOTE_API + '/api/user/team', {headers: {Authorization: 'Bearer ' + auth.getToken()}})
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