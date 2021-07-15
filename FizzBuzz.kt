fun main() 
{
    val range: IntRange = 1..100
    val len = range.toList().size
    
    printFizzBuzz(len)
}

fun printFizzBuzz (max: Int) 
{
    for (cnt in 1..max) 
    	print("${convertFizzBuzz(cnt)} ")
}

fun convertFizzBuzz (printNumber: Int): String = 
    if (printNumber%15 == 0) {
        "FizzBuzz"
    } else if (printNumber%3 == 0) {
        "Fizz"
    } else if (printNumber%5 == 0) {
        "Buzz"
    } else {
        printNumber.toString()
    }