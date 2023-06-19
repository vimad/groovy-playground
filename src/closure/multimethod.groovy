package closure

class multimethod {

    void doSomething(int a) {
        println "val is $a"
    }

    void doSomething(String a) {
        println "val is $a"
    }

    void doSomething(List a) {
        println "val is $a"
    }

    static void main(String[] args) {
        def m = new multimethod()
        def method = m.&doSomething

        method.call(1)
        method.call("str")
        method.call([1,2,3])
    }

}
