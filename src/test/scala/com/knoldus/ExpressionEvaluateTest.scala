package com.knoldus
import org.scalatest.FunSuite

class ExpressionEvaluateTest extends FunSuite{
  val obj=new ExpressionEvaluate

  test("Splitting the input into numbers and operators")
  {
    obj.expression(List("1","2","+","3","*","6"))
    assert(obj.num==List(6,3,2,1)&&obj.operators==List("*","+"))
  }

}
