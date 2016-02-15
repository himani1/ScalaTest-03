package com.knoldus


case class Employee(id:Int,name:String,salary:Int)

object EmployeeOrdering extends Ordering[Employee]{

  override def compare(first: Employee, second: Employee): Int = {

    if(first.salary<second.salary) -1
    else if(first.salary>second.salary) 1
    else 0

  }
}
