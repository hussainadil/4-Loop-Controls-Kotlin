// Simple NestedFor loop
fun main (args:Array<String>){
    for (a in 1..3){
      println("Outer Loop"+a)
        for (b in 1..3){
            println("Inner Loop"+b)
        } // inner loop end
    }// outer loop end
}