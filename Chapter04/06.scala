import java.util.Calendar._

val days = scala.collection.mutable.LinkedHashMap(
	"MONDAY" -> MONDAY,
	"TUESDAY" -> TUESDAY,
	"WEDNESDAY" -> WEDNESDAY,
	"THURSDAY" -> THURSDAY,
	"FRIDAY" -> FRIDAY,
	"SATURDAY" -> SATURDAY,
	"SUNDAY" -> SUNDAY
)

for ( (k, v) <- days ) printf("%s=%d\n", k, v)