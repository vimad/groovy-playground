package closure

class memoization {

    static void main(String[] args) {
        def fib
        fib = {it < 2 ? 1 : fib(it-1) + fib(it-2)}
        fib = fib.memoize()

        println fib(40)
    }
}
