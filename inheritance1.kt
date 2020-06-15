open class Car(var brandName:String , var color : String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
}

class Hyundai(brandName:String,color:String) : Car(brandName,color) {

}

class Honda(brandName:String,color:String) : Car(brandName,color) {

}

fun main(){
   val hyundai = Hyundai("hyundai","Black")
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda("honda","white")
   honda.speedUp()
   honda.applyBrakes()
}