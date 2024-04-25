package utilities

fun factorial(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
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
    return if (b == 0) {
        a
    } else {
        gcd(b, a % b)
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
