import java.util.Scanner

fun main(){
    val read =Scanner(System.`in`)

    print("Waktu Sekarang: ")
    val waktuMasuk = readLine()
    print("Nama Anda: ")
    val namaMasuk = readLine()
    print("Umur Anda: ")
    val umurMasuk = read.nextInt()
    print("Suhu Tubuh Anda: ")
    val suhuMasuk = read.nextFloat()
//    Untuk Random
//    val suhuMasuk:Float = (35..37).random().toFloat()
//    println(suhuMasuk)

    println("Selamat $waktuMasuk, $namaMasuk. Umur anda $umurMasuk.")
    println("")
    println("Suhu tubuh anda $suhuMasuk derajat Celcius")
}