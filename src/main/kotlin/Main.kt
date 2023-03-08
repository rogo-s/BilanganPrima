import java.util.Scanner

class BilanganPrima(private val angka: Int) {

    fun isPrima(): Boolean {
        if (angka <= 1) {
            return false
        }

        for (i in 2 until angka) {
            if (angka % i == 0) {
                return false
            }
        }

        return true
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan angka: ")
    val angka = scanner.nextInt()

    val bilanganPrima = BilanganPrima(angka)

    if (bilanganPrima.isPrima()) {
        println("$angka adalah bilangan prima")
    } else {
        println("$angka bukan bilangan prima")
    }
}
//Penjelasan Code Program Sedang saya kerjakan
