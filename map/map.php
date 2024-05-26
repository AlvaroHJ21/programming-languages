<?php

// Declaracion ded un map (array asociativo)
$map = array(
    "name" => "Alvaro",
    "age" => 25,
    "isAlive" => true,
    "address" => array(
        "street" => "Calle 123",
        "city" => "Lima",
        "country" => "Perú"
    ),
);

$map = [
    "name" => "Alvaro",
    "age" => 25,
    "isAlive" => true,
    "address" => [
        "street" => "Calle 123",
        "city" => "Lima",
        "country" => "Perú"
    ],
];

// Agregar
$map["lastName"] = "Huaysara";

// Acceso
print_r($map["name"]);
print_r($map["address"]["city"]);

// Claves
print_r(array_keys($map));
foreach (array_keys($map) as $key) {
    print_r($key);
}

// Valores
print_r(array_values($map));
foreach (array_values($map) as $value) {
    print_r($value);
}

// Items
print_r(array_map(null, array_keys($map), array_values($map)));
foreach (array_map(null, array_keys($map), array_values($map)) as [$key, $value]) {
    print_r("Para la clave $key se tiene el valor $value\n");
}
