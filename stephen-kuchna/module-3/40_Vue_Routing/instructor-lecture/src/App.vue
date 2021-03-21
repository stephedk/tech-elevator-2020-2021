<template>
  <div class="content">
    <div class="container">
      <router-link to="/">Home</router-link> | 
      <router-link to="/about">About Us</router-link> | 
      <router-link to="/contact">Contact Us</router-link>  
    </div>

    <!-- <router-view /> is the placeholder for what the routing engine will display -->
    <div class="container" >
       <router-view />
    </div>
   
  </div>
</template>

<script>
export default {};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  max-width: 800px;
  margin: 60px auto 0 auto;
}
.content {
  display: flex;
  flex-direction: column;

}
.container {
  display: flex;
  justify-content: center;
}
</style>
