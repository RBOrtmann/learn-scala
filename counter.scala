//> using scala 3.5.2
//> using dep "com.lihaoyi::os-lib:0.11.3"

@main
def countFiles(): Unit =
  // os.pwd -> gets current working directory
  // os.list -> returns a sequence of paths directly within the directory passed as an argument
  val paths = os.list(os.pwd)
  println(paths.length)