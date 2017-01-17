class FirstName(val fname: String) extends AnyVal {
override def toString() = fname
}
class LastName(val lname: String) extends AnyVal {
override def toString() = lname
}
class Age(val age: Int) extends AnyVal {
override def toString() = " " + age
}

class DisplayDetails()  {
def display(f : FirstName, l : LastName , a : Age) {
		println(f.fname + " " + l.lname + " is of " + a.age + " years old") }
}

object DisplayDetails extends App {
	val d = new DisplayDetails()
	val fnameObj = new FirstName("Prashant")
	val lnameObj = new LastName("Goel")
	val ageObj = new Age(24)

	d.display(fnameObj,lnameObj,ageObj)
}
