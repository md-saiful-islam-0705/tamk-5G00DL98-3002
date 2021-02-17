class Circle(val radius: Int, color :String ) {

    constructor(radius: Int) : this(radius, color = "")   {
        
    }

    fun printSurfaceArea() {

       //constant value pi: 3.141592653589793
        val area: Double = Math.PI * radius * radius

        println("The surface area of the circle : $area")
    }

    fun attributesToStrings(color: String) {


        println ("radius=$radius,color=$color")
    }
}
fun main (){
    val c=Circle(5,"red")
   

    println(c.radius)
    c.printSurfaceArea()
    println(c.attributesToStrings(color = "red"))
    
}
