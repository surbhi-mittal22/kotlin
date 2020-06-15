open class Car(val brandName: String, val color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
  
   // Create function maxSpeed() here
   open fun maxSpeed(){
   println("I can tell the max speed")
       
   }
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Car(brandName, color) {
   // override maxSpeed() here
   override fun maxSpeed()
   {
       println("hyundai  max speed is 120kmph")
   }
}

class Honda(brandName: String = "Honda", color: String = "White") : Car(brandName, color) {
      // override maxSpeed() here
      override fun maxSpeed(){
          println("honda  max speed is 150 kmph")
      }
}

fun main(){
   val hyundai = Hyundai()
   hyundai.maxSpeed()

   val honda = Honda()
   honda.maxSpeed()
}