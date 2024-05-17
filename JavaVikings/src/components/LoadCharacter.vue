<script>
import TimeToFight from './TimeToFight.vue'
import PictureBoxLoad from './PictureBoxLoad.vue'


/**
* Load saved characters from localStorage.
* Render dropdown menus where you choose characters (fighterOne and FighterTwo).
*/
export default {
    components: {
        PictureBoxLoad, TimeToFight
    },
    data() {
        return {
            characters: [],
            fighterOne: [],
            fighterTwo: [],
        }
    },
    methods: {
        loadAllCharacters() {
            for (let i = 0; i < localStorage.length; i++) {
                this.addCharacterToList(i)
            }
        },
        setfighterOne(char) {
            this.takeAwayPickedFighter(this.fighterOne, char)
            this.fighterOne = char
        },
        setfighterTwo(char) {
            this.takeAwayPickedFighter(this.fighterTwo, char)
            this.fighterTwo = char
        },
        takeAwayPickedFighter(fighter, char) {
            this.characters = this.characters.filter(item => item !== char)
            if (fighter.length !== 0) {
                for (let i = 0; i < localStorage.length; i++) {
                    if (localStorage.key(i) === fighter.name) {
                        this.addCharacterToList(i)
                    }
                }
            }
        },
        addCharacterToList(i) {
            const characterName = localStorage.key(i)
            const characterGear = localStorage.getItem(characterName)
            this.characters.push({ name: characterName, gear: JSON.parse(characterGear) })
        }
    },
    mounted() {
        this.loadAllCharacters()
    }
}
</script>

<template>
    <div class="container text-center">

        <div class="row mt-3">
            <div class="dropdown col-12">
                <button class="btn btn-danger dropdown-toggle" type="button" data-bs-toggle="dropdown"
                    aria-expanded="false">
                    Fighter 1
                </button>
                <ul class="dropdown-menu">
                    <li class="dropdown-item" @click="setfighterOne(char)" v-for="char in characters" :key="char.name">
                        {{ char.name }}
                    </li>
                </ul>
            </div>
        </div>

        <div class="row mt-3">
            <div class="col"></div>
            <div class="col-sm-6 col-md-4 col-lg-3 col-xl-3 col-xxl-2">
                <PictureBoxLoad :gearObject="fighterOne" />
            </div>
            <div class="col"></div>
        </div>

        <div class="row mt-3">
            <div class="dropdown col-12">
                <button class="btn btn-danger dropdown-toggle" type="button" data-bs-toggle="dropdown"
                    aria-expanded="false">
                    Fighter 2
                </button>
                <ul class="dropdown-menu">
                    <li class="dropdown-item" @click="setfighterTwo(char)" v-for="char in characters" :key="char.name">
                        {{ char.name }}
                    </li>
                </ul>
            </div>
        </div>

        <div class="row mt-3">
            <div class="col"></div>
            <div class="col-sm-6 col-md-4 col-lg-3 col-xl-3 col-xxl-2">
                <PictureBoxLoad :gearObject="fighterTwo" />
            </div>
            <div class="col"></div>
        </div>

        <div class="row mt-3">
            <div class="col-12">
                <TimeToFight :characterOne="fighterOne" :characterTwo="fighterTwo" />
            </div>
        </div>
    </div>
</template>

<style scoped>
div {
    color: rgb(8, 8, 8);
    font-size: x-large;
}

li {
    list-style: none;
    cursor: pointer;
}

.mt-3 {
    margin-top: 3 !important;
}
</style>