package com.example.ejercicioskotlin.programacion1

import kotlin.math.sqrt

fun main(){
    val valorS: Int

    print("Ingrese el valor de a: ")
    var valorA: Int = readln().toInt()

    print("Ingrese el valor de b: ")
    val valorB: Int = readln().toInt()

    print("Ingrse el valor de c: ")
    val valorC: Int = readln().toInt()

    valorS = (valorA + valorB + valorC)/2

    print("Semiperimetro: $valorS \n")

    //valorA = sqrt((valorS - valorA)(valorS - valorB)(valorS - valorC)).toInt()

    print("El area del triangulo es $valorA")
}
