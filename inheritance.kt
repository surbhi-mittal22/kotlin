open class Car(var engineNumber:Int,var color:String){
    
    fun speedUp(){
        println("speedUp the car")
    }
    fun applyBrake(){
        println("apply the brake")
    }
}
 class Honda(engineNumber:Int,color:String):Car(engineNumber,color){
     
 }
 class Maruti(engineNumber:Int,color:String):Car(engineNumber,color){
 }


fun main() {
    // create objects here and use their functions
    var honda =Honda(1798,"black")
      honda.speedUp()
      honda.applyBrake()
    var mar = Maruti(2678,"white")
        mar.speedUp()
        mar.applyBrake()
}