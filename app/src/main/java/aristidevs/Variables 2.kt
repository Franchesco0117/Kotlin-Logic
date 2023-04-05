package aristidevs

fun main(){
    //Operaciones aritmeticas
    val a = 10
    val b = 5
    print("Suma: ")
    println(a + b)
    print("Resta: ")
    println(a - b)
    print("Multiplicación: ")
    println(a * b)
    print("División: ")
    println(a / b)
    print("El módulo (resto): ")
    println(a % b)

    operacionesFloatInt()
}

fun operacionesFloatInt(){
    // En el caso de usar un Float y un Int, no tendriamos problema alguno
    val a = 10.5f
    val b = 5
    val resultadoInt: Int
    print("Suma: ")
    val resultado = a + b
    print(resultado)
    // Solamente funciona porqe no asignamos al valor "resultado" un tipo de variable, en este caso por ejemplo int

    //Ahora, si hacemos esto, no podra funcionar
    //Esto no funciona
    print("Suma: ")
    //resultadoInt =  a + b marcara un error

    //Para solucionar esto, podremos asignar la variable float a un tipo Interger usando .toInt
    print("Suma: ")
    val resultadoDos =  a.toInt() + b
    print (resultadoDos)
}

//Concatenacion
fun concatenation(){
    //Para hacer la concatenacion solo usaremos el signo de $
    //Hacer esto es como hacer lo siguiente en C++
    // cout << greeting << " " << name;

    val greeting = "Hola, me llamo"
    val name = "Francisco"

    println("$greeting $name")

    //Tambien podemos hacer operaciones pero creo que se ve algo confuso y feo
    val introduction = "El resultado de la cosa"
    val plus = "más"
    val firstNumber = 2
    val secondNumber = 5
    println("$introduction $firstNumber $plus $secondNumber es: ${firstNumber + secondNumber}")


}