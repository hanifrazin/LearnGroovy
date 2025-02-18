package keywords

// Buat Map
def user = [
        "name": "Hanif",
        "age" : 30,
        "city": "Tangsel"
]

// Akses Map
println user["name"]
println user.city

// tambah elemen ke map
user.education = 'College'
println user

// Looping Map
user.each {key,value -> println "$key: $value"}
