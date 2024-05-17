<script>

import PictureBox from '../components/PictureBox.vue';

/*
* View for generating gear. Uses PictureBox to render pictures.
* Handles saving characters to local storage with items and name.
*/
export default {
    components: {
        PictureBox
    },
    data() {
        return {
            items:
                [{ itemName: "hjälm", itemStat: 0, url: "" },
                { itemName: "tröja", itemStat: 0, url: "" },
                { itemName: "svärd", itemStat: 0, url: "" },
                { itemName: "sköld", itemStat: 0, url: "" },
                { itemName: "byxa", itemStat: 0, url: "" },
                { itemName: "skor", itemStat: 0, url: "" }],

            characterName: '',
            totalStats: 0,
            saveAlert: false,
            enterNameAlert: false,
            loadSome: true,
            countPicBox: 0,
        }
    },
    methods: {
        /*
        * Saves stats, name and url for a item, emited by PictureBox.
        * Runnes everytime a PictureBox is updated.
        */
        updateItems(stat, name, url) {
            for (const item of this.items) {
                if (item.itemName === name) {
                    item.itemStat = stat
                    item.url = url
                }
            }
        },
        /*
        * Saves a character with name, url for the pictures and stats.
        * Converts it into JSON-StringObject to be able to save in local storage.
        */
        saveCharacter() {
            if (this.characterName.length > 0) {
                localStorage.setItem(this.characterName, JSON.stringify(this.items))
                this.showSaveAlert()
            } else {
                this.showEnterNameAlert()
            }
        },
        /*
        * Alert notifying user the character has been saved.
        */
        showSaveAlert() {
            this.saveAlert = true
            this.characterName = "";
            setTimeout(() => {
                this.saveAlert = false;
            }, 3000);
        },
        /*
        * Alert notifying user they have to enter a name before saving.
        */
        showEnterNameAlert() {
            this.enterNameAlert = true
            setTimeout(() => {
                this.enterNameAlert = false;
            }, 3000);
        },
        /*
        * Count loaded pictures to block save button until all pictures
        * are loaded.
        */
        checkLoad() {
            this.countPicBox++
            if (this.countPicBox > 5) {
                this.loadSome = false;
            }
        },
    },


}
</script>

<template>
    <div class="container">
        <div class="menu row justify-content-center">
            <div class="col-sm-4 col text-center">
                <RouterLink to="/"><button class="btn btn-danger buttonSize">Home</button>
                </RouterLink>
            </div>

            <div class="col-sm-4 col text-center">
                <RouterLink to="/fight"><button class="btn btn-danger buttonSize">Fight</button>
                </RouterLink>
            </div>
        </div>

        <div class="row mt-4">
            <div class="col-12">

                <div id="save" class="mb-3 input-group justify-content-center">
                    <button v-if="this.loadSome" disabled="true" button class="btn btn-danger "
                        @click="saveCharacter">Save</button>
                    <button v-else button class="btn btn-danger " @click="saveCharacter">Save</button>
                    <input type="text" class="form-group" id="name" v-model="characterName" required minlength="4"
                        maxlength="16" size="11" placeholder="Character name" aria-label="Save"
                        aria-describedby="basic-addon1">
                </div>

            </div>
        </div>

        <div class="row text-center justify-content-center">
            <div v-if="saveAlert" class="col-5 alertMessage"> Character saved!</div>
        </div>
        <div class="row text-center justify-content-center">
            <div v-if="enterNameAlert" class="col-5 alertMessage"> You have to enter a name!</div>
        </div>
    </div>

    <div class="container text-center">
        <div class="row">
            <div class="col-12 mt-4">
                <PictureBox @loads="() => checkLoad()" @stat="(stat, name, url) => updateItems(stat, name, url)"
                    class="itemHelmet" search="hjälm" @load="console.log(5)" />
            </div>
        </div>

        <div class="row justify-content-center">
            <div class="col col-md-3 col-lg-2 mt-4">
                <PictureBox @loads="() => checkLoad()" @stat="(stat, name, url) => updateItems(stat, name, url)"
                    class="itemSword" search="svärd" />
            </div>

            <div class="col col-md-3 col-lg-2 mt-4">
                <PictureBox @loads="() => checkLoad()" @stat="(stat, name, url) => updateItems(stat, name, url)"
                    class="itemArmor" search="tröja" />
            </div>

            <div class=" col col-md-3 col-lg-2 mt-4">
                <PictureBox @loads="() => checkLoad()" @stat="(stat, name, url) => updateItems(stat, name, url)"
                    class="itemShield" search="sköld" />
            </div>
        </div>


        <div class="row">
            <div class="col mt-4">
                <PictureBox @loads="() => checkLoad()" @stat="(stat, name, url) => updateItems(stat, name, url)"
                    class="itemLeggs" search="byxa" />
            </div>
        </div>

        <div class="row">
            <div class="col mt-4">
                <PictureBox @loads="() => checkLoad()" @stat="(stat, name, url) => updateItems(stat, name, url)"
                    class="itemFeet" search="skor" />
            </div>
        </div>

    </div>
</template>

<style>
.alertMessage {
    color: rgb(224, 44, 44);
    border-radius: 0.5rem;
}
</style>