import scala.math._
import scala.io.StdIn.{readLine, readInt}
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaPractice{
  def main(args: Array[String]): Unit = {

//    val eventList =
//      for{i <- 1 to 20
//          if(i%2) == 0
//      } yield i

//    for (i <- eventList) println(i)

//    for (i <- 1 to 10; j <- 20 to 30){
//      println("i: "  + i)
//      println("j: " + j)
//    }


//    def printPrimes(): Unit ={
//      val primeList = List(1,2,3,5,7,11)
//      for(i <- primeList){
//        if(i ==11) return
//        if(i != 1) println(i)
//      }
//    }
//
//    printPrimes()

//      var numberGuess =0
//      do{
//        print("Guess number ")
//        numberGuess = readLine.toInt
//      }while(numberGuess != 15)
//
//    printf("you guessed %d \n", 15)

/*    val name = "Omid"
    val age = 26
    val weight = 70.4

    println(s"Hello $name")
    println(f"I am $age and weight $weight%.3f")
    printf("'%5d'\n", 5)
    printf("'%-5d'\n", 5)
    printf("'%.5f'\n", 3.14)

    val randSent = "I saw a dragon fly by"
    println("dragon starts at index " + randSent.indexOf("dragon"))

    val randSentArray = randSent.toArray
    for (v <- randSentArray) println(v)*/

    def funcName(first: String, second:String): String ={
      return first+second
    }




  }

}