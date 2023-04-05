package aristidevs

/**
 * Los arreglos son secuencias de datos del mismo tipo por un nombre comun.
 *
 *
 */
fun main(){
    //La variable weekDays contiene un arreglo con todos los dias de la semana
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    /**
     * Para mostrar los dias de este arreglo, exsiten 2 formas:
     * 1.- poner el nombre del arreglo.get(posicion)
     * 2.- poner el nombre del arreglo[posicion]
     *
     * Las posiciones son importantes ya que con ellas podremos saber en donde se encuentra
     * pues posicionado el dato
     *
     * Empezando siempre desde el 0
     */
    println(weekDays[0])
    println(weekDays.get(1))
    println(weekDays[2])
    println(weekDays.get(3))
    println(weekDays[4])
    println(weekDays.get(5))
    println(weekDays[6])

    /**
     * Es importante tener en cuenta que si se intenta buscar por ejemplo la posicion 7 de este arreglo
     * nos saldra un error debido a que esta posicion no existe dentro de nuestro arreglo, por lo tanto
     * podemos hacer lo siguiente:
     *
     * Si el tamaño del arreglo es mayor o igual a 8
     * mostrar la posiocion 7
     *
     * En el caso de que no, simplemente mostrar un mensaje
     */

    if(weekDays.size >= 8){
        println(weekDays.get(7))
    }else{
        println("no tiene más parámetros la array")
    }

    /**
     * Si queremos cambiar algun dato de nuestro arreglo, solamente haremos lo siguiente:
     *
     * Parecido a la forma de mostrar la posiocion con el print, aqui tendremos 2 formas de hacerlo:
     * 1.- poniendo el nombre del arreglo.set(posiocion, nuevo dato)
     * 2.- poniendo el nombre del arreglo[posicion] = "nuevo dato"
     *
     * Es importante tener en cuenta que todos los datos del array deben de ser iguales, si son String
     * Entonces son String, si son Interger, encontes son Interger
     */

    weekDays.set(0, "Horrible lunes") //Contenía Lunes
    weekDays[4] = "Por fin viernes" //Contenía Viernes

    /**
     * Para evitar tener que poner 7 prints para mostrar el contenido del array, existe una forma mas
     * profesional de hacerlo y es utilizando un bucle for:
     *
     * En la variable posicion obtendra todas las posiciones de nuestro array
     * Como sabras, el bucle se repetira hasta que el array quede vacio, en este caso
     * hasta llegar a la posicion 6
     */

    for (posicion in weekDays.indices){
        println(weekDays[posicion])
    }

    /**
     * Tambien podemos mostrar el contenido del array
     */

    for ((posicion, valor) in weekDays.withIndex()) {
        println("La posición $posicion contiene el valor $valor")
    }

    /**
     * Aunque si solo queremos el contenido se usa de esta forma:
     */

    for (weekDay in weekDays) {
        println(weekDay)
    }
}