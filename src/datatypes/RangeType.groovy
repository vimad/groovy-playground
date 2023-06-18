package datatypes

class RangeType {

    static void main(String[] args) {
        def range1 = 1..10
        def range2 = 1..<10

        println "size of range1 is ${range1.size()}"
        println "size of range2 is ${range1.size()}"

        def alpha = 'a'..'z'
        println "items ${alpha.subList(2,4)}"
        println "item ${alpha.get(0)}"
    }


}
