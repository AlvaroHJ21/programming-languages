fun main() {

    //Declaración - inmutable
    val set = setOf("a", "e", "i", "o", "u", "o", "u", "u")

    //Declaracion mutable
    val setMutable = mutableSetOf<Int>(1, 2, 3, 4, 5, 6, 4, 23, 4, 2, 2, 3, 4, 4)

    //Agregar
    setMutable.add(20)
    setMutable.add(20)
    setMutable.add(20)
    setMutable.add(20)
    setMutable.add(23)

    //Eliminar
    setMutable.remove(23)

    //Obtener primer valor
    val first = setMutable.first { it > 4 }
    //val first = setMutable.firstOrNull { it > 4 }

    println(first)
    println(setMutable)

}