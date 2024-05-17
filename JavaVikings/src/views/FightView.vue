<script>
import LoadCharacters from '../components/LoadCharacter.vue'

export default {
    data() {
        return {
            location: null,
            fighter: null,
        }
    },
    components: {
        LoadCharacters
    }
}
</script>

<template>
    <div class="container text-center">
        <div class="menu row justify-content-center">
            <div class="col-sm-4 col">
                <RouterLink to="/"><button class="btn btn-danger buttonSize">Home</button>
                </RouterLink>
            </div>

            <div class="col-sm-4 col">
                <RouterLink to="/gear"><button class="btn btn-danger buttonSize">Generate Gear</button>
                </RouterLink>
            </div>
        </div>
    </div>

    <div>
        <LoadCharacters />
    </div>
</template>
