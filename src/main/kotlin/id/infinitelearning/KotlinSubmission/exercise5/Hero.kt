package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = "alexander"
    private var age = 19
    private var height = 170

    private var health = 10

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        checkHealth()
        health -= 1
        println("$name sedang berjalan...health -1...health sekarang = $health")
    }
    fun lari() {
        checkHealth()
        health -= 2
        println("$name sedang berlari...health -2...health sekarang = $health")
    }
    fun makan() {
        checkHealth()
        health += 2
        println("$name sedang makan...health +2...health sekarang = $health")
    }
    fun minum() {
        checkHealth()
        health += 2
        println("$name sedang minum...health +2...health sekarang = $health")
    }
    fun lompat() {
        checkHealth()
        health -= 2
        println("$name sedang lompat...health -2...health sekarang = $health")
    }
    fun duduk() {
        checkHealth()
        health += 1
        println("$name sedang duduk...health +1...health sekarang = $health")
    }

    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */


}