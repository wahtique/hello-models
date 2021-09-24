import org.junit.Test
import org.junit.Assert.*
import dev.wahtique.helloworld.HelloMessage

class Test1:
  @Test def t1(): Unit =
    val message = HelloMessage("Hello", from = "Computer", to = "User")
    assertEquals(message.message, "Hello")
