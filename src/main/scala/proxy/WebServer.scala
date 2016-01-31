package proxy

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler

object WebServer extends App{
    val server:Server = new Server(8082)

    val megaproxyServlet:ProxyServlet = new ProxyServlet()

    server.set

  server.start()
    server.join()
}
