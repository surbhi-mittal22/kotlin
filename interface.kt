interface Games{
    fun football()
    fun cricket()
    fun basketball()
}
 class Sports : Games{
     override fun football()
     {
         println("football is a sport")
     }
     override fun cricket()
     {
         println("cricket is a sport")
     }
     override fun basketball()
     {
         println("basketball is a sport")
     }
 }

fun main(){

    val sports = Sports()
    sports.football()
    sports.cricket()
    sports.basketball()
    
}