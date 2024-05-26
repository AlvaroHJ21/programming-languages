// Creacion de un map

const map = new Map();

map.set("name", "Alvaro");
map.set("age", 25);
map.set("isAlive", true);
map.set("address", new Map().set("city", "Lima").set("country", "Perú"));

console.log(map);

//Acceder a un valor
console.log(map.get("name"));
console.log(map.get("address").get("country"));

//Agregar un nuevo valor
map.set("lastName", "Huaysara");

//Claves
console.log(map.keys());
for (let key of map.keys()) {
  console.log(key);
}

//Valores
console.log(map.values());
for (let value of map.values()) {
  console.log(value);
}

//Items / Entries
console.log(map.entries());
for (let [key, value] of map.entries()) {
  console.log(`Para la clave ${key} se tiene el valor ${value}`);
}

// Adicional Objetos literales
const mapLiteral: any = {
  name: "Alvaro",
  age: 25,
  address: {
    city: "Lima",
    country: "Perú",
  },
};

console.log(mapLiteral);
console.log(mapLiteral.name);
console.log(mapLiteral.address.country);
console.log(mapLiteral["address"]["country"]);

mapLiteral["lastName"] = "Huaysara";

console.log(Object.keys(mapLiteral));
for (let key of Object.keys(mapLiteral)) {
  console.log(key);
}

console.log(Object.values(mapLiteral));
for (let value of Object.values(mapLiteral)) {
  console.log(value);
}

console.log(Object.entries(mapLiteral));
for (let [key, value] of Object.entries(mapLiteral)) {
  console.log(`Para la clave ${key} se tiene el valor ${value}`);
}
