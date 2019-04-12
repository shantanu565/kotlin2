import Person.Companion.age
import Person.Companion.firstName
import Person.Companion.lastName

class Person{
    companion object {
        const val firstName= "Rahul"
        const val lastName= "kumar"
        const val age= 20
    }

    var firstName: String= ""
    var lastName: String= ""
    var age: Int= 0

    init {
        firstName= "Rohan"
        lastName= "Kumar"
        age= 10
    }
}

fun main() {

    println("Details from Companion Object:- ")
    println("First Name: $firstName,Last Name: $lastName, Age: $age\n")

    val person = Person()
    println("Details from Init Block:- ")
    println("First Name: ${person.firstName},Last Name: ${person.lastName},Age: ${person.age}")
}