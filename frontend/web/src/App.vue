<template>
  <div id="app">
    <Navbar />

    <div class="container">
        <router-view />
    </div>
    <hr>
    <div class="container-fluid">
        <a href="https://github.com/keitaro1020" target="_blank">
            <img src="https://image.flaticon.com/icons/svg/25/25231.svg" width="30" height="20">
        </a>
    </div>
  </div>
</template>

<script>
import Navbar from './components/Navbar.vue'

export default {
  name: 'app',
  components: {
    Navbar,
  },
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}
</style>
