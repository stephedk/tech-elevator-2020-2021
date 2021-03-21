<template>
<div>
  <reading-list/>
  <router-link v-bind:to="{name: 'add-book'}">Add Book To Reading List</router-link>
  </div>
</template>

<script>
import ReadingList from '../components/ReadingList.vue'

export default {
    name: 'my-books',
    components:{
        ReadingList,
        
    }

}
</script>

<style>

</style>