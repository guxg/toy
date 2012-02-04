package name.guxg

object HelloWorld{
  def main(args:Array[String]){
    // create a new instance
    new HelloWorld().delegate("hello,scala class companion feature")
  }
  def proxy(arg:String){
    println(arg)
  }
}

class HelloWorld{
  def delegate(arg:String){
    // Calling global static method
    HelloWorld.proxy(arg);
  }
}
// vim: set ts=4 sw=4 et:
