<template>
  <div class="topic-list">
    <div v-for="topic in topics" v-bind:key="topic.id" class="topic" >
      {{ topic.title }}
    </div>
  </div>
</template>

<script>
import MessageService from "../services/MessageService.js"

export default {
  name: 'topic-list',
  data() {
    return {
      topics: []
    }
  }, 
    methods:{
    viewTopic(id){
      this.$router.push(`/topic/${id}`);
    }
},
  created(){
    MessageService.list().then((response => {
      this.topics = response.data;
    }));
  }
}
</script>

<style>
.topic-list {
  padding: 20px 20px;
  margin: 0 auto;
  max-width: 600px;
}
.topic {
  font-size: 24px;
  border-bottom: 1px solid #f2f2f2;
  padding: 10px 20px;
}
.topic:last-child {
  border: 0px;
}
</style>