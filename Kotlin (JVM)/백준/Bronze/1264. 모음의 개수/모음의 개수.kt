fun main() {
    var test1 = arrayOf('a', 'e', 'i', 'o', 'u','A','E','I','O','U')
    while (true) {
        var input = readLine() ?: break
        if (input == "#") break
        var count = 0

        for (i in input) {
            if (i in test1){
                count++
            }
        }
        println(count)
    }
}