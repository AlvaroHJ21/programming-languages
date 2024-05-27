package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Tipo de dato para no devolver nada -> Unit


    println("Hola Mundo".randomCaseExtension())
//    println(randomCase("Hola Mundo"))


    //Parámetros nombrados
    greet("Alvaro", "Huaysara")
    greet(name = "Alvaro", lastName = "Huaysara")

    //Parámetro por defecto
    greet("Alvaro", lastName = "Huaysara")

    //Lambdas
    val myLambda: (Int, String) -> Int = { id, it ->
        it.length
    }

    val words = listOf("Hola", "Mundo", "Xd")
    val lenghts = words.map { myLambda(1, it) }
//    val lenghts = words.map(myLambda) //1 parametro

    println(myLambda(1, "Hola"))
    println(lenghts)


    // Funciones de alto orden
    superFunction("123", block = { it.length })
    superFunction("123") { it.length }

    // Funcion que retorna funcion
    println(functionInception("Alvaro")(1))
}

// Parámetros simple
fun greet(name: String, lastName: String): String {
    return "Hola $name $lastName"
}

fun greetOptional(name: String, secondName: String = "", lastName: String): String {
    return "Hola $name $secondName $lastName"
}


fun randomCase(frase: String): String {
    val random = (0..99).random()
    return if (random.rem(2) == 0) frase.uppercase() else frase.lowercase()
//    return if (random % 2 == 0) frase.toUpperCase() else frase.toLowerCase()
}

// Funciones de extensión
fun String.randomCaseExtension(): String {
    val random = (0..99).random()
    return if (random.rem(2) == 0) this.uppercase() else this.lowercase()
//    return if (random % 2 == 0) frase.toUpperCase() else frase.toLowerCase()
}

// Funcion de alto orden
fun superFunction(value: String, block: (String) -> Int): Int {
    return block(value)
}

fun functionInception(name: String): (Int) -> String {
    return {
        "Hola desde la lambda $name. $it"
    }
}