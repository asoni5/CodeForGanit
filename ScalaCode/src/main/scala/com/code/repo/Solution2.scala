package com.code.repo

object Solution2 {
  def doStringStuff(getString: String){
    var new_String=""
    for(k<-0 until (getString.length()/2))
    {
      print(new_String.concat(getString.charAt(k).toString()))
      print(new_String.concat((getString.charAt(getString.length()-1-k)).toString()))
    }
    if(getString.length() %2 !=0)
    {
       print(new_String.concat((getString.charAt(getString.length()/2).toString())))
    }
  }
  def main(args: Array[String]): Unit = {
    Solution2.doStringStuff("123456")
    println()
    Solution2.doStringStuff("12345")
  }
}