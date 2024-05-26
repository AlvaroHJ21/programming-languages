fun main(args: Array<String>) {
    //Declaración (Inmutable)
    val map = mapOf(
        "name" to "Alvaro",
        "age" to 20,
        "address" to mapOf(
            "street" to "Calle 123",
            "city" to "Lima",
            "country" to "Perú"
        )
    );

    //Declaración (Mutable)
    val mutableMap: MutableMap<String, Any> = mutableMapOf(
        "name" to "Alvaro",
        "age" to 20,
        "address" to mutableMapOf<String, String>(
            "street" to "Calle 123",
            "city" to "Lima",
            "country" to "Perú"
        )
    );

    println(map);
    println(mutableMap);

    //Agregar
    mutableMap["lastName"] = "Huaysara"

    //Acceso
    println(mutableMap["name"])
    println((mutableMap["address"] as Map<*, *>)["city"])

    //Claves
    println(mutableMap.keys)
    for (key in mutableMap.keys) {
        println(key)
    }

    //Valores
    println(mutableMap.values)
    for (value in mutableMap.values) {
        println(value)
    }

    //Items / Entries
    println(mutableMap.entries)
    for ((key, value) in mutableMap.entries) {
        println("Para la clave $key se tiene el valor $value")
    }
}