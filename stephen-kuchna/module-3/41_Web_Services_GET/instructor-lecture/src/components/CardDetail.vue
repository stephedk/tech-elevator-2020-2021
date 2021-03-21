<template>
  <div>
    <!-- only show until the data loads -->
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" alt="">
    </div>
    
    <h1>{{card.title}}</h1>
    <p>{{card.description}}</p>

    <!-- <div class="comment" v-for="comment in card.comments" v-bind:key="comment.id">
      <h3>{{comment.author}}</h3>
      <p class="date">{{comment.postedOn}}</p>
      <p>{{comment.body}}</p>
    </div> -->
    <comments-list v-bind:comments="card.comments" v-if="!isLoading" />

    <div class="board-actions" v-if="!isLoading">
      <router-link
        v-bind:to="{ name: 'Board', params: { id: $route.params.boardID } }"
        >Back to Board</router-link
      >
    </div>
  </div>
</template>

<script>
import boardService from '@/services/BoardService.js';
import CommentsList from './CommentsList.vue';

export default {
    components: { CommentsList },
  name: "card-detail",
  data(){
    return {
      isLoading: true,
      card: {}
    }
  },
  created() {
    //this fires when the page is loaded
    // call the API here
    const boardId = this.$route.params.boardID;
    const cardId = this.$route.params.cardID;
    boardService.getCard(boardId, cardId)
                .then(result => {
                  this.card = result;
                  this.isLoading = false;
                });
  }
};
</script>

<style scoped>
.date{
  font-size: .5em;;
}


</style>
