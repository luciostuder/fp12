import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.test.*


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTeacherFicha {


    @Test(timeout = 500)
    fun test_01_getArray2DDeInteiros() {
        val expected = arrayOf(arrayOf(2, 5), arrayOf(7, 1), arrayOf(3, 4))

        Assert.assertArrayEquals("Os arrays não são iguais!", expected, getArray2DDeInteiros())
    }


    @Test(timeout = 500)
    fun test_02_duplica() {
        val expected1 = arrayOf(arrayOf(1999, 2), arrayOf(3, 4), arrayOf(99, 42))

        assertFalse(expected1.contentEquals(duplica(expected1)), "Estás a devolver o mesmo array!")

        Assert.assertArrayEquals("Não duplicaste bem o array!", expected1, duplica(expected1))

        val expected2 = arrayOf(arrayOf(1), arrayOf(3), arrayOf(42))

        assertFalse(expected2.contentEquals(duplica(expected2)), "Estás a devolver o mesmo array!")

        Assert.assertArrayEquals("Não duplicaste bem o array!", expected2, duplica(expected2))

        val expected3 = arrayOf(arrayOf(1))

        assertFalse(expected3.contentEquals(duplica(expected3)), "Estás a devolver o mesmo array!")

        Assert.assertArrayEquals("Não duplicaste bem o array!", expected3, duplica(expected3))
    }


    @Test(timeout = 500)
    fun test_03_contaZeros() {
        val expected1 = arrayOf(arrayOf(1, 2), arrayOf(3, 4), arrayOf(99, 42))

        assertFalse((contaZeros(expected1) > 1), "Estás a incrementar quando não possui zero!")

        val expected2 = arrayOf(arrayOf(0, 2), arrayOf(3, 0), arrayOf(99, 42))

        assertFalse((contaZeros(expected2) < 0), "Não estás a incrementar quando possui zero!")

    }


    @Test(timeout = 500)
    fun test_04_contaParesIguais() {
        val expected1 = arrayOf(arrayOf(Pair(1, 2), Pair(2, 1)), arrayOf(Pair(6, 1), Pair(3, 1)), arrayOf(Pair(2, 0), Pair(4, 2)))


        assertFalse((contaParesIguais(expected1) > 1), "Estás a incrementar quando não possui pares!")

        val expected2 = arrayOf(arrayOf(Pair(10, 7), Pair(4, 1)), arrayOf(Pair(3, 4), Pair(3, 3)), arrayOf(Pair(7, 7), Pair(8, 2)))


        assertFalse((contaParesIguais(expected2) < 0), "Não estás a incrementar quando possui pares!")
    }


    @Test(timeout = 500)
    fun test_05_converteParaString() {
        val expected1 = arrayOf(arrayOf("a", "b"), arrayOf("c", "d"), arrayOf("e", "f"))

        assertFalse((converteParaString(expected1) == "a,b,\nc,d,\ne,f"), "Não estás a remover a vígula no final de cada linha!")

        val expected2 = arrayOf(arrayOf("a", "b"), arrayOf("c", "d"), arrayOf("e", "f"))

        assertFalse((converteParaString(expected2) == "a,b,c,d,e,f"), "Não estás a quebrar linha!")


    }

}
