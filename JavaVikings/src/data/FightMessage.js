let messages = {
    textOne: [
        "In the midst of a serene afternoon in ",
        "Under the clear blue sky of ",
        "Amidst the serene beauty of ",
        "In a peaceful corner of ",
        "Surrounded by tranquility in "
    ],
    textTwo: [
        " relishes the tranquility until an unexpected encounter with ",
        " basks in the peaceful ambiance until the unexpected arrival of ",
        " enjoys a moment of serenity until ",
        " finds solace in the calmness until ",
        " is at peace until "
    ],
    textThree: [
        " shatters the silence. ",
        " sparks tension in the air. ",
        " breaks the calmness. ",
        " disturbs the peaceful atmosphere. ",
        " disrupts the tranquility. "
    ],
    textFour: [
        "Fixing their gaze upon one another, both fighters lock eyes, their hands instinctively reaching for their swords. ",
        "Their eyes meet in a moment of silent understanding as they simultaneously unsheathe their blades, preparing for the impending clash. ",
        "With an intense stare, the fighters engage in a wordless exchange, drawing their swords in perfect synchronization. ",
        "Their eyes lock in a fierce gaze as they prepare for an intense battle, their weapons ready. ",
        "As tension builds, the fighters share a determined look, knowing what lies ahead. "
    ],
    textFive: [
        "Swift and precise, ",
        "With a sudden burst of energy, ",
        "Quick and agile, ",
        "In a graceful motion, ",
        "Like a whirlwind, "
    ],
    textSix: [
        " executes a calculated strike, momentarily disrupting ",
        " delivers a staggering blow that momentarily staggers ",
        " lands a well-aimed attack, momentarily disorienting ",
        " launches a powerful assault, momentarily overwhelming ",
        " strikes with precision, momentarily throwing off "
    ],
    textSeven: [
        "'s balance. Yet, ",
        "'s equilibrium. However, ",
        "'s stability. Still, ",
        ". Nonetheless, ",
        ". But ",
    ],
    textEight: [
        " swiftly regains composure and retaliates with a swift counterattack. ",
        " swiftly recovers, launching a relentless counter-assault. ",
        " proves their resilience, quickly retaliating with a formidable strike. ",
        " counterattacks with lightning speed, catching the opponent off guard. ",
        " recovers swiftly and counterstrikes with exceptional agility. "
    ],
    textNine: [
        "Following a grueling and monotonous battle, ",
        "In an arduous and tedious struggle, ",
        "After enduring a prolonged and mind-numbing duel, ",
        "Having fought relentlessly in an exhausting encounter, ",
        "In a battle that seemed never-ending, "
    ],
    textTen: [
        " emerges triumphant, ending the fight by severing the head of ",
        " ultimately prevails, putting an end to the fight by beheading ",
        " triumphs over the opponent, leaving nothing but ashes of ",
        " prevails in the fight, proving their superiority against ",
        " claims victory, bringing an end to the battle with "
    ],
}

export function pickRandomMessage(message) {
    return messages[message][Math.floor(Math.random() * messages[message].length)]
}

