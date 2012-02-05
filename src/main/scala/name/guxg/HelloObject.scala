package name.guxg

class HelloObject{

  def hello(arg:String) {
    println(arg)
  }

}

object HelloObject extends HelloObject{

  def main(args:Array[String]):Unit = {
    hello("hello,scala object extends ...")
  }
}

// vim: set ts=4 sw=4 et:
