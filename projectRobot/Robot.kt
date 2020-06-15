class Robot {
    fun ringAlarm(time:Int)
    {
        println("Ring the alrm at specified time")
    }

    fun makeCoffee(coffee:String,sugar:Int)
    {
        println("Make ${coffee} coffee everyday with $sugar tablespoon of sugar")
    }

    fun heatWater(temp:Double)
    {
        println("heat the water at $temp degree  for bath")
    }

       val timetable = listOf<String>("Android","JAVA","Javascript","compiler","AI")
    fun packBag(day:String)
    {
        when(day)
        {
            "monday" -> println("${day} timetable set ${timetable[0]}")
            "tuesday" -> println("${day} timetable set ${timetable[1]}")
            "wednesday" -> println("${day} timetable set ${timetable[2]}")
            "thrusday"  ->  println("${day} timetable set ${timetable[3]}")
            "friday" -> println("${day} timetable set ${timetable[4]}")
        }
    }


    var breakFast = listOf("Bread","Fruits","Oats","Milkshake")
    var lunch = listOf("Pulao","Chicken Tikka","Cobbler","black pudding")


    fun cookFood(shift : String)
    {
        if(shift == "breakfast")
        {
            println(breakFast.random())
        }
        else
        {
            println(lunch.random())
        }

    }

    fun ironClothes()
    {
        println("iron the clothes")
    }
}