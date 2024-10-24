@main
// "name" inidicates an expected CLI argument since this function is marked with @main
def hello(name: String): Unit =
  println(s"Hello, $name!") // "s" indicates interpolated string