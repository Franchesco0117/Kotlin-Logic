package aristidevs

/**
 * Una funcion es basicamente un conjunto de instruccion que realizan una determinada tarea que podemos
 * invocar mediante el nombre que le pongamos
 *
 * Estas se declaran utilizando la palabra fun - nombre de funcion - parentesis donde declararemos los valores
 * de entrada y unas llaves donde que limitan la funcion y llevan las instrucciones
 *
 * Como podemos observar, creamos 4 funciones, de las cuales no se activaran a no ser que las llames
 * por su nombre, estas se mostraran en el orden puesto
 */
fun main(){
    showMyName()
    showMyLastName()
    showMyAge()

    main2()
    main3()
}

fun showMyName(){
    println("Me llamo Francisco")
}

fun showMyLastName(){
    println("Mi Apellido es Castro")
}

fun showMyAge(){
    println("Tengo 18 años")
}

/**
 * Funciones con parametros de entrada
 *
 * Lo que estamos haciendo aqui es primero: showMyInformation tiene 3 tipos de parametros de entrada
 * 1.- name de tipo String
 * 2.- lastName de tipo String
 * 3.- age de tipo Interger
 *
 * Desde main2, vamos a pasarle 3 datos para los parametros y en showMyInformation vamos a mostar esos
 * datos
 */

fun main2() {
    showMyInformation("Francisco", "Castro", 18)
}
fun showMyInformation(name: String, lastName: String, age: Int){
    println("Me llamo $name $lastName y tengo $age años.")
}

/**
 * Funciones con parametros de salida
 *
 * Lo que hacemos aqui es crear una valor en el que le mandaremos a la funcion add un 5 y un 10
 * al hacer esto, dentro de add diremos que el primer numero es de tipo Interger al igual que el segundo
 *
 * Es importante que al terminar los parentesis, le indiquemos el tipo de variable que queremos que nos regrese
 * aparte, debemos de poner la palabra return
 */

fun main3() {
    val result = add(5, 10)
    println(result)
}
fun add(firsNumber: Int, secondNumber: Int) : Int{
    return firsNumber + secondNumber
}