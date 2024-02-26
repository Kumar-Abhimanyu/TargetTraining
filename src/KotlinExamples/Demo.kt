package KotlinExamples

import kotlin.math.max

class Demo {
}

/*
Methods can be created using equals operator and don't require curly braces all the time
Eg : fun sum(a:Int, b:Int): Int = a+b
Saves up lines of code
 */

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
    println(2.times(3))

    val pets = arrayOf("dog","cat")
    for(pet in pets){
        print(pet+" ")
    }

    printMessageWithPrefix("hello","log")
    printMessageWithPrefix(prefix = "log", message = "hello")
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

fun printMessageWithPrefix(message:String,prefix:String = "Info"){
    println("[$prefix] $message")
}


//The question mark is used to check safety of the null values - Prevents operations from happening if value is null
fun nulltest(){
}