package com.knoldus

import org.scalatest.FunSuite

class EmployeeTest extends FunSuite {

  test("Employee : Sorting two objects of type Employee") {

    val li = List(Employee(1, "himani", 25666), Employee(2, "sarita", 15000), Employee(3, "heena", 40000))
    val sortResult = li.sorted(EmployeeOrdering)
    assert(sortResult==List(Employee(2,"sarita",15000),Employee(1,"himani",25666),Employee(3,"heena",40000)))
  }

  test("Employee : Empty list is given"){
    val li=List()
    val res=li.sorted(EmployeeOrdering)
    assert(res==List())
  }

}
