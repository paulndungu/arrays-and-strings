import java.util.HashMap

fun main(){

    var hashmap= HashMap<Int,String>()
    hashmap.put(1,"The day is sunny")
    hashmap.put(2,"The day is bright")
    hashmap.put(3,"We are all happy")
    hashmap.put(4,"So it time to celebrate")
    println(hashmap)
    println(hashmap.get(1))

    println("------------------------------------------------")
    for(items in hashmap.keys){
        println(hashmap.get(items))
    }

    println("------------------------------------------------")
//    the simplest way to change the keys and strings
    hashmap.put(4, "so its time to rejoice")
    for(items in hashmap.keys){
        println(hashmap.get(items))
    }

}