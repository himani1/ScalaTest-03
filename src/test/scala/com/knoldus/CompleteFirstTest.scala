package com.knoldus

import org.scalatest.FunSuite
import scala.concurrent.Await
import scala.concurrent.duration._

class CompleteFirstTest extends FunSuite{

  val obj=new CompleteFirst()

  test("Checking the first completed future returned"){
    val li=List(2,3,5,4)
    val res=obj.factorial(li)
    val first=obj.findFirstFuture(res)
    val output=Await.result(first,10.second)
    assert(output==120||output==6||output==2||output==24)
  }


}
