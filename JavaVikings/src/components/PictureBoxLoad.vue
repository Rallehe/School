<script>

/**
* Render saved characters with small pictureboxes.
* Input: list of URLs with pictures of the items.
*/
export default {
    props: {
        gearObject: {
            type: Object
        },

    },
    data() {
        return {
            listOfUrls: [],
        };
    },
    /**
    * Watcher that can update the list of URLs when new input from parent.
    */
    watch: {
        gearObject() {
            this.updateUrlList()
        },
    },
    methods: {
        updateUrlList() {
            let newListOfUrls = []
            for (const item of this.gearObject.gear) {
                newListOfUrls.push(item.url)
            }
            this.listOfUrls = newListOfUrls
        },
    },
}
</script>


<template>
    <div>
        <div class="fighterBackground" v-if="listOfUrls.length > 0">
            <div class="container">
                <div class="row">
                    <div class="smallPictures col-12">
                        <img  :src="listOfUrls[0]" alt="">
                    </div>
                </div>
                <div class="row">
                    <div class="smallPictures col-4">
                        <img :src="listOfUrls[2]" alt="">
                    </div>
                    <div class="smallPictures col-4">
                        <img :src="listOfUrls[1]" alt="">
                    </div>
                    <div class="smallPictures col-4">
                        <img :src="listOfUrls[3]" alt="">
                    </div>
                </div>

                <div class="row">
                    <div class="smallPictures col-12">
                        <img :src="listOfUrls[4]" alt="">
                    </div>
                </div>
                <div class="row">
                    <div class="smallPictures col-12">
                        <img :src="listOfUrls[5]" alt="">
                    </div>
                </div>
            </div>

            <p>{{ gearObject.name }}</p>

        </div>
    </div>
</template>

<style scoped>
img {
    width: 40px;
    height: 40px;
    border: 1px solid black;
}

.fighterBackground {
    background-color: rgb(0, 0, 0, .5);
    border-radius: 1rem;
}

p {
    color: aliceblue;
    background-color: rgb(110, 63, 63);
    border-radius: 1rem;
    margin-top: 1rem;
}
</style>

