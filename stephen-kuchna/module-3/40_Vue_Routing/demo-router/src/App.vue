<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link v-bind:to="{name: 'about'}" >About</router-link> | 
      <router-link v-bind:to="productUrl" >Product </router-link>  | 
      <router-link v-bind:to="blogUrl" >Blog </router-link> 

      <div>
        <button v-on:click="navigateToBlog">Go to Blog</button>
      </div>
      
    </div>
    <div class="router">
      <router-view/>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      productUrl: {
        name: 'product',
        params: {
          id: 5
        }
      },
      blogUrl: {
        name: 'blog',
        params: {
          year: 2021,
          month: 'February',
          day: 26
        }
      }
    }
  },
  methods: {
    navigateToBlog() {
      this.$router.push(this.blogUrl);
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
.router {
  border: dotted red 1px;
  border-radius: 10px;
  margin: 0px 50px;
  padding: 20px;
}
</style>
