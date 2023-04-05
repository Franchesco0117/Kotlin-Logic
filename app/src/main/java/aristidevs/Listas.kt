package aristidevs

/**
 * Las listas son lo mismo que las arrays, excepto que existen 2 tipos de listas
 * 1. Inmutables
 * 2.- Mutables
 *
 * Las listas inmutables son listas en las que tu añadiras informacion que no podras modificar
 * Por otro lado, las listas mutables, pues puedes hacer lo mismo que las inmutables, pero estas
 * puedes añadir y modificar weas
 */
fun main() {
    //Listas Inmutables

    /**
     * Su declaracion es de esta forma:
     * Tu creas un valor y le dices que sera una lista del tipo que quieras, despues con listOf añades el
     * contenido
     *
     */
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    readOnly.size //Muestra el tamaño de la lista
    readOnly[3] //Devuelve el valor de la posición 3
    readOnly.first() //Devuelve el primer valor
    readOnly.last() //Devuelve el último valor
    println(readOnly) //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo]

    /**
     * Otro dato importante es que podemos filtrar el contenido, algo asi como con un if
     *
     * En este ejemplo estamos filtrando 2 datos de nuesta lista: Lunes o Juernes
     *
     * El caso aqui es que es como si estuvieramos preguntando, porque Juernes no existe en nuestra lista, pero
     * Lunes si, entonces nos mostrara o filtrara unicamente Lunes
     */

    val a = readOnly.filter { it == "Lunes" || it == "Juernes" }
    print(a)



    //Listas Mutables

    /**
     * Las listas mutables son exactamente lo mismo, pero con cambios como la posibilidad de añadir
     */

    val mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
    println(readOnly) //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado]
    mutableList.add("domingo")

    /**
     * Con add tambien podemos jugar un poco con las posiciones de nuestras listas:
     *
     * Aqui estamos añadiendo "Semana: " en la posicion 0, misma posicion en la que esta Lunes
     * Lo que sucedera es que Lunes se recorera para la posicion 1, entonces "Semana: " es la nueva
     * posicion 0
     */

    mutableList.add(0, "Semana: ")

    /**
     * Ahora, debemos de tener cuidao con esta lista mutable, ya que existe la posibilidad de que
     * esta sea vacio o pueda contener un null
     *
     * null se entiende como vaio, y alguna de sus posiciones podria estarlo, en el caso que si lo sea
     * e intentamos operar en el, pues tendremos un error o crash como el crash bandicoot
     *
     * Con estos metodos podremos sabes si la lista esta varia o no en el caso de estarlo, asi nos evitamos
     * estos problemas
     */

    mutableList.none() //Nos devuelve un true si está vacía la lista
    mutableList.firstOrNull() //Nos devolverá el primer campo, y si no hay, un null.
    mutableList.elementAtOrNull(2) //El elemento del índice 2, si no hay, devolverá un null
    mutableList.lastOrNull() //Último valor de la lista o null


    //Recorriendo listas

    /**
     * Funciona de la misma forma que los arrays
     */

    for (item in mutableList) {
        print(item)
    }

    /**
     * Si queremos saber la posicion de cada uno de los valores de la lista usaremos
     * .withIndex el cual nos permite generar 2 variables, la primera es la posicon y la segunda
     * el contenido
     */

    for ((indice, item) in mutableList.withIndex()) {
        println("La posición $indice contiene $item")
    }

    /**
     * Para terminar por dios, usaremos .forEach para hacer algun cambio o algo con cada uno
     * de los valores dentro de la lista
     *
     * Lo que hace este ejemplo es que en cada contenido pondra un :
     */

    val newListEmpty: MutableList<String> = mutableListOf()
    mutableList.forEach {
        newListEmpty.add(it+":")
    }
    print(newListEmpty)


}