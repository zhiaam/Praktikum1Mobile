import java.util.Scanner

fun main() {
    val read =Scanner(System.`in`)

    print("Nilai x = ")
    var nilaiMasuk = read.nextInt()

    val hasil:Int = (2*(nilaiMasuk*nilaiMasuk))+(5*nilaiMasuk)-8

    println(hasil)
}