fun main(args: Array<String>){  
    var intList: List<Int> = listOf<Int>(1,2,3)  
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash")  
    var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")  
     
    for(element in intList){  
        println(element)  
    }   
     
    for(element in stringList){  
        println(element)  
    }  

    for(element in anyList){  
        println(element)  
    }  
}  
