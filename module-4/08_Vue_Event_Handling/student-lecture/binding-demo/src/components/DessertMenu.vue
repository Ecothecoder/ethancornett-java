<template>

    <div>
        <div>
            <select v-model="selectedIndex">
                <option v-for="(name,index) in categoryNames" :key="name" :value="index">{{name}}</option>
            </select>
        </div>
        <div class="checkboxes" v-for="item in dessertCategories[selectedIndex].items" :key="item">
            <input v-model="currentOrder" :value="item" type="checkbox">
            <label :style="{fontSize: item.length+'em'}">{{item}}</label>
        </div>

        <div v-show="currentOrder.length > 0" :class="{bigRed: currentOrder.length>3, littleGreen: currentOrder.length<2}">
            Your order: {{currentOrder.join(', ')}}
        </div>

    </div>
    
</template>

<script>
export default {
    data() {
        return {
            currentOrder: [],
            selectedIndex : 0,
            dessertCategories: [
                {
                    name: 'Cakes',
                    items: ['Chocolate Cake', 'Angel Food Cake', 'Strawberry Shortcake']
                },
                {
                    name: 'Pies',
                    items: ['Apple Pie', 'Cherry Cobbler', 'Mississippi Mud Pie', 'Key Lime Pie']
                },
                {
                    name: 'Cookies',
                    items: ['Chocolate Chip Cookies', 'Snickerdoodles', 'Oreos']
                }
            ]
        }
    },
    computed: {
        categoryNames() {
            return this.dessertCategories.map(category => category.name);
        }
    }

}
</script>

<style>
.checkboxes {
    display: inline-block;
    margin: 10px;
}
.bigRed{
    color: red;
    font-size: 15em;
}
.littleGreen{
    color:green;
    font-size:.2em;
}
</style>
