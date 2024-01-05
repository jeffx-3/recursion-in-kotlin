fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

// Example usage
val result = factorial(5)
println("Factorial of 5 is: $result")
