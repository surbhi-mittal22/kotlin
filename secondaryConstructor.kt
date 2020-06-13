class Person{
    var firstName :String
    var LastName : String
     
     constructor(firstName :String,LastName : String)
     {
         this.firstName=firstName
         this.LastName=LastName
     }
     fun greeting(){
         println("Hello ${firstName} ${LastName} , welcome to intershala trainings!")
     }
}
 fun main()
 {
     var per = Person("Surbhi","Mittal")
      per.greeting()
      
 }