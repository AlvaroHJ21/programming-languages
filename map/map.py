# Declaracion de un map (Diccionario)

# Representacion de un objeto
map = {
    "name": "Alvaro",
    "age": 25,
    "isAlive": True,
    "address": {
        "street": "Calle 123",
        "city": "Lima",
        "country": "Perú"
    }
}
print(map)

# Agregar
map["lastName"] = "Huaysara"

# Acceder
print(map["name"])
print(map["address"]["city"])

# Clave valor
reporte_x_anios = {
    2019: 100,
    2020: 200,
    2021: 300
}

print(reporte_x_anios)

# Claves
print(map.keys())
for key in map.keys():
    print(key)

# Valores
print(map.values())
for value in map.values():
    print(value)

# Items / Entries
print(map.items())
for key, value in map.items():
    print(f"Para la clave {key} se tiene el valor {value}") 