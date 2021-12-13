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
        fail("TODO")
    }


    @Test(timeout = 500)
    fun test_04_contaParesIguais() {
        fail("TODO")
    }


    @Test(timeout = 500)
    fun test_05_converteParaString() {
        fail("TODO")
    }

}
