import kotlin.system.exitProcess

fun main(){

    var arraylist= ArrayList<String>()
    arraylist.add("This")
    arraylist.add("is")
    arraylist.add("gonna")
    arraylist.add("a")
    arraylist.add("wonderful")
    arraylist.add("day.")

    println("First word: "+arraylist.get(0))
//    OR
    println("First word: "+arraylist[0])

    println("All words:")
    for (items in arraylist){
        println(items)
    }
    println("-------------------------------------------")
    arraylist.add("This")
    arraylist.add("is")
    arraylist.add("gonna")
    arraylist.add("be")
    arraylist.add("a")
    arraylist.add("beautiful")
    arraylist.add("day.")

    println("First word: "+arraylist.get(0))
//    OR
    println("First word: "+arraylist[0])
    arraylist.set(0,"This day is sunny and")

    println("All words:")
    for (items in arraylist){
        println(items)
    }
    println("---------------elements by index---------------")
    for (list in 0..arraylist.size-1){
        println(arraylist.get(list))
    }
    println("---------------elements by index---------------")
//    this is how to search for a certain element

    if (arraylist.contains("wonderful")){
        println("wonderful means good")
    }else{
        println("beautiful")
    }

}