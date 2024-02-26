package KotlinExamples

class Demo {
}

fun main(){
    val msg = "Hello world"
    println(msg)
    val tEmp = Employee("abc",12,true)
    println(tEmp.age)
    val answer = sum(6,7)
    println(answer)
}

fun sum(a:Int, b:Int):Int{
    return a+b;
}