package main.test

import java.util

/**
  * Created by jinxf1 on 2018/3/30.
  */
class HelloWorld{

}
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("1111111")
    val str = HelloWorld
    println(str)
  }
}

object Hello extends App{
  if (args.length > 0)
    println(args(0))
}

object INT extends App{
  var sum = 1+2
  print(sum)
}

object S1_Greetings {
  def main(args: Array[String]) {
    for(i <- 1 to 3) {
      print(i + ", ")
    }
    println("Scala Rock!!!")
  }
}

object S1_GreetingsExclusiveUpper {
  def main(args: Array[String]) {
    for(i <- 1 until 3) {
      print(i + ", ")
    }

    println("Scala Rock!!!")
  }
}


object S1_GreetingsForEach {
  def main(args: Array[String]) {
    (1 to 3).foreach(i =>  print(i + ", "))

    println("Scala Rock!!!")
  }
}


object S2_ScalaInt {
  def main(args: Array[String]) {
    val capacity : Int = 10
    val list = new util.ArrayList[String]
    list.ensureCapacity(capacity)
  }
}


object S3_MultipleAssignment {
  def main(args: Array[String]) {
    def getPersionIngo(primaryKey : Int) = {
      ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
    }

    val (firstName, lastName, emailAddess) = getPersionIngo(1)

    println("First Name is " + firstName)
    println("Last Name is " + lastName)
    println("Email Address is " + emailAddess)

    val info = getPersionIngo(1)

    println("First Name is " + info._1)
    println("Last Name is " + info._2)
    println("Email Address is " + info._3)
  }
}



