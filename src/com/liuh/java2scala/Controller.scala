package com.liuh.java2scala

/**
  * Created by liuh on 2016/2/26.
  */
trait Controller {
 def handleRequest(httpRequest: HttpRequest) : HttpResponse
}

class FucntionController(view : View ,doRequest : (HttpRequest) => Map[String,List[String]]) extends Controller {
  override def handleRequest(request: HttpRequest): HttpResponse =
    try{
      val model = doRequest(request)
      val responseBody = view.render(model)
      HttpResponse(responseBody,200)

    }catch {
      //case e : ControllerException => HttpResponse("",e.getS)
      case e : Exception =>HttpResponse("",500)
    }
}
