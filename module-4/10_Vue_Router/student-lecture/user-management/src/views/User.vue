<template>
<div>
    <h1>User Info #{{ this.$route.params.id}}</h1>
    <pre>
        {{user}}
    </pre>
    <img :src="require('@/images/bat.jpg')">
</div>
</template>

<script>
import userService from '@/service/UserService';
export default {
    data(){
        return{
            user:null
        }
    },
    created(){
        userService.get(this.$route.params.id).then(userInfo => this.user = userInfo)
    }
}
</script>