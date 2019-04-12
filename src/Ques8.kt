import java.util.*

fun main(){
    val s= Scanner(System.`in`)
    print("Enter array of integers:")
    val mSet = s.nextLine().split(" ").toSet()

    println("Unique Elements:-")
    for (item in mSet)
        print("$item ")
    println()
    s.close()
}