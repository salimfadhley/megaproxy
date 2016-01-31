import scala.concurrent.Future

val request: Req = url.apply("http://somesite.com")

val result: Future[String] =
  Http.apply(
    implyRequestHandlerTuple(request).OK[String](as.String)
  )(Defaults.executor)