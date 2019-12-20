<template>
  <div>
      <h1>List of Users</h1>
      <table>
          <tr>
              <th>ID</th>
              <th>Name</th>
          </tr>
          <tr v-for="user in users" :key="user.id">
              <td><router-link :to="{name: 'userDetails', params: {id: user.id}}">{{ user.id }}</router-link></td>
              <td @click="clickedName(user.id)">{{ user.name }}</td>
          </tr>
      </table>
  </div>
</template>

<script>
import userService from '@/service/UserService';

export default {

    data() {
        return {
            users: []
        }
    },
    methods: {
        clickedName(userId) {
            this.$router.push({name: 'userDetails', params: {id: userId}});
        }
    },
    created() {
        userService.list().then(parsedUsers => this.users = parsedUsers);
    }

}
</script>

<style>

</style>