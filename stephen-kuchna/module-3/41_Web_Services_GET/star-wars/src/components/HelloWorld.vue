<template>
  <div>
   <!-- display characters -->
    <ul>
      <li v-for="character in characters" v-bind:key="character.id">
        {{character.name}} - {{character.hair_color}}
      </li>
    </ul>
  </div>
</template>

<script>
import starWarsService from "../services/StarWarsService.js";

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      characters: []
    }
  },
  // this is like the constructor
  // component initilize event
  created() {


    // this gets the data from the API
    starWarsService.getCharacters()
                   .then( body => {

                     this.characters = body.data.results;
                   });




  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
a {
  color: #42b983;
}
</style>
