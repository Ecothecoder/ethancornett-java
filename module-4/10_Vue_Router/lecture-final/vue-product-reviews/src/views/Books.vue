<template>
  <div>
      <h1>Related Books</h1>
      <p>This is a list of other books you might enjoy.</p>
      <books-list></books-list>
  </div>
</template>

<script>
import BooksList from '@/components/BooksList';

export default {
    components: {
        BooksList
    }
}
</script>

<style>

</style>