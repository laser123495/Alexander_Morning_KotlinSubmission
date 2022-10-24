package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String? = "alex"
    val lastName: String? = "Simanungkalit"
    val age: Int? = 19
    var single = true
    var tidakSingle = false

    println("hello my name is $firstName $lastName")
    println("i am $age years old")
    println("my current status is single = $single")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: Int = 6, groupMember: List<Any> = arrayListOf<String>("alex","andre","anjas","ferry","zidan"), session: String = "Morning"): Any {

    println("GroupId = $groupId")
    println("groupMember = $groupMember")
    println("session = $session")
    return arrayOf(groupId, groupMember, session)

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val anggota = arrayOf<String>("alex", "andre", "anjas", "ferry", "Zidan")
    return anggota[0]
}


/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    return 9

}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(6, listOf("alex", "andre", "anjas", "ferry", "zidan"), "Morning")

}