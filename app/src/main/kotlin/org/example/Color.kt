package org.example

data class Color(
    val r: Double,
    val g: Double,
    val b: Double
) {

    constructor(r: Number, g: Number, b: Number) : this(
        r.toDouble(),
        g.toDouble(),
        b.toDouble()
    )

    companion object {

        val white = Color(1, 1, 1)
        val black = Color(0, 0, 0)
    }
}
