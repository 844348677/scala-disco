package com.liuh

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object JavaAndScala {
  
  val command = ArrayBuffer("ls","-al","/home/cay")
  val pb = new ProcessBuilder(command)
  
  val cmd : Buffer[String] = pb.command()
  
}