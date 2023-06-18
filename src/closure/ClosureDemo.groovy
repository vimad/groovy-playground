package closure

class ClosureDemo {

    static void main(String[] args) {
        def cards = ["Visa", "Master", "Amex"]

        for (i in 0..<cards.size()) {
            println "${cards[i]} in uppercase is ${cards[i].toUpperCase()}"
        }

        loop(cards) {"${it} in uppercase is ${it.toUpperCase()}"}
    }

    def static loop(cards, chunk) {
        for (i in 0..<cards.size()) {
            chunk(cards[i])
        }
    }

}
