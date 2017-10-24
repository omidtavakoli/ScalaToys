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

//    def funcName(first: String, second:String): String ={
//       first+second
//    }
//
//    def getSum(num1: Int =1, num2: Int = 1) : Int ={
//       num1+num2
//    }
//
//    println("5+4: " + getSum(5,4))
//    println("12+13: " + getSum(num2 = 12, num1 = 13))
//    println("hi omid : " + funcName("hi "," omid"))

//    def multiInput(args : Int*) : Int = {
//      var sum : Int = 0
//      for(num <- args){
//        sum+= num
//      }
//      sum
//    }
//
//    println("get sum " + multiInput(1,4,7,12,4,76,43,2,2,5,6))

//    def factoriel (num : BigInt) : BigInt = {
//      if(num <=1) 1
//      else num*factoriel(num-1)
//    }

//    val friends2 = ArrayBuffer[String]()
//    friends2.insert(0, "phil")
//    friends2 += "Mark"
//    friends2 ++= ArrayBuffer("Omid", "Akbar")
//    friends2.insert(1, "Mike", "hooshi")
//    var friend : String = ""
//    for(friend <- friends2) println(friend)
//
//    val favNumTimes = for(num <- friend) yield 2*num
//    var favNumDiv = for(num <- favNumTimes if num % 4 == 0) yield num
//    friends2.foreach(println)

//      var multTable = Array.ofDim[Int](10,10)
//
//    for(i <- 0 to 9){
//      for(j <- 0 to 9){
//        multTable(i)(j) = i*j
//      }
//    }
//
//    for(i <- 0 to 9){
//      for(j <- 0 to 9){
//        printf("%d : %d = %d\n", i, j, multTable(i)(j))
//      }
//    }


//    val employee = Map("Manager" -> "Omid", "Age" -> "26")
//    if(employee.contains("Manager")) printf("Manager is %s", employee("Manager"))
//
//    val customers = collection.mutable.Map(100 -> "Ali", 101 -> "akbar")
//    customers(102) = "anoosh"
//
//    for((k,v) <- customers) printf("%d : %s", k, v)


//    var tupleMerge = (103, "Merge Simpson", 10.25)
//    printf(tupleMerge._2)
//    tupleMerge.productIterator.foreach(i => println(i))


//    val rover = new Animal()
//    rover.setName("Rover")
//    rover.setSound("Woof")
//    printf("%s says %s \n", rover.getName(), rover.getSound())
//
//    val whiskers = new Animal("Wiskers", "hooow")
//    printf(s"${whiskers.id}")
//
//
//    val spike = new Dog("spike", "woof", "grrrr")
//    spike.setName("spike")


//    val log10func = log10 _
//    println(log10func(1000))
//    List(1000.0, 1000000.0).map(log10func).foreach(println)
//    List(1,2,3,4,5,6).map((x:Int) => x*50).foreach(println)
//    List(1,2,3,4,5,6).filter(_ %2 == 0 ).foreach(println)
//
//    def multIt(func : (Int) => Double, num : Int) = {
//      func(num)
//    }
//
//    def times3(num : Int) = num * 3
//    printf("3 * 100 = %.1f\n", multIt(times3, 100))

//    val writer = new PrintWriter("test.txt")
//    writer.write("adfwsadeefwdevwevv")
//    writer.close()
//
//    val textFromFile = Source.fromFile("test.txt", "UTF-8")
//    val lineIterator = textFromFile.getLines()
//    for (line <- lineIterator)
//      println(line)
//
//    textFromFile.close()

    def divideNums(num1:Int, num2:Int) = try
    {
      (num1/num2)
    }catch {
      case ex:java.lang.ArithmeticException => "cant divide by zero"
    }finally {

    }

    println("3/0=" + divideNums(3,0))


  }


  class Animal (var name:String, var sound:String){
    this.setName(name)
    val id = Animal.newIdNum

    def getName() : String = name
    def getSound() : String = sound
    def setName(name : String): Unit ={
      if(!name.matches(".*\\d+.*"))
        this.name = name
      else
        this.name = "No Name"
    }

    def setSound(sound : String): Unit ={
      this.sound = sound
    }

    def this(name:String){
      this("No Name", " No Sound")
      this.setName(name)
    }

    def this(){
      this("No Name", " No Sound")
    }

    object Animal {
       var id_num = 0
       def newIdNum = {id_num +=1 ; id_num}

    }

  }

  class Dog(name: String, sound:String, growl:String) extends Animal(name, sound){
    def this(name:String, sound:String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this(name:String){
      this("no name", "no sound", "no growl")
      this.setName(name)
    }

    def this(){
      this("no name", "no sound", "no growl")
    }

  }




}