package keywords

class Person{
    String name

    void sayHello(){
        println "Hello, my name is $name"
    }
}

Person p = new Person()
p.name = "Alice"
p.sayHello()

