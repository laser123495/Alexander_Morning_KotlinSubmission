package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.Exception

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val nama: String? = null
    lateinit var tidakbolehnull: String
    println("nama saya $nama")
    try {
        tidakbolehnull = nama!!
        println(tidakbolehnull)
    } 
    catch (e: Exception) {
        tidakbolehnull = "variabel nama tidak boleh kosong/null !"
        println(tidakbolehnull)
    }


}