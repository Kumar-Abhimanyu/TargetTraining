package KotlinExamples

class Functions {
}

fun drive(speed:String  = "fast"){
    println("Driving $speed")
}

fun main(){
    //    drive()
    //    drive("slow")
    //    drive("Too fast")
    //    tempToday("Monday",24)

    //Lambda Function
    var dirtLevel = 20
    var waterFilter = {level:Int -> level/3}
    println(waterFilter(dirtLevel))

    //List Filters
    val list = listOf(1,2,3,4)
    print(list.filter { it>1 })
}

fun tempToday(day:String, temp:Int){
    println("Today is $day and it is $temp degrees")
}

