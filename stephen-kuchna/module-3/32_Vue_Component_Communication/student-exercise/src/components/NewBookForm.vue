<template>
  <form>
      <div>Add A New Book</div>
      <label for="title" class="title-input">Enter Title</label><br>
      <input type="text" id="title" name="title"><br>
      <label for="author" class="author-input">Enter Author</label><br>
      <input type="text" id="author" name="author"><br>
      <label for="isbn" class="isbn-input">Enter ISBN Number</label><br>
      <input type="text" id="isbn" name="isbn"><br>
      <input type="submit">
    </form>
</template>

<script>
export default {
    name: 'new-book-form'
}
</script>

<style>
.new-book-form{
 width: 225px;
 border: 2px solid black;
 border-radius: 10px;
}
.title-input{
 font-size: 1rem;
}
.author-input{
 font-size: 1rem;
}
.isbn-input{
 font-size: 1rem;
}
</style>