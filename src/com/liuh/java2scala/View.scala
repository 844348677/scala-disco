package com.liuh.java2scala

/**
  * Created by liuh on 2016/2/26.
  */
trait View {
  def render(model : Map[String,List[String]]) : String
}

class FuctionView(viewRender : (Map[String,List[String]]) => String) extends View{
  override def render(model: Map[String, List[String]]): String =
    try
      viewRender(model)
    catch {
      case e: Exception => ""
    }
}
