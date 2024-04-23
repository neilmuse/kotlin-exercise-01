fun factorial(n: Int): Long {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    for (i in 2 .. (n / 2)) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}

fun reverseString(str: String): String {
    return str.reversed()
}

fun findMaxElement(array: IntArray): Int {
    var max = array[0]
    for (element in array) {
        if (element > max) {
            max = element
        }
    }
    return max
}

fun fibonacci(n: Int): Int {
    if (n == 1) {
        return 0
    }

    val fibonacciSequence = mutableListOf(0, 1)

    while (fibonacciSequence.size < n) {
        fibonacciSequence.add(fibonacciSequence[fibonacciSequence.size - 1] + fibonacciSequence[fibonacciSequence.size - 2])
    }

    return fibonacciSequence[n - 1]
}

fun isPalindrome(str: String): Boolean {
    return str.lowercase() == str.lowercase().reversed()
}

fun sumOfDigits(n: Int): Int {
    var number = n
    var sum = 0

    while (number != 0) {
        sum += number % 10
        number /= 10
    }

    return sum
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return gcd(b, a % b)
    }
}

fun countVowels(str: String): Int {
    val vowels = "aeiou"
    var count = 0

    for (char in str.lowercase()) {
        if (char in vowels) {
            count += 1
        }
    }
    return count
}

fun celsiusToFahrenheit(temperature: Double): Double {
    return ((temperature * 9) / 5) + 32
}

fun main() {
    println(factorial(4))
    println(isPrime(17))
    println(reverseString("nasabayabasan"))
    println(findMaxElement(intArrayOf(1, 3, 1, 0, 5)))
    println(fibonacci(2))
    println(isPalindrome("racecar"))
    println(sumOfDigits(12345))
    println(gcd(10, 30))
    println(countVowels("Crisneil Musa"))
    println(celsiusToFahrenheit(33.0))
}
