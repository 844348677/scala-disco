package com.liuh

import scala.collection.mutable.ArrayBuffer

object NewEx {
    def main(args:Array[String]){
    val greetings = List("hi!","hola","aloha")
    greetings.map(println(_))
   // greetings map print()
    
    
    val someInts = List(1,2,3)
    
    
    
    val  addOneFunction = (num : Int) => num + 1
    
    def addOneMethod(num : Int) : Int = num +1    
    
    someInts map addOneFunction
    
    someInts map addOneMethod
    
    Array(1,7,2,9).sum
    
    println(ArrayBuffer("Marry","had","a","little","lamb").max)
    
    val b = ArrayBuffer(1,7,2,9)
    //val bSorted = b.sorted(_ < _)
    
    val a = Array(1,7,2,9)
    scala.util.Sorting.quickSort(a)
    
    val matrix = Array.ofDim[Double](3,4)
    
    //matrix(row)(column) = 42
    
    val triangle = new Array[Array[Int]](10)
    for( i <- 0 until triangle.length)
      triangle(i) = new Array[Int](i+1)
    
  }

}