class Person(val name: String, val age: Int) extends Ordered[Person]{ //ordered trait program
def compare(that : Person) = {
	if(this.name == that.name)
		this.age - that.age 
	else
		this.name.length - that.name.length 
}
}
object Persons extends App{
	val personOne = new Person("Test", 24)
	val personTwo = new Person("Test", 25) 
	println( personOne < personTwo)
	val personThree = new Person("TestArgs", 25) 
	println( personOne < personThree)

}

