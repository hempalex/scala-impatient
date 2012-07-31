import java.lang.System._

val user = getProperty("user.name")
val password = Console.readLine("password:")

if (password != "secret")
	err.println("Invalid password!")
else
	println("Welcome %s!".format(user))