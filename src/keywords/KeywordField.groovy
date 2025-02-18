package keywords

import groovy.transform.Field

@Field String message = "Hello, Groovy"

def sayMessage(){
    println message
}

sayMessage()

//String pesan = "Halo, Sayang"
//
//def sayPesan(){
//    println pesan
//}

//sayPesan()

