package com.knoldus

import scala.concurrent.{Promise, Future}
import scala.concurrent.ExecutionContext.Implicits.global

class CompleteFirst {

  def fact(num : Int) : Future[Int] = Future{
    def findFact(num : Int):Int={
      if(num == 1 || num == 0)
        1
      else
        num * findFact(num-1)
    }
    findFact(num)
  }

  def factorial(list:List[Int] ) : List[Future[Int]]={
    val res = list map{ elem => fact(elem)}
    res
  }

  def findFirstFuture(li:List[Future[Int]]):Future[Int]={

    val prom=Promise[Int]
    li.foreach(_.onComplete{case value=>prom.complete(value)})
    prom.future
  }
}
