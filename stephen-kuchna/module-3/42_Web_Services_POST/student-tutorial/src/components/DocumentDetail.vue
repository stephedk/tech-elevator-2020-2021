<template>
  <div>
    <h2>{{ this.$store.state.activeDocument.name }}</h2>
    <p>
      <strong>Author:</strong>
      {{ this.$store.state.activeDocument.author }} |
      <strong>Last Opened by Me:</strong>
      {{ this.$store.state.activeDocument.lastOpened }}
    </p>
    <textarea
      v-bind:value="this.$store.state.activeDocument.content"
      v-on:input="content = $event.target.value"
      spellcheck="false"
    />
    <div>
      <button type="submit" v-on:click="saveDocument()">Save Document</button>
    </div>
    <div class="back">
      <router-link :to="{ name: 'Home' }">Return to Documents List</router-link>
    </div>
  </div>
</template>

<script>
import docsService from "../services/DocsService";

export default {
  name: "document-detail",
  data() {
    return {
      content: ""
    };
  },
  methods: {
    saveDocument() {
      const current = this.$store.state.activeDocument;
  const doc = {
    id: current.id,
    name: current.name,
    author: current.author,
    avatar: current.avatar,
    content: this.content,
    lastOpened: current.lastOpened
  };
  docsService.update(doc.id, doc).then(response => {
    if (response.status === 200) {
      this.$router.push("/");
    }
  });
    }
  },
  created() {
    docsService.get(this.$route.params.id).then(response => {
      this.$store.commit("SET_ACTIVE_DOCUMENT", response.data);
    })
    .catch(error => {
      if (error.response.status === 404) {
        this.$router.push("/404");
      } else {
        console.error(error);
      }
    });
}
}
</script>

<style scoped>
textarea {
  width: 500px;
  height: 500px;
}
.back {
  margin-top: 20px;
}

a:link,
a:visited {
  color: blue;
  text-decoration: none;
}
a:hover {
  text-decoration: underline;
}
</style>
