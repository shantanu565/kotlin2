import java.util.*

fun main(){

    val s= Scanner(System.`in`)

    print("Enter marks of student: ")
    val marks= s.nextInt()

    println("Grade for $marks is ${checkGrade(marks)}")

    s.close()
}

fun checkGrade(marks: Int): String {
    return when(marks) {
        in 50..60-> "Good"
        in 60..70-> "Very Good"
        in 70..80-> "Excellent"
        in 80..100-> "Rockstar"
        else-> "Invalid Case"
    }
}