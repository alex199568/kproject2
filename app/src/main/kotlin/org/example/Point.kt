package org.example

data class Point(
    val x: Double,
    val y: Double,
    val z: Double
) {

    constructor(x: Number, y: Number, z: Number) : this(
        x.toDouble(),
        y.toDouble(),
        z.toDouble()
    )
}
