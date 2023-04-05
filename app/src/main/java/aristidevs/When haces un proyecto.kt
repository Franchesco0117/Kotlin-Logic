package aristidevs

/**
 * When es basicamente Switch
 */
fun main(){
    getMonth(2)
}

/**
 * Algo importante es que si pones unas llaves, prodemos meter todo el codigo que queramos
 * esto lo digo porque en el ejemplo es solo con un print
 */

fun getMonth(month : Int){
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> {
            print("Noviembre")
            print("Noviembre")
            print("Noviembre")
            print("Noviembre")
        }
        12 -> print("Diciembre")
        else -> {
            print("No corresponde a ningún mes del año")
        }
    }

    /**
     * Si tenemos grandes rangos podemos poner in y 2 puntos 
     */
    fun getMonth(month : Int){
        when (month) {
            in 1..6 -> print("Primer semestre")
            in 7..12 -> print("segundo semestre")
        }
    }
}