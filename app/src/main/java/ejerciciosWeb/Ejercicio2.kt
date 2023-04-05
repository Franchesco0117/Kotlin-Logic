package ejerciciosWeb

/*
* Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
* Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.*/
fun main(){
    print("Ingrese el primer numero: ")
    val numeroUno: Int = readln().toInt()

    print("Ingrese el segundo numero: ")
    val numeroDos: Int = readln().toInt()

    if(numeroUno > numeroDos){
        print("El numero uno es mayor que el numero dos")
    } else if(numeroDos > numeroUno){
        print("El numero dos es mayor que el numero uno")
    } else {
        print("Los numeros son iguales")
    }
}