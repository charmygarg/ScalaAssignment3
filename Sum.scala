class Sum { 
  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int = f(a, b) //high order sum function
} 
object Sum extends App { 
	val sumObj = new Sum() 
	val choice = "Ints" 
	choice match{ 
	case "Square" =>  
		println(sumObj.sum((x,y)=> (x * x) + (y * y), 5, 4 )) 
	case "Cube" => 
		println(sumObj.sum((x,y)=> (x * x * x) + (y * y * y), 5, 4 )) 
	case "Ints"=>  
		println(sumObj.sum((x,y)=> (x) + (y), 5, 4 )) 
} 
}

