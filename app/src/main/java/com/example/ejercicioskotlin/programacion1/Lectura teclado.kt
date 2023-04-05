package com.example.ejercicioskotlin.programacion1

fun main(){
    print("Ingrese un numero: ")
    val numero: Int = readln().toInt()
    println("El numero ingresado es $numero \n")

    print("Ingrese un caracter: ")
    val numeroDos: Int = readln().toInt()
    println("El caracter ingresado es $numeroDos \n")

    val suma = numero + numeroDos
    print("El total de la suma es de $suma")
}