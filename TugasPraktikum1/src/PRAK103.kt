import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    print("Input bilangan = ")
    var nilaiMasuk = read.nextInt()
    var i:Int=0
    val nilaiTetap = nilaiMasuk

    do{
        nilaiMasuk=nilaiMasuk+nilaiTetap
        var nilaiDummy=nilaiMasuk
        if((nilaiDummy%2==0) || (nilaiDummy%3==0)){
            print(nilaiMasuk)
            print(" ")
            i++
        }
        else{
            continue
        }
    }while(i < 5)

}