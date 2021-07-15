fun main(args: Array<String>) 
{
    val num = args[0].toInt()
    
    printFizzBuzz(num)
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