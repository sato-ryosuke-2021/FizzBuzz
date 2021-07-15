val list = listOf<Int>(7, 17, 27, 37, 47, 57, 67, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 87, 97)

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
    if (printNumber in list) {
        "GitHub"
    } else if (printNumber%15 == 0) {
        "FizzBuzz"
    } else if (printNumber%3 == 0) {
        "Fizz"
    } else if (printNumber%5 == 0) {
        "Buzz"
    } else {
        printNumber.toString()
    }