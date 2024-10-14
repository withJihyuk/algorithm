fun main() {
    var a = readLine()
    var count = a?.toInt()
    for(i in 1..count!!) {
        for (x in 1..(count - i)) {
            print(" ")
        }
        for (y in 1..i) {
            print("*")
        }
        println("")
    }

}