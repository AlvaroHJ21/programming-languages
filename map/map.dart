void main(List<String> args) {
  // Declaración
  final Map<String, dynamic> map = {
    "name": "Alvaro",
    "age": 25,
    "isStudent": true,
    "address": {"street": "Main Street", "city": "Lima", "country": "Peru"}
  };

  print(map);

  //Agregar
  map["lastName"] = "Huaysara";

  //Acceso
  print(map["name"]);
  print(map["address"]["city"]);

  //Claves
  print(map.keys);
  for (var key in map.keys) {
    print(key);
  }

  //Valores
  print(map.values);
  for (var value in map.values) {
    print(value);
  }

  //Items / Entries
  print(map.entries);
  for (var entry in map.entries) { //? no hay destructuring en dart
    // print(entry);
    print("Para la clave ${entry.key} se tiene el valor ${entry.value}");
  }
}
