package ejerciciosWeb

/*
* Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
* resta, multiplicación, división y módulo (resto de la división).*/

fun main(){
    print("Ingrese el primer numero: ")
    val numeroUno: Int = readln().toInt()

    print("Ingrese el segundo numero: ")
    val numeroDos: Int = readln().toInt()

    val suma: Int = numeroUno + numeroDos
    val resta: Int = numeroUno - numeroDos
    val multi: Int = numeroUno * numeroDos
    val divi: Float = (numeroUno / numeroDos).toFloat()
    val modulo: Double = (numeroUno % numeroDos).toDouble()

    println("El resultado de la suma es de $suma")
    println("El resultado de la resta es de $resta")
    println("El resultado de la multiplicacion es de $multi")
    println("El resultado de la division es de $divi")
    println("El resultado del modulo es de $modulo ")
}