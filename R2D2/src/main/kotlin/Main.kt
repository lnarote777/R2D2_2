import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    val movs  = pedirmovs()

    val r2d2Pos = moveRobot(movs)
    println("x: ${r2d2Pos[0]}; y: ${r2d2Pos[1]}; dir: ${orientacion(r2d2Pos[2])}")


}

/**
 *
 * @param movs List<Int>
 */
fun moveRobot( movs: List<Int>): List<Int>{
    var posX = 0
    var posY = 0
    var dir = 0 //0-> POSITIVEY; 1-> NEGATIVEX; 2-> NEGATIVEY; 3-> POSITIVEX

    for (pasos in movs){
        when(dir){
            0 -> posY += pasos
            1 -> posX -= pasos
            2 -> posY -= pasos
            3 -> posX += pasos
        }
        if (dir == 3){
            dir = 0
        }else{
            dir ++
        }
    }
    return listOf(posX, posY, dir)
}

fun orientacion(dir: Int): String {
    var direc = ""
    direc = when(dir){
        0 -> "POSITIVEY"
        1 -> "NEGATIVEX"
        2 -> "NEGATIVEY"
        3 -> "POSITIVEX"
        else -> ""
    }

    return direc
}

fun pedirmovs(): MutableList<Int> {
    while (true){
        return try {
            print("Introduzca los pasos del robot separados por coma (ejemplo: 14, 3, -8, -2) -> ")
            val pasos = readln().split(", ")
            val pasosint = mutableListOf<Int>()

            for (paso in pasos){
                val paso = paso.toInt()
                pasosint.add(paso)
            }
            pasosint
        }catch (e: Exception){
            val pasosint = mutableListOf<Int>(0, 0, 0, 0)
            pasosint
        }
    }

}


