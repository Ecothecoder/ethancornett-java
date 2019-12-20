<template>
  <div>
      <label :for="inputId">{{labelText}}</label><input @change="valueChanged" type="text" :name="inputName" :id="inputId">
  </div>
</template>

<script>
export default {
    props: {
        inputId: String,
        inputName: String,
        labelText: String
    },
    methods: {
        valueChanged(event) {
            this.$emit('changed-value', event.target.value);
        }
    }

}
</script>

<style>

</style>