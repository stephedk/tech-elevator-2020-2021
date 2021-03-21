<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <!-- 
      if(showWlecomeMessage)
      {
        // remove the display: none style

      }
      else
      {
        //add the display: none style
      }
     -->


    <div id="cards">
        <select v-model="paymentType"
          v-on:change="changePaymentType"
        >
          <option value="Cash">Cash</option>
          <option value="Card">Card</option>
        </select>

        <ul v-if="payWithCard">
          <li><input type="radio" name="card" id="">Amex</li>
          <li><input type="radio" name="card" id="">Visa</li>
          <li><input type="radio" name="card" id="">MasterCard</li>
        </ul>
    </div>
   
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      paymentType: 'Cash',
      payWithCard: false
    }
  },
  methods: {
    changePaymentType() {
      if(this.paymentType === 'Cash')
      {
        this.payWithCard = false;
      }
      else
      {
        this.payWithCard = true;
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#cards {
  width: 250px;
  text-align: left;
}
</style>
