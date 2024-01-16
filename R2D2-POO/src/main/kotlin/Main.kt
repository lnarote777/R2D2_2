fun main() {

    val robot1 = Robot("R2D2")

    println("Movimiento1: (1, -5, 0, -9)")
    robot1.mover(arrayOf(1, -5, 0, -9))
    robot1.mostrarPosicion()
    println()

    println("(3, 3, 5, 6, 1, 0, 0, -7)")
    robot1.mover(arrayOf(3, 3, 5, 6, 1, 0, 0, -7))
    robot1.mostrarPosicion()
    println()

    println("(2, 1, 0, -1, 1, 1, -4)")
    robot1.mover(arrayOf(2, 1, 0, -1, 1, 1, -4))
    robot1.mostrarPosicion()
    println()

    println("()")
    robot1.mover(arrayOf())
    robot1.mostrarPosicion()
    println()

    println("(3, 5)")
    robot1.mover(arrayOf(3, 5))
    robot1.mostrarPosicion()

}