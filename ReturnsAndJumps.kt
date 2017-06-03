// returns and jumps
fun main (args:Array<String>){
    loop@ for (a in 1..3){

        println("Outer Loop"+a)
        for (b in 1..3){
            if(b==1){
                break@loop
            }
            println("Inner Loop"+b)

        } // inner loop end
    }// outer loop end
}