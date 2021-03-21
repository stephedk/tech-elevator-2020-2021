<template>
  <div class="about">
    <h1>This is an about page</h1>
    <ul>
      <li v-for="param in parameters" v-bind:key="param.key">{{param}}</li>
    </ul>
  </div>
</template>

<script>
export default {
  computed: {
    parameters() {
      return this.$route.params;
    }
  }
}
</script>
