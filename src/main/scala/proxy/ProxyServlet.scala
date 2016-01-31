package proxy

import org.scalatra.ScalatraServlet

/**
  * Created by salim on 30/01/2016.
  */
class ProxyServlet extends ScalatraServlet {

  get("/") {
    "<html><body><p>Hello World</p></body></html>"

  }

}
