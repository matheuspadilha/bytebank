package teste

fun testRepeticao() {
    for (i in 1..5) {
        println(i)
    }

    for (i in 5 downTo 1) {
        if (i == 4) break
        if (i == 3) continue
        println(i)
    }

    for (i in 5 downTo 1 step 2) {
        if (i == 4) break
        if (i == 3) continue
        println(i)
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

    var i = 0
    while (i < 5) {
        val titular = "Matheus"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i
        saldo = 100 + 2.0 + i
        saldo += 200 + i

        println("titular $titular")
        println("conta $numeroConta")
        println("saldo $saldo")
        i++
    }
}