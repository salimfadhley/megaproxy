/**
  * Created by salim on 30/01/2016.
  */
package proxy

import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class MegaProxy extends LifeCycle{

  override def init(context: ServletContext) {
    // Mount servlets.
    context.mount(new ProxyServlet, "/sample/*")
  }

  def shutdown():Unit = {

  }

}
