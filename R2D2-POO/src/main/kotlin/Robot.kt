class Robot(private val nombre: String) {
    private var posX : Int = 0
    private var posY : Int = 0
    private var dir : Int = 0

    fun mover(movs: Array<Int>){
        for (pasos in movs){
            when(this.dir){
                0 -> this.posY += pasos
                1 -> this.posX -= pasos
                2 -> this.posY -= pasos
                3 -> this.posX += pasos
            }
            if (this.dir == 3){
                this.dir = 0
            }else{
                this.dir ++
            }
        }
    }

    fun mostrarPosicion(){
        println("${this.nombre} está en (${this.posX}, ${this.posY}) ${obtenerDireccion()}")
    }

    fun obtenerDireccion():String{
        return when(this.dir){
            0 -> "PositiveY"
            1 -> "NegativeX"
            2 -> "NegativeY"
            3 -> "PositiveX"
            else -> ""
        }
    }
}