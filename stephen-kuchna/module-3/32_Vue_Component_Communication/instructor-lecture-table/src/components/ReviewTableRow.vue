<template>
  <tr v-bind:class="{favorited: review.favorited}">
    <td>{{ review.title }}</td>
    <td>{{ review.reviewer }}</td>
    <td>{{ review.review }}</td>
    <td class="stars">
      <img src="../assets/star.png"
           class="star"
           v-bind:title="review.rating + ' Star Review'"
           v-for="n in review.rating"
           v-bind:key="n">
    </td>
    <td><input type="checkbox"

        v-bind:checked="review.favorited"
        v-on:change="onFavoriteChange(review)"/>
    </td>
  </tr>
</template>

<script>
export default {
  name: "ReviewTableRow",
  props: ["review"],
  methods: {
    onFavoriteChange(review) {
      this.$store.commit('FLIP_FAVORITED', review);
    }
  }
}
</script>

<style scoped>
tr.favorited {
  background-color: lemonchiffon !important;
}
td {
  text-align: left;
}
.stars {
  display: flex;
}
.star{
  width: 20px;
}
</style>
