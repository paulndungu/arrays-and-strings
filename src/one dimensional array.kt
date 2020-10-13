fun main(){

    var arraystring=Array<String>(3){"This is the first input"}
    println("Arraystring3 is: "+arraystring[2])

    println("All outcomes")
    for (outcomes in arraystring){
        println(outcomes)
    }
    for (words in 0..1){
        println("the first two sentences are: "+arraystring[words])
    }

//    -----------------------------------------------------------------------
    var sentence=Array<String>(5){""}
    for (words in 0..4){
        println("The word [$words] is: ")
        sentence[words]= readLine()!!
        /*for (words in 0..5){
            println("The words: $words" + sentence[words])
        }*/
    }
    for (words in 0..5) {
        println("The word [$words] is:" +sentence[words])
    }
}