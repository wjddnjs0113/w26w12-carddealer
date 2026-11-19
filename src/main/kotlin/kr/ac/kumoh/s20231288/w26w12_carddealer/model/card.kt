package kr.ac.kumoh.s20231288.w26w12_carddealer.model

data class Card(
    val rank: String,
    val suit: String,
) {
    val imageName: String
        get() = when (rank) {
            "jack", "queen", "king" -> "${rank}_of_${suit}2.png"
            else -> "${rank}_of_${suit}.png"
        }
}