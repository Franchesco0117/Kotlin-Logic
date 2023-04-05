package aristidevs

fun main(){
    //Para declarar variables existen 2 formas de 2 tipos de varaibles
    var numeroFavorito = 117
    val numeroFavoritoo = 343

    /**
     * como podemos observar, en kotlin existen las variables y los valores
     * los valores guardan datos que no pueden cambiar
     * las variables guardan datos que pueden cambiar
     */

    var elnumeroFavorito: Int = 117
    val elnumeroFavoritoo: Int = 343

    /**
     * Aparte de esto, Kotlin tiene un sistema que puede identificar el tipo de variable o valor
     * estas asignando
     *
     * por ejemplo si pones texto en comillas, Koltin entendera que es un String sin necesidad que
     * tu se lo digas o lo mismo si pones algun numero
     */
}

//Tipos de variables

fun interger(){
    //Usadas para asignar numeros, calcular tamaños y realizar operaciones matematicas en general
    /**
     * Interger: Estas variables utilizan numeros naturales con un limite de  -2,147,483,647 a 2,147,483,647
     */
    var numeroInterger: Int = -231

    /**
     * Long: Lo mismo que las Interger pero soporta un limite mayor de numeros, aunque por temas de
     * optimizacion pide mas recursos
     */
    var numeroLong: Long = 47483647

    /**
     * Float: Estas variables utilizan numeros decimales y siempre que la usemos debemos de poner una
     * f al final del numero
     */
    var numeroFloat: Float = 1.93f

    /**
     * Double: lo mismo que las Float pero soporta un limite mayor de decimales, aunque por temas de
     * optimizacion pide mas memoria o recursos, no necesita la f
     */
    var numeroDouble: Double = 1.932214124
}

fun alfanumericas(){
    //Utilizadas para guardar cadenas de texto o mezcla de caracteres
    /**
     * Char: nos permite guardar un caracter de cualquier tipo, es importante utilziar comillas simples
     */
    var numeroFavorito: Char = '1'
    var letraFavorita: Char = 'q'
    var caracterFavorito: Char = '@'

    /**
     * String: Lo mismo que char, pero aqui podemos añadir el texto que queramos
     */
    var textoString: String = "Mi número favorito es el 343"
    var test: String = "Test. 12345!·$%&/"
}

fun boleanas(){
    //Utilizados para verificar si algo es cierto o falso (true o false)
    var estoyTriste: Boolean = false
    var estoyFeliz: Boolean = true
}