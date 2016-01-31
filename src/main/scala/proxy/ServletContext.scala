package proxy
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

/**
  * Created by salim on 31/01/2016.
  */
class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    context.mount(new ProxyServlet(), "/*")
  }

}
