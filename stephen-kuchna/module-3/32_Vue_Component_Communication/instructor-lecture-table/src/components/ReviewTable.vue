<template>
  <table class="table">
    <tr>
      <th>Title</th>
      <th>Reviewer</th>
      <th>Review</th>
      <th>Rating</th>
      <th>Favorite</th>
    </tr>
    <review-table-row v-for="review in filteredReviews"
                      v-bind:key="review.id"
                      v-bind:review="review" />
  </table>

</template>

<script>
import ReviewTableRow from "@/components/ReviewTableRow";
export default {
  name: "review-table",
  components: {ReviewTableRow},
  computed: {
    filteredReviews() {
      const reviewsFilter = this.$store.state.filter;
      const reviews = this.$store.state.reviews;
      return reviews.filter(review => {
        return reviewsFilter === 0 ? true : reviewsFilter === review.rating;
      });
    }
  }

};
</script>

<style scoped>
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}

</style>
