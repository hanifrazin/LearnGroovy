package keywords

trait Speaker{
    void speak(){
        println "I can speak!"
    }
}

class Persons implements Speaker {}

def p = new Persons()
p.speak()
