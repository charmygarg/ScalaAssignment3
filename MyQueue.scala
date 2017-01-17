package com.knoldus.assignment

trait TraitQueue 
{
  var list : List[Int] = List()
  def enqueue (x: Int)
  def dequeue (): Int = {
  		//println(list)
  		list = list.slice(1,list.length)
	}
} 
 class DoubleQueue extends TraitQueue  // Class for doubling the element
{
 	override def enqueue(x: Int)  = { 
		list = list :+ (2 * x)
 	}
	
}
 class SquareQueue extends TraitQueue // Class for squaring the element
{
 	override def enqueue(x:Int) = {
		list = list :+ (x * x)	
		}
}
object MyQueue extends App
{
	val dObj = new DoubleQueue()
	val sObj = new SquareQueue()
	dObj.enqueue(12)
	dObj.enqueue(2)
	dObj.enqueue(132)
	sObj.enqueue(30)
	sObj.enqueue(33)
	sObj.enqueue(20)
	println(dObj.list)
	println(sObj.list)
	dObj.dequeue()
      	println(dObj.list)
	sObj.dequeue()
      	println(sObj.list)
	//dObj.display()
}

