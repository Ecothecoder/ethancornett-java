<template>
  <div>
      <h1>Information for User # {{ currentId }}</h1>
      <pre>
          {{ user }}
      </pre>
      <img :src="require('@/images/cake' + currentId + '.jpeg')">
  </div>
</template>

<script>
import userService from '@/service/UserService';

export default {
    data() {
        return {
            user: null,
            currentId: this.$route.params.id
        }
    },
    created() {
        userService.get(this.currentId).then(userData => this.user = userData)
    }
}
</script>

<style>

</style>