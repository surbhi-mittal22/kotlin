class Car(var brandName : String, var engineNumber : Int, var color:String)
{
    fun accelerate()
    {
        println("Car is speeding up. Zoom!")
    }
    fun applyBrakes(){
        println("Brakes applied!!! Screetch!")
    }
}

fun main(){
    
    // Create objects here
    var c1=Car("maruti",2342,"red")
      c1.accelerate()
      c1.applyBrakes()
    
    var c2 = Car("honda",7786,"black")
      c2.accelerate()
      c2.applyBrakes()
    
    
    
}