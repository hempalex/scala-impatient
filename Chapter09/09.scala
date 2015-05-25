import java.io.File
import scala.util.matching.Regex

def countMatchFiles(dir: File, pattern: Regex): Int = {
	val subdirs = dir.listFiles.filter(_.isDirectory)
	val fileNames = dir.listFiles.filter(!_.isDirectory).map(_.getName)

	subdirs.map(countMatchFiles(_, pattern)).sum +
		(for(f <- fileNames; s <- pattern findFirstIn f) yield s).size
}

println("Count of *.scala files: %d".format(countMatchFiles(new File("../"), "\\.scala$".r)))

// more elegant solution
def getFileTree(f: File): Stream[File] =
        f #:: (if (f.isDirectory) f.listFiles().toStream.flatMap(getFileTree) else Stream.empty)

println("More elegant solution: %d".format(getFileTree(new File("../")).filter(_.getName.endsWith(".scala")).size))


def classCount(dir : File) : Int = {
  dir.listFiles.count(_.getName.endsWith(".class")) + dir.listFiles.filter(_.isDirectory).map(classCount _).sum
}

println("Simpler solution: %d".format(classCount(new File("."))))
