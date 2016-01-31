package proxy

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext

object WebServer extends App {
  val server: Server = new Server(8082)
  val context = new WebAppContext()

  context.setContextPath("/")
  val lifecycleListener = new ScalatraBootstrap()
  context.addEventListener(lifecycleListener)



  server.addLifeCycleListener(lifecycleListener.)

  server.start()
  server.join()
}
