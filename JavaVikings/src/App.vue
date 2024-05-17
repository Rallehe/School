<script setup>
import { RouterView } from 'vue-router'

</script>
  
<template>
  <div class="container">
    <div class="menu row">

      <div class="col-12 text-center">
        <h1>JavaVikings</h1>
      </div>

    </div>
    <RouterView />
  </div>
</template>

<style lang="scss" scoped>
@import '~bootstrap/scss/mixins';
@import '~bootstrap/scss/functions';
@import '~bootstrap/scss/variables';

h1{
  font-family: Courier, Monaco, monospace;
  font-size: xx-large;
  color: rgb(255, 255, 255);
  font-weight: bolder;
}

</style>


