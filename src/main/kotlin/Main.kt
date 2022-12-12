fun main() {
    val numeros = duplica(arrayOf(arrayOf(2, 5), arrayOf(99), arrayOf(3, 4)))

    println(numeros.contentDeepToString())

    val numZeros = contaZeros(arrayOf(arrayOf(2, 0), arrayOf(9, 9), arrayOf(0, 4)))
    println(numZeros)

    val pares: Array<Array<Pair<Int, Int>>> =
        arrayOf(arrayOf(Pair(1, 2), Pair(2, 1)), arrayOf(Pair(1, 1), Pair(3, 1)), arrayOf(Pair(2, 0), Pair(2, 2)))
    println(contaParesIguais(pares))

    val valuesString: Array<Array<String>> =
        arrayOf(arrayOf("a", "b"), arrayOf("c", "d"), arrayOf("e", "f"))

    println(converteParaString(valuesString))
}

fun getArray2DDeInteiros(): Array<Array<Int>> {
    return arrayOf(arrayOf(2, 5), arrayOf(7, 1), arrayOf(3, 4))
}


fun duplica(matriz: Array<Array<Int>>): Array<Array<Int>> {
    val result = Array(matriz.size) { Array(1) { 0 } } // initial dummy array of array

    for (linha in matriz.indices) {
        result[linha] = Array(matriz[linha].size) { 0 }
        for (coluna in 0 until matriz[linha].size) {
            result[linha][coluna] = matriz[linha][coluna]
        }
    }

    return result
}


fun contaZeros(numeros: Array<Array<Int>>): Int {
    var count = 0
    for (linha in numeros.indices) {
        for (coluna in 0 until numeros[linha].size) {
            if (numeros[linha][coluna] == 0) {
                count++
            }
        }
    }
    return count
}


fun contaParesIguais(pares: Array<Array<Pair<Int, Int>>>): Int {
    var result = 0
    for (pos in pares) {
        for (par in pos) {
            if (par.first == par.second) {
                result++
            }
        }
    }
    return result
}


fun converteParaString(matriz: Array<Array<String>>): String {
    var result = ""
    for (arr in matriz) {
        var linha = ""
        for (str in arr) {
            linha += "$str,"
        }
        linha = linha.substring(0, linha.length - 1) // tirar a ultima virgula
        result += linha + "\n"
    }
    return result
}


