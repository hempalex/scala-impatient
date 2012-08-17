def unless(condition: => Boolean)(block: => Unit) { if (!condition) { block } }

unless (0 > 1) { println("Unless!") }