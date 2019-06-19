package com.code.repo

import com.google.gson.Gson

case class Temp(company:String,ceo:String,greetings:String)

object Solution1 {
  
  def doSome(input:String)
  {
    val n = input.split(",")
    val i = Temp(n(0), n(1), n(2))
    val gson = new Gson
    val JsonString = gson.toJson(i)
    println(JsonString)
  }
  def main(args: Array[String]): Unit = {
    
    println("Provide 3 user input in comma seprate way - ")
    val input =  scala.io.StdIn.readLine()
    
    println("provided input are " +input)
    
    Solution1.doSome(input)
  }
}