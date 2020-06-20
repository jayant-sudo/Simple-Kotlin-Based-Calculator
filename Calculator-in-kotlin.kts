import java.lang.Exception
import java.util.Scanner
import kotlin.system.exitProcess

val scanner = Scanner(System.`in`)
var first:Double = 0.0
var second:Double=0.0
fun main()
{
    println("************ Calculator *************")
    println("Press 1 to do Addition operation")
    println("Press 2 to do Subtraction operation")
    println("Press 3 to do Multiplication operation")
    println("Press 4 to do Division operation")
    println("Press 5 to do Modulus operation")
    println("Press 6 to do Exit")
    println()
    do {
        takeInput()
        println("Enter your choice(1-6)")
        var ch: Int = scanner.nextInt()
        when (ch) {

            1 ->
                addition().also {
                    println("The addition of $first and $second is $it")
            }

            2 ->
                subtraction().also { println("The Subtraction of $first and $second is $it") }

            3 ->
                multiplication().also { println("The Multiplication of $first and $second is $it") }
            4 ->
                division().also { println("The Division of $first and $second is $it") }

            5 -> modulus().also { println("The Modulus of $first and $second is $it") }

            6 -> exitProcess(0)

            else ->
                println("Invalid choice")
        }
    }while(true)
}

fun takeInput()
{
    try {
        println("Enter first number")
        first = scanner.nextDouble()
        println("Enter second number")
        second = scanner.nextDouble()
    }
    catch (e:Exception)
    {
       println("Please enter a valid number (it should be an integer , not character")
    }
}

fun addition():Double
{
        return (first + second)
}

fun subtraction():Double
{
    return (first - second)
}

fun multiplication():Double{
    return (first * second)
}

fun division():Double{
    return (first/second)
}
fun modulus():Double{
    return(first % second)
}
