package com.liuh

import scala.collection.JavaConversions.mapAsJavaMap
import scala.collection.JavaConversions.propertiesAsScalaMap
import java.util.TreeMap
import java.lang.String

object MapAndTuple {
  def main(args: Array[String]): Unit = {
    val scores = Map("Alice" -> 10 ,"Bob" -> 3 ,"Cindy" -> 8)
    
    val scores1 = scala.collection.mutable.Map("Alice"->10,
        "Bob" -> 3, "Cindy" -> 8)
        
    val scores2 = new scala.collection.mutable.HashMap[String,Int]
    // "Alice" -> 10 等价于 ("Alice",10)
    
    val bobsScore = scores("Bob")
    
    val bobsScore1 = if(scores.contains("Bob")) scores("Bob") else 0
    
    val bobsScore2 = scores.getOrElse("Bob", 0)
    
    scores1("Bob") = 10
    scores1("Fred") = 7
    
    scores1 += ("Bob" -> 10 , "Fred" -> 7)
    
    scores1 -= "Alice"
    
    val newScore = scores + ("Bob" -> 10, "Fred" -> 7)
    
    for( (k,v) <- scores1) println(k+" "+v)
    
    scores1.keySet
    for( v <- scores.values) println(v)
    
    for( (k,v) <- scores1) yield (v,k) //
    
    val scoresTree = scala.collection.immutable.SortedMap("Alice" -> 10,
        "Fred" -> 7 , "Bob" -> 3 , "Cindy" -> 8)
        
        
    val months = scala.collection.mutable.LinkedHashMap("January" -> 1,
        "February" -> 2, "March" -> 3, "Apirl" -> 4,"May" -> 5)
        
    //val scores5 : scala.collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]
        
    val props : scala.collection.Map[String,String] = System.getProperties()
        
    println(props)
    
    (1,3.14,"Fred")
    
    //Tuple3[Int,Double,java.lang.String]
    //(Int,Double,java.lang.String)
    
    val t = (1,3.14,"Fred")
    val second = t._2
    val first = t _1
    
    val (first1,second2,third) = t 
    
    val doubleValue = "New York".partition(_.isUpper)
    
    println(doubleValue)
    
    val symbols = Array("<","-",">")
    val counts = Array(2,10,2)
    val pairs = symbols.zip(counts)
    
    for((s,n) <-pairs) print(s*n)
    
    
  }
}