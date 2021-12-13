fun main() {
    val numeros = duplica(arrayOf(arrayOf(2, 5), arrayOf(99), arrayOf(3, 4)))

    println(numeros.contentDeepToString())
}


fun getArray2DDeInteiros(): Array<Array<Int>> {
    return arrayOf(arrayOf(2, 5), arrayOf(7, 1), arrayOf(3, 4))
}


fun duplica(matriz: Array<Array<Int>>): Array<Array<Int>> {
    val result = Array(matriz.size) { Array(1) { 0 } } // initial dummy array of array

    for (linha in 0 until matriz.size) {
        result[linha] = Array(matriz[linha].size) { 0 }
        for (coluna in 0 until matriz[linha].size) {
            result[linha][coluna] = matriz[linha][coluna]
        }
    }

    return result
}


fun contaZeros(numeros: Array<Array<Int>>): Int {
    return -1
}


fun contaParesIguais(pares: Array<Array<Pair<Int,Int>>>): Int {
    return -1
}


fun converteParaString(matriz: Array<Array<String>>): String {
    return ""
}
