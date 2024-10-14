fun main() {
    var a = readLine()
    var b = readLine()
    var c = readLine()

    if (a != null && b != null && c != null) {
        println(a.toInt() + b.toInt() - c.toInt())
        println((a+b).toInt() - c.toInt())
    }
}