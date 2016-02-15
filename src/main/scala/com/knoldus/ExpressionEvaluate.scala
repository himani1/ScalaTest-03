package com.knoldus

import scala.collection.mutable.Stack

class ExpressionEvaluate {

  val num:Stack[Int]=Stack()
  val operators:Stack[String]=Stack()

  def expression(li:List[String]):Any={

    li match{
      case head::tail=> val el=head
                                            if(el>="0" && el<="9") num.push(el.toInt) else operators.push(head)
                                            expression(tail)
      case List(t)=>val elem=t
                                          if(t>="0" && t<="9") num.push(elem.toInt) else operators.push(t)
      case Nil=> 0
    }

    /*val firstOp=operators.pop()
    val secondOp=operators.pop()

    if(operatorPrecedence(firstOp)>operatorPrecedence(secondOp))
      operators.push(secondOp)
      else
      operators.push(firstOp)

    val firstNum=num.pop()
    val secondNum=num.pop()
    */

  }

  def operatorPrecedence(op:String):Int={
    op match{
      case "*"=>4
      case "/"=>5
      case "+"=>2
      case "-"=>1
    }
  }

}
