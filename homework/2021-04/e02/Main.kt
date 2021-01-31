open class Person(name: String){

    open fun sleep () {
        println("jack sleeps") }
    open fun drink() {
        println("jack drink water")
    }
    override fun toString (): String {
        var name = println("name=jack")
        return name.toString()
    }
 }
 class Programmer(name:String, salary:Int):Person(name) {
 
     override fun drink() {
         println("tina drinks energy water")
     }
     override fun sleep() {
         println("tina sleeps")
     }
 
     fun codeApps (){
         println("tina code apps")
     }
 
     override fun toString (): String {
         var x = println("name=tina,salary=4000")
         return x.toString()
 
     }
 
 }
 fun main () {
     val tina: Programmer = Programmer("tina", 4000)
     val jack:Person=Person("jack")
 
    
     println(tina.toString())
     tina.drink()
     tina.sleep()
     tina.codeApps()
     println(jack.toString())
     jack.drink()
     jack.sleep()
 }
 
 
 
 
 
 
 
 
 
 