import java.util.*

val stack: Deque<Student> = LinkedList(allStudent.subList(0, 3))

val studentByGrade =
    TreeMap<Int, String>().apply {
        grades.map {
            merge(it.value, it.student.name) { s1, s2 -> "$s1, $s2" }
        }
    }


fun main() {
    println(stack)
    println(stack.push(students[4]))
    println(stack)
    println(stack.pop())
    println(stack)
    println(studentByGrade)
}