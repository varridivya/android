fun main(args: Array<String>){  
    var mutableListInt: MutableList<Int> = mutableListOf<Int>()  
    var mutableListString: MutableList<String> = mutableListOf<String>()  
    var mutableListAny: MutableList<Any> = mutableListOf<Any>()  
  
    mutableListInt.add(5)  
    mutableListInt.add(7)  
    mutableListInt.add(10)  
    mutableListInt.add(2,15)
  
    mutableListString.add("Ajeet")  
    mutableListString.add("Ashu")  
    mutableListString.add("Mohan")  
  
    mutableListAny.add("Sunil")  
    mutableListAny.add(2)  
    mutableListAny.add(5)  
    mutableListAny.add("Raj")  
    
    for(element in mutableListInt){  
        println(element)  
    }  
   
    for(element in mutableListString){  
        println(element)  
    }  

    for(element in mutableListAny){  
        println(element)  
    }  
}  
