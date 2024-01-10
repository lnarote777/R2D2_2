fun main(args: Array<String>) {

    var r2d2Pos : List<Int>
    r2d2Pos = moveRobot(10, 5, -2)
    println("x: ${r2d2Pos[0]}; y: ${r2d2Pos[1]}; dir: ${orientacion(r2d2Pos[2])}")

    r2d2Pos = moveRobot(0, 0, 0)
    println("x: ${r2d2Pos[0]}; y: ${r2d2Pos[1]}; dir: ${orientacion(r2d2Pos[2])}")

    r2d2Pos = moveRobot()
    println("x: ${r2d2Pos[0]}; y: ${r2d2Pos[1]}; dir: ${orientacion(r2d2Pos[2])}")

    r2d2Pos = moveRobot(-10, -5, 2)
    println("x: ${r2d2Pos[0]}; y: ${r2d2Pos[1]}; dir: ${orientacion(r2d2Pos[2])}")

    r2d2Pos = moveRobot(-10, -5, 2)
    println("x: ${r2d2Pos[0]}; y: ${r2d2Pos[1]}; dir: ${orientacion(r2d2Pos[2])}")

}

/**
 *
 * @param movs List<Int>
 */
fun moveRobot(vararg movs: Int): List<Int>{
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
    when(dir){
        0 -> direc = "POSITIVEY"
        1 -> direc = "NEGATIVEX"
        2 -> direc = "NEGATIVEY"
        3 -> direc = "POSITIVEX"
        else -> direc = ""
    }

    return direc
}



