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
    print(waterFilter(dirtLevel))
}

fun tempToday(day:String, temp:Int){
    println("Today is $day and it is $temp degrees")
}

