package datatypes

class StringTesting {

    static void main(String[] args) {
        stringTest()
    }

    private static void stringTest() {
        def val = 3
        println val.class

        String cardName = "visa"

        println "value is $val"
        println 'value is $val'
        println """
            line 1
            line 2
            ${cardName.substring(0,2)}
        """
    }
}
