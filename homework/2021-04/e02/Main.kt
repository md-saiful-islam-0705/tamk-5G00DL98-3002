open class Person( var name: String){

    open fun sleep () {
        println("$name sleeps") }
    open fun drink() {
        println("$name drinks water")
    }
    override fun toString (): String {
        var name = println("name=jack")
        return name.toString()
    }
 }
 class Programmer(name:String, salary:Int):Person(name) {
 
    override fun drink() {
         println("$name drinks energy water")
    }
    override fun sleep() {
         println("$name sleeps")
    }
    fun codeApps (){
         println("$name code apps")
    }
 
    override fun toString (): String {
         var x = println("name=$name,salary=4000")
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
 
 
 
 
 
 
 
 
 
 