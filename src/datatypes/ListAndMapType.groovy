package datatypes

class ListAndMapType {


    static void main(String[] args) {
        def list = [1, 2, 3, ["str1", "str2"]]
        println "${list[3][0]}"

        def cards = ["visa", "amex", "master"]
        cards.each { println "In each $it"}
        cards.size().times {if (it == 0) println "In times ${cards[it]}"}
        cards.eachWithIndex { String entry, int i -> println "entry $entry index $i"}

        println "---------------------------------------"
        def map = ["val1": 1, "val2": 2, "val3": "val"]
        println map.get("val1")
        println map.get("val3")

        map["val4"] = 2.5
        println map["val4"]

        println "val2" in map
    }

}
