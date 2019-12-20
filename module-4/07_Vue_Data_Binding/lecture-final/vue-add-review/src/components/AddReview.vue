<template>
  <div class="container">
    <h1>Add New Review</h1>
    <div class="row">
      <div class="col-7">
        <form>
          <div class="form-group">
            <label for="title">Title</label>
            <input v-model.lazy="review.title" type="text" class="form-control" id="title" placeholder="Enter title">
          </div>
          <div class="form-group">
            <label for="reviewer">Reviewer</label>
            <input v-model.trim="review.reviewer" type="text" class="form-control" id="reviewer" placeholder="Enter reviewer's name">
          </div>
          <div class="form-group">
            <label for="rating">Rating</label>
            <select v-model.number="review.rating" class="form-control" id="rating">
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
          </div>
          <div class="form-group">
            <label for="review">Review</label>
            <textarea v-model="review.review" class="form-control" id="review" rows="3"></textarea>
          </div>
          <div class="form-group">
            <input v-model="review.sizes" style="margin-left:10px" type="checkbox" name="shirtSize" value="Small"><label>Small</label>
            <input v-model="review.sizes" style="margin-left:10px" type="checkbox" name="shirtSize" value="Medium"><label>Medium</label>
            <input v-model="review.sizes" style="margin-left:10px" type="checkbox" name="shirtSize" value="Large"><label>Large</label>
          </div>
          <button type="submit" class="btn btn-primary">Save Review</button>
        </form>
      </div>
      <div class="col-5">
        <h2>Submission</h2>
        <hr>
        <p>Title: {{review.title}} </p>
        <p>Reviewer: {{review.reviewer}} </p>
        <p>Rating: {{review.rating}}</p>
        <p>Review: {{review.review}}</p>
        <p v-if="review.sizes.includes('Small')">You are Tiny</p>
        <p v-show="review.sizes.includes('Large')">You are not Tiny</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      review: {
        title: '',
        reviewer: '',
        rating: '',
        review: '',
        sizes: ['Medium']
      }
    }
  }
}
</script>

<style>
h1 { 
  margin-top: 20px;
}
</style>
