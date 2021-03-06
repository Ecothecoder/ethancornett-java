<template>
    <div class="main">
        <h2>Product Reviews for {{ name }}</h2>

        <p class="description">{{ description }}</p>

        <div class="well-display">
            <div class="well">
                <span @click="filter = 0" class="amount">{{ averageRating }}</span>
                Average Rating
            </div>

            <div class="well">
                <span @click="filter = 1" class="amount">{{ numberOfOneStarReviews }}</span>
                1 Star Review{{ numberOfOneStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span @click="filter = 2" class="amount">{{ numberOfTwoStarReviews }}</span>
                2 Star Review{{ numberOfTwoStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span @click="filter = 3" class="amount">{{ numberOfThreeStarReviews }}</span>
                3 Star Review{{ numberOfThreeStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span @click="filter = 4" class="amount">{{ numberOfFourStarReviews }}</span>
                4 Star Review{{ numberOfFourStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span @click="filter = 5" class="amount">{{ numberOfFiveStarReviews }}</span>
                5 Star Review{{ numberOfFiveStarReviews === 1 ? '' : 's' }}
            </div>
        </div>

        <a href="#" v-on:click.prevent="formVisible = true" v-show="formVisible === false">Show Form</a>

        <form @submit.prevent="addNewReview" v-show="formVisible">
            <div class="form-element">
                <label for="reviewer">Name:</label><input v-model="newReview.reviewer" id="reviewer" type="text"  />
            </div>
            <div class="form-element">
                <label for="title">Title:</label> <input v-model="newReview.title" id="title" type="text" />
            </div>
            <div class="form-element">
                <label for="rating">Rating:</label> <select v-model.number="newReview.rating" id="rating">
                    <option value="1">1 Star</option>
                    <option value="2">2 Stars</option>
                    <option value="3">3 Stars</option>
                    <option value="4">4 Stars</option>
                    <option value="5">5 Stars</option>
                </select>
            </div>
            <div class="form-element">
                <label for="review">Review</label>
                <textarea v-model="newReview.review" id="review"></textarea>
            </div>
            <button :disabled="isFormValid === false">Submit</button>
            <button type="cancel" @click.prevent="resetForm">Cancel</button>
        </form>

        <div class="review" v-for="review in filteredReviews" v-bind:key="review.id">
            <h4>{{ review.reviewer }}</h4>
            <div class="rating">
                <img src="../assets/star.png" v-bind:title="review.rating + ' Star Review'" class="ratingStar" v-for="n in review.rating" v-bind:key="n" />
            </div>
            <h3>{{ review.title }}</h3>

            <p>{{ review.review }}</p>
        </div>
    </div>
</template>

<script>
export default {
    name: "product-review",
    data() {
        return {
            formVisible: false,
            filter: 0,
            newReview: {
                reviewer: '',
                title: '',
                review: '',
                rating: 0
            },
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends.',
            reviews: [
                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
                    rating: 3
                },
                {
                    reviewer: "Tim Ferriss",
                    title: 'Had a cigar party started in less than 4 hours.',
                    review: "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
                    rating: 4
                },
                {
                    reviewer: "Ramit Sethi",
                    title: 'What every new entrepreneurs needs. A door stop.',
                    review: "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
                    rating: 1
                },
                {
                    reviewer: "Gary Vaynerchuk",
                    title: 'And I thought I could write',
                    review: "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
                    rating: 3
                }
            ]
        };
    },
    computed: {
        averageRating() {
            let sum = this.reviews.reduce( (currentSum, review) => {
                return currentSum + review.rating;
            }, 0);
            return sum / this.reviews.length;
        },
        numberOfOneStarReviews() {
            return this.numberOfReviews(this.reviews, 1);
        },
        numberOfTwoStarReviews() {
            return this.numberOfReviews(this.reviews, 2);
        },
        numberOfThreeStarReviews() {
            return this.numberOfReviews(this.reviews, 3);
        },
        numberOfFourStarReviews() {
            return this.numberOfReviews(this.reviews, 4);
        },
        numberOfFiveStarReviews() {
            return this.numberOfReviews(this.reviews, 5);
        },
        isFormValid() {
            return Boolean(this.newReview.reviewer && this.newReview.title && this.newReview.rating && this.newReview.review);
        },
        filteredReviews() {
            return this.reviews.filter(review => this.filter === 0 || review.rating === this.filter)
        }
    },
    methods: {
        numberOfReviews(reviews, starType) {
            return reviews.reduce( (currentCount, review ) => {
                return currentCount + ( review.rating === starType ? 1 : 0);
            }, 0);
        },
        resetForm() {
            this.newReview = {reviewer: '', title: '', rating: 0, review: ''};
            this.formVisible = false;
        },
        addNewReview() {
            this.reviews.unshift(this.newReview);
            this.resetForm();
        }     
    }
}
</script>

<style scoped>
    div.main {
        margin: 1rem 0;
    }

    div.main div.well-display {
        display: flex;
        justify-content: space-around;
    }

    div.main div.well-display div.well {
        display: inline-block;
        width: 15%;
        border: 1px black solid;
        border-radius: 6px;
        text-align: center;
        margin: 0.25rem;
    }

    div.main div.well-display div.well span.amount {
        color: darkslategray;
        display: block;
        font-size: 2.5rem;
        cursor: pointer;
    }

    div.main div.review {
        border: 1px black solid;
        border-radius: 6px;
        padding: 1rem;
        margin: 10px;
    }

    div.main div.review div.rating {
        height: 2rem;
        display: inline-block;
        vertical-align: top;
        margin: 0 0.5rem;
    }

    div.main div.review div.rating img {
        height: 100%;
    }

    div.main div.review p {
        margin: 20px;
    }

    div.main h3 {
        display: inline-block;
    }

    div.main h4 {
        font-size: 1rem;
    }

    div.main .form-element {
        display: flex;
        justify-content: flex-end;
        padding: .5em;
    }

    div.main .form-element label {
        padding: .5em 1em .5em 0;
        flex: 1;
    }

    div.main .form-element input, div.main .form-element select, div.main .form-element textarea {
        flex: 2;
    }

    div.main .form-element textarea {
        height: 10rem;
    }

    div.main .form-element input, div.main .form-element button {
        padding: 0.5em;
    }

    div.main .form-element button {
        background: gray;
        color: white;
        border: 0;
    }
</style>
