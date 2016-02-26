package com.liuh.java2scala

/**
  * Created by liuh on 2016/2/26.
  */
case class HttpRequest(header : Map[String,String],body:String,path:String)
case class HttpResponse(body:String,responseCode:Integer)
