import akka.actor.typed.ActorRef
case class Res(s: String,x: Int, a: ActorRef[String])

val x: ActorRef[String] => Res = Res("", 11, _)
val t:ActorRef[String] = ???
val res: Res = x(t)
