<script>
import { getLocation } from '../data/FetchLocation.js'
import { pickRandomMessage } from '../data/FightMessage'

/**
 * This is the main part of our whole app, it handles a bit too much but that's how it ended up.
 * To begin with, it set's up a "random" text and location with the help from FetchLocation.js
 * it also checks who will be the winner with the help of the stats that's generated.
 * That's not all, it also prints the text in a satisfying way.
 * And on top of all that it also adds text to speech so you don't have to read the fight by yourself.
 * 
 * I know it sounds like a lot but it's basically handles the fight mechanic
 */

export default {
    data() {
        return {
            location: null,
            winner: null,
            loser: null,
            printText: '',
            fullMessage: '',
            // forcedSpace is there to not have "magic variable later in the code"
            forcedSpace: ' ',
            isDonePrinting: false,
            isSlowPrint: true,
            isTTS: true,
            isBothFightersReady: false,
            // Here we store the messages that are randomly generated
            messages: {
                textOne: null,
                textTwo: null,
                textThree: null,
                textFour: null,
                textFive: null,
                textSix: null,
                textSeven: null,
                textEight: null,
                textNine: null,
                textTen: null,
            }
        }
    },
    // This is where we store the data of the two picked fighters from FightView.vue
    props: {
        characterOne: {},
        characterTwo: {}
    },
    methods: {
        /**
         * Here we start by checking who the winner is, then we get the location of the fight.
         * But to make sure that the location is fetched before texts start printing we use a lambda to make wait for getFightLocation to finish
         * before we continue with setText
         */
        startFight() {
            this.checkWinner()
            this.getFightLocation().then(() => {
                this.setText()
            })
        },
        async getFightLocation() {
            try {
                this.location = await getLocation()
            } catch (error) {
                alert(error.message)
                window.location.reload()
            }
        },
        checkWinner() {
            this.winner = this.characterOne.stats > this.characterTwo.stats ? this.characterOne.name : this.characterTwo.name;
            this.loser = this.characterOne.stats > this.characterTwo.stats ? this.characterTwo.name : this.characterOne.name;
        },
        /**
         * This is where the real magic happens, here we call the pickRandomMessage ten times(once per message)
         * and set up the correct order of the messages.
         */
        setText() {
            for (const message in this.messages) {
                this.messages[message] = pickRandomMessage(message)
            }
            const messageOrder = [
                this.messages.textOne,
                this.location,
                this.forcedSpace,
                this.characterOne.name,
                this.messages.textTwo,
                this.characterTwo.name,
                this.messages.textThree,
                this.messages.textFour,
                this.messages.textFive,
                this.characterOne.name,
                this.messages.textSix,
                this.characterTwo.name,
                this.messages.textSeven,
                this.characterTwo.name,
                this.messages.textEight,
                this.messages.textNine,
                this.winner,
                this.messages.textTen,
                this.loser,
            ]
            this.settingUpTextAndTTS(messageOrder)
        },
        /**
         * Here we split the text up in to two parts, one that goes to the tts function and one that goes to the split words function.
         */
        async settingUpTextAndTTS(messageOrder) {
            for (const text of messageOrder) {
                this.fullMessage += text
            }
            this.speak()
            for (const text of messageOrder) {
                for (const word of text) {
                    for (const letter of word) {
                        this.printText += letter
                    }
                    if (this.isSlowPrint) {
                        await this.sleep(40)
                    }
                }
            }
            this.isDonePrinting = true
        },
        /**
         * A handmade sleep function to make sure the text prints in a nice letter by letter way.
         * @param {number of milliseconds to wait} ms 
         */
        sleep(ms) {
            return new Promise(resolve => setTimeout(resolve, ms))
        },
        speedUpText() {
            this.isSlowPrint = false
        },
        /**
         * This is a reset function that sets the page back to zero when you close the fight text.
         */
        restorePage() {
            this.printText = ''
            this.fullMessage = ''
            this.isDonePrinting = false
            this.isSlowPrint = true
            window.speechSynthesis.cancel()
        },
        /**
         * To make sure that the player won't try to fight with only one character we hide the fight button until both are picked 
         */
        checkFightersReady() {
            if (typeof this.characterOne.name !== 'undefined' && typeof this.characterTwo.name !== 'undefined') {
                this.isBothFightersReady = true;
            }
        },
        /**
         * This sets up the tts, and a check to see if the player want's to hear to sound or not
         */
        speak() {
            const tts = new SpeechSynthesisUtterance(this.fullMessage)
            tts.pitch = 0
            tts.rate = 1.2
            tts.lang = 'en'
            tts.volume = 0.5
            if (this.isTTS) {
                window.speechSynthesis.speak(tts)
            }
        },
        switchTTS() {
            this.isTTS = !this.isTTS
        }
    },
    /**
     * This part works together with checkFightersReady to see if both characters are picked
     */
    watch: {
        characterOne: {
            handler() {
                this.checkFightersReady()
            },
        },
        characterTwo: {
            handler() {
                this.checkFightersReady()
            },
        },
    }
}
</script>

<template>
    <!-- Button trigger modal -->
    <button v-if="isBothFightersReady" type="button" class="btn btn-danger" data-bs-toggle="modal"
        data-bs-target="#staticBackdrop" @click="startFight()">
        Fight!
    </button>
    <!--Some svg pictures taken from bootstrap for volume/mute button-->
    <svg v-if="isTTS" @click="switchTTS()" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
        class="bi bi-volume-up-fill white-mute-button" viewBox="0 0 16 16">
        <path
            d="M11.536 14.01A8.473 8.473 0 0 0 14.026 8a8.473 8.473 0 0 0-2.49-6.01l-.708.707A7.476 7.476 0 0 1 13.025 8c0 2.071-.84 3.946-2.197 5.303l.708.707z" />
        <path
            d="M10.121 12.596A6.48 6.48 0 0 0 12.025 8a6.48 6.48 0 0 0-1.904-4.596l-.707.707A5.483 5.483 0 0 1 11.025 8a5.483 5.483 0 0 1-1.61 3.89l.706.706z" />
        <path
            d="M8.707 11.182A4.486 4.486 0 0 0 10.025 8a4.486 4.486 0 0 0-1.318-3.182L8 5.525A3.489 3.489 0 0 1 9.025 8 3.49 3.49 0 0 1 8 10.475l.707.707zM6.717 3.55A.5.5 0 0 1 7 4v8a.5.5 0 0 1-.812.39L3.825 10.5H1.5A.5.5 0 0 1 1 10V6a.5.5 0 0 1 .5-.5h2.325l2.363-1.89a.5.5 0 0 1 .529-.06z" />
    </svg>
    <svg v-else @click="switchTTS()" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
        class="bi bi-volume-mute-fill white-mute-button" viewBox="0 0 16 16">
        <path
            d="M6.717 3.55A.5.5 0 0 1 7 4v8a.5.5 0 0 1-.812.39L3.825 10.5H1.5A.5.5 0 0 1 1 10V6a.5.5 0 0 1 .5-.5h2.325l2.363-1.89a.5.5 0 0 1 .529-.06zm7.137 2.096a.5.5 0 0 1 0 .708L12.207 8l1.647 1.646a.5.5 0 0 1-.708.708L11.5 8.707l-1.646 1.647a.5.5 0 0 1-.708-.708L10.793 8 9.146 6.354a.5.5 0 1 1 .708-.708L11.5 7.293l1.646-1.647a.5.5 0 0 1 .708 0z" />
    </svg>
    <!-- Modal -->
    <div class="modal" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
        aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title w-100" id="staticBackdropLabel">Fight</h1>
                    <svg @click="speedUpText" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                        class="bi bi-chevron-double-right" viewBox="0 0 16 16">
                        <path fill-rule="evenodd"
                            d="M3.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L9.293 8 3.646 2.354a.5.5 0 0 1 0-.708z" />
                        <path fill-rule="evenodd"
                            d="M7.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L13.293 8 7.646 2.354a.5.5 0 0 1 0-.708z" />
                    </svg>
                </div>
                <div>
                    {{ printText }}
                </div>
                <div class="modal-footer">
                    <button @click="restorePage()" v-if="isDonePrinting" type="button" class="btn btn-danger"
                        data-bs-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</template>

<style>
.white-mute-button {
    color: white;
    margin: 3px;
}
</style>