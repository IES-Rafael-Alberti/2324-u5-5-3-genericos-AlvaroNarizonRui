fun main(args: Array<String>) {
    val numbers = listOf("one","two","three","four")
    val numbersRev = reverse(numbers)
    if (listOf("four","three","two","one") != numbersRev){
        println("Error")
    } else{
        println("Correcto")
    }
    println(numbersRev)
}