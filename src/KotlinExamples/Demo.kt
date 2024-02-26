package KotlinExamples

import kotlin.math.max

class Demo {
}

fun main(){
    val msg = "Hello world"
    println(msg)
    val tEmp = Employee("abc",12,true)
    println(tEmp.age)
    val answer = sum(6,7)
    println(answer)
    val maxOf = maxVal(9,19)
    println(maxOf)
    stringConcat()
}

fun sum(a:Int, b:Int):Int{
    return a+b;
}

fun maxVal(a:Int,b:Int):Int{
    return if(a>b){
        a
    }
    else{
        b
    }
}

fun stringConcat(){
    val numberOfDogs = 3
    val numberOfCats = 4
    println("I have $numberOfDogs dogs and $numberOfCats cats")
}