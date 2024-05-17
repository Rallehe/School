
<script>
import { searchForThing } from '../data/FetchData.js'
/**
 * Render pictures from api.
 * Emits when picture is done loading and the stats from the given item.
 * Checks if the response from containas a wanted url
 *
 */
export default {

    props: ["search"],
    emits: ["stat", 'loads'],

    data() {
        return {
            url: null,
            title: null,
            loading: false,
            stats: 0,
        }
    },

    methods: {
        async fetchUrl(search) {
            this.loading = true
            try {
                let response = await searchForThing(search)
                while (response.url.includes("emuseumplus") || response.url.includes("catview") || response.url.includes("collections") || response.url.includes("f0bf98f") || response.url.includes("1b3335be75") || response.url.includes("f6cc48ea")) {
                    response = await searchForThing(search)
                }
                this.loading = false
                this.url = response.url
                this.checkDescription(response.description)
                this.generateStats()
                this.emitStats()
            }
            catch (error) {
                alert(error.message)
            }
        },
        checkDescription(description) {
            if (typeof description === "object") {
                this.title = description["@value"];
            }
            else {
                this.title = description;
            }
        },
        generateStats() {
            if (this.url !== undefined) {
                let randomNumber = Math.floor(Math.random() * 20) + 5
                this.stats = ((Math.round(this.url.length / 3)) + randomNumber)
            }
        },
        emitStats() {
            /**
             * Emits stats 
             */
            this.$emit('stat', this.stats, this.search, this.url)
        },
        emitLoading() {
            /**
             * Emits when picture is done loading
             */
            this.$emit('loads')
        }
    },
    async mounted() {
        this.fetchUrl(this.search);
    },
}

</script>

<template>
    <div v-if="loading" class="pictureSize container">
        <div class="spinner-border"></div>
    </div>
 
    <div v-else>
        <!-- 
            event @load
            triggered when img is fully loaded
            event @click 
            triggred by click 
            calls method to get an new item
        -->
        <a @click="fetchUrl(search)" :title="title"><img id="gear" class="pictureSize border-on-hover"
                :src="this.url" @load="emitLoading()" alt=""></a></div>
</template>



<style>
.pictureSize {
    width: 125px;
    height: 125px;
}

@media (max-width: 768px) {
    .pictureSize {
        width: 100px;
        height: 100px;
    }
}

@media (max-width: 576px) {
    .pictureSize {
        width: 75px;
        height: 75px;
    }
}

.border-on-hover:hover {
    border: 5px solid transparent;
    transition: 0.1s;

}
</style>


