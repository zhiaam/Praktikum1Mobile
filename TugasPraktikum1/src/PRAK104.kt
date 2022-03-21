class PRAK104 {
    val jenis:String="Motor"
    val merk:String= "Honda"
    val status:Boolean=true
    val plat:String= "DA 1234 AB"
    val tahun:Int=2022

    fun nyala(){
        if(status.equals(true)){
            println("$jenis dengan merk $merk dalam keadaan hidup")
        } else {
            println("$jenis dengan merk $merk dalam keadaan mati")
        }
    }

    fun data(){
        println("$jenis dengan plat $plat dibeli pada tahun $tahun")
    }


}

fun main() {
    val myRide = PRAK104()
    myRide.nyala()
    myRide.data()
}