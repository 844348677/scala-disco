package com.liuh

import scala.math.BigInt
import scala.math._
import java.net.URL
//import com.sun.org.apache.xml.internal.serializer.utils.URI.MalformedURIException
import scala.collection.mutable.ArrayBuffer

object TestStringOps {
  def main(args:Array[String]){
    val str ="Hello".intersect("world")
    println(str)
    99.4.toInt
    "99".toInt
    val x:BigInt = 111111111
    print(x*x*x*x)

    sqrt(2)
    pow(2,4)
    //min(3,pi)
    
    val randomInt = BigInt.probablePrime(100, scala.util.Random)
    println(randomInt)
    println("helloa".distinct)
    "hello"(4)
    "hello".apply(4)
    
    val s = if(x>0) 1 else -1
    //if(x>0) ss=1 else ss=-1
    val ss = if(x>0) "string" else 1
    if(x>0) 1 else ()
    
    val distance = { 
      val x0 = 0
      val y0 = 0
      val y = 1
      val x = 1
      val dx : Double = x - x0
      val dy : Double = y - y0
      sqrt(dx * dx + dy * dy)
    }
    
    val name = readLine("Your name: ")
    print("Your age : ")
    
    for( i <- 1 to 10){
      
    }
    
/*    val sss = "hello"
    var sum1 = 0;
    for( i<- 0 util sss.length()){
      sum1 += sss(i)
    }*/
    
    for( ch <- "hello" ){
      
    }
    
    for(i<-1 to 3;j <- 1 to 3) print((10*i+j)+" ")
    
    for(i <- 1 to 3; from = 4 - i;j <- from to 3) print((10 * i + j) + " ")
    
    for( i<- 1 to 10) yield i % 3
    
    for( c <- "Hello" ; i <- 0 to 1 ) yield (c+i).toChar
    
    for( i <- 0 to 1 ; c <- "Hello" ) yield (c + i).toChar
    
    val ssss = sum(1,3,5,6,7,4)
    
    val sssss = sum(1 to 5 : _*)
    
    lazy val words = scala.io.Source.fromFile("data/test.txt").mkString
    
    val xx = 0
    if( xx >= 0){
      sqrt(xx)
    }else throw new IllegalArgumentException("aa")
    
/*    try{
      new URL("http://github.com/aaa")
    }catch{
      //case _: MalformedURIException => 
    }*/
    
    val nums = new Array[Int](10)
    
    val aString = new Array[String](10)
    val sString = Array("Hello","world")
    sString(0) = "Goodbye"
    
    val b = ArrayBuffer[Int]()
    b += 1
    b += (1,2,3)
    b ++= Array(8,13,21)
    b.trimEnd(5)
    b.insert(2,6)
    b.insert(2,7,8,9)
    b.remove(2)
    b.remove(2,3)
    b.toArray
    b.toBuffer
    
    
    (0 until b.length).reverse
    
    
    val a = ArrayBuffer(2,3,4,5,6)
    val resulta = for(elem <- a) yield 2 * elem
    
    for(elem <- a if elem % 2 == 0) yield 2 * elem
    
    a.filter(_ % 2 == 0 ).map(2*_)
    
    a.filter(_ % 2 == 0 ) map (2 * _)
    
    
    
    var first = true
    var n = a.length
    var i = 0
    while(i<n){
      if(a(i) >=0) i+=1
      else{
        if(first){first = false ;i+=1}
        else{a.remove(i);n-=1}
      }
    }
    
    
    //var first = true
    val indexes = for( i <- 0 until a.length if first || a(i) >=0) yield {
      if(a(i) <0 ) first = false ;i
    }
    for( j <- 0 until indexes.length) a(j) = a(indexes(j))
    a.trimEnd(a.length - indexes.length)
    
    var bb = ArrayBuffer(1,7,2,9)
    //val aSorted = bb.sorted( _ < _ ) ?????
    
    
  }
  
  def box(s: String) {
    var border = "-" * s.length() + "--\n"
    println(border + "|" + s + "|\n" + border)
  }
  
  def boxUnit(s: String): Unit = {
    
  }
  
  def recursiveSum(args : Int*) : Int = {
    if(args.length == 0) 0
    else args.head + recursiveSum(args.tail : _*)
  }
  
  def abs(x: Double) = if( x >= 0) x else -x
  
  def fac(n: Int) ={
    var r = 1
    for(i <- 1 to n) r= r* i
    r
  }
  
  def decorate(str: String,left:String ="[",right:String="]")= left + str+ right
  
  def sum(args : Int *) = {
    var result = 0 
    for(arg <- args ) result += arg
    result
  }
  
  
  //def patch [B >: Char ,That](from: Int,patch:GenSeq[B],replaced:Int)(implicit bf: CanBuildFrom[String,B,That):That
  //def patch(from:Int,that:GenSeq[Char],replaced:Int):StringOps[A]
}