package keywords

// Membuat List
def fruits = ['Apple', 'Banana', 'Cherry']

// Akses elemen
println fruits[0]
println fruits[-1]

// Tambah item ke list
fruits << "Duren"
println fruits

// Looping list
fruits.each {fruit -> println "Buah: $fruit"}

