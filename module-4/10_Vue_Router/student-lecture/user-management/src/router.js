import Vue from 'vue'
import Router from 'vue-router'
import Users from '@/views/Users'
import User from '@/views/User'
Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {path: '/users',
    name: 'userList',
    component:Users
    },
    {path: '/user/:id',
    name: 'userDetail',
    component:User
    },
    {
      path: '/',
      redirect: {name: 'userList'}
    }
  ]
})