package keywords

def num = "100" as Integer // Mengubah String ke Integer
println num + 50

def strNumber = "100.50"
def floatNumber = strNumber as BigDecimal
assert floatNumber == 100.58

println floatNumber + 0.50