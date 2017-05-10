import java.lang.System._

val user = getProperty("user.name")
val password = Console.readLine("password:")

//Note that you will an error on the 'else' if attempting to run with windows REPL
if (password != "secret")
	err.println("Invalid password!")
else
	println("Welcome %s!".format(user))
