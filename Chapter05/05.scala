import scala.reflect.BeanProperty

class Student(@BeanProperty var Name: String, @BeanProperty var id: Long)

# scalac 05.scala
# javap -private Student