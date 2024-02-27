package Lamdas

class Lamdas {
}

fun main(){
    val uppercase1 = {str:String -> str.uppercase()}
    println(uppercase1("hello"))
    val uppercase2 : (String)->String = {it.uppercase()}
    println(uppercase2("hello"))
    val calResult = calculate(4,5){a,b->a*b}
    println(calResult)
    val sumResult = calculate(5,6, ::sum)
    println(sumResult)
}

fun sum(x:Int, y:Int) = x+y;

fun calculate(
        x:Int,
        y:Int,
        operation: (Int,Int)->Int):Int{
    return operation(x,y)
}