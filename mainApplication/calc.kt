fun main() {
    
    
    println("Greetings! I hope you enjoy this simple calculator :) ")
    
    var num1: Float? = 10f
	var num2: Float? = 6f
            
    if (num2 != null){
        
        fun Int.calc():Float?{
        
            return when(this){

                1 -> num1?.plus(num2)
                2 -> num1?.minus(num2)
                3 -> num1?.times(num2)
                4 -> num1?.div(num2)
                else -> null

            }
        }
                
        fun Int.operationSelected():String{
            
            return when(this){
                
                1 -> "The result of this addition is: "
                2 -> "The result of this subtraction is: "
                3 -> "The result of this multiplication is: "
                4 -> "The result of this division is: "                     
                else -> "Invalid"   
                
            }
            
        }
        println("")
        val operatorNumber = (1..4).random()
        println(operatorNumber.operationSelected() + operatorNumber.calc())
                        
    }else {
        
        println("Um dos valores é nulo.")
        
    }   
    
}