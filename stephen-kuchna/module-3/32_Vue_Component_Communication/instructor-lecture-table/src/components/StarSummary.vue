<template>
  <div class="well">
    <span class="amount" v-on:click="updateFilter(rating)">{{ numberOfReviews }}</span>
    {{ rating }} Star Review{{ numberOfReviews == 1 ? '' : 's' }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: {
    rating: Number
  },
  methods: {
    updateFilter(rating) {
      this.$store.commit('UPDATE_FILTER', rating)
    }
  },
  computed: {
    numberOfReviews() {
      const reviews = this.$store.state.reviews;
      return reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating == this.rating ? 1 : 0);
      }, 0);
    }
  }
};
</script>

