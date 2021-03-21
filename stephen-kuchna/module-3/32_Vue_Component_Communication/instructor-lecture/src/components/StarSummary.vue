<template>
  <div class="well" v-on:click="updateFilter">
    <span class="amount">{{ numberOfReviews }}</span>
    {{ rating }} Star Review{{ numberOfReviews === 1 ? '' : 's' }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: ["rating"],
  methods: {
    updateFilter() {
      //update the state
      // commit initiates the mutation action
      // 1st argument - the name of the mutation
      // 2nd argument - what am I changing in the state
      this.$store.commit('UPDATE_FILTER',parseInt(this.rating));
    }
  },
  computed: {
    numberOfReviews() {
      const reviews = this.$store.state.reviews;
      return reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === parseInt(this.rating) ? 1 : 0);
      }, 0);
    }
  }
};
</script>

