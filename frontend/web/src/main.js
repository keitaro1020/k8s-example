import Vue from 'vue'
import BootstrapVue from "bootstrap-vue"
import Vuex from 'vuex';
import VueRouter from 'vue-router';
import routes from './router/routes.js';
import store from './store.js';
import App from './App.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap-vue/dist/bootstrap-vue.css"

Vue.use(BootstrapVue)
Vue.use(Vuex);
Vue.use(VueRouter);

const router = new VueRouter({
  routes
});

new Vue({
  el: '#app',
  router: router,
  store: store,
  render: h => h(App)
})
