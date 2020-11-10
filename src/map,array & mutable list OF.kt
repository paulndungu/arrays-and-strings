fun main(){

    var map= hashMapOf  (1 to "how", 2 to "to" , 3 to "balance" , 4 to "your", 5 to "workflow")
    map.put(6,"in kotlin")
    println(map[5])

    var array= arrayListOf(1,"two",3,"four",5)
    array.add(6,"six" )
    println(array[0])
    println(array[3])
    var list= listOf(1,"two",3,"four")
    println(list)
    /*the values of items in a list are immutable meaning they are unchangable
    to change them you use mutablelistof(........)
     */
    var mutablelist= mutableListOf(1,"two",3,"four")
    mutablelist[1]=2
    println(mutablelist)

}