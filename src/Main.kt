fun mover_robot(movimiento: IntArray): Array<Int> {
    var x:Int = 0
    var y:Int = 0
    var direccion = 0
    for (paso in movimiento){
        when(direccion){
            0 -> y += paso
            1 -> x -= paso
            2 -> y -= paso
            3 -> x += paso
        }
        if (direccion != 3) direccion += 1 else direccion = 0
    }
    return arrayOf(x ,y, direccion)

}

fun main() {
    val movimientosPosibles = listOf("POSITIVEY", "NEGATIVEX", "NEGATIVEY", "POSITIVEX")
    var todosMovimientos = arrayListOf(intArrayOf(10, 5, -2), intArrayOf(0, 0, 0) , intArrayOf(), intArrayOf(-10, -5, 2), intArrayOf(-10, -5, 2, 4, -8))
    for (movimiento in todosMovimientos){
        val movimiento_robot = mover_robot(movimiento)
        println("x: ${movimiento_robot[0]} y: ${movimiento_robot[1]}, direccion: ${movimientosPosibles[movimiento_robot[2]]}")
    }
}
