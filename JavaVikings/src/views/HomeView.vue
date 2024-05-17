<template>
    <div class="container">
        <div class="menu row justify-content-center">

            <div class="col-sm-4 col text-center">
                <RouterLink to="/gear"><button class="btn btn-danger buttonSize">Generate
                        Gear</button></RouterLink>
            </div>

            <div class="col-sm-4 col text-center">
                <RouterLink to="/fight"><button class="btn btn-danger buttonSize">Fight</button>
                </RouterLink>
            </div>

        </div>
        <div class="row"></div>
        <div class="textBox col-12 text-center">

            <p>
                You gotta fight! For your right to party!
            </p>

            <p>
                Welcome to JavaVikings! We are the developers of this web application: Rasmus, Daniel, Linus,
                Joakim.
            </p>

            <p>
                The application is based around the API 'K-samsök' which stores data about historical items existing in
                swedish museums. The API can supply information
                about the items, including pictures and locations where they were found. We decided to mainly focus on
                the
                pictures we could fetch from the API to
                build our application for createing a set och gear, with pictures and information about the items.
            </p>

            <p>
                Now to the fun part! Our application is divided into two features: 'Generate Gear' and 'Fight'. Where
                the
                first one is Generate Gear, where you
                can also see some information about the item by 'hovering' over it. Once you are happy with your gear,
                you
                can choose a name and save your character
                to use in the second feature.
                The second feature is 'Fight' where you select two existing characters to fight each other. The fight is
                decided by the totalt stats of the
                characters gear. When a battle is started between two characters you will see a textbased fightsequence.
                Enjoy!
            </p>

        </div>
    </div>
</template>

<style>
p {
    color: rgb(14, 13, 13);
    font-size: x-large;
}

.textBox {
    background-color: aliceblue;
    width: 70%;
    margin-top: 3rem;
    border-radius: 2rem;
}
.btn-danger{
 
    background-color: rgb(105, 81, 66) !important;
    border-color: rgb(73, 31, 0) !important;
}
.btn-danger:hover{
    background-color: rgb(73, 31, 0) !important;

}
</style>