<template>
    <div class="search" @input="handleFilter">
        <input type="text" id="search" name="search"  v-model="searchText" placeholder="Search Shopping List..."/>
    </div>
</template>

<script>
export default {
    name: 'shopping-search',
    data(){
        return{
            searchText: ''
        }
    },

    methods: {
        handleFilter() {
            this.$emit('filter', this.searchText);
        }
    }
}
</script>

<style>
#search {
    width:100%;
    font-size:24px;
    font-family: 'Roboto Condensed', sans-serif;
    padding:10px;
}
</style>
