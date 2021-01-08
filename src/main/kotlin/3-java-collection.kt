import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashSet

val allStudent: List<Student> = LinkedList(students)

fun newStudent(student: Student) =
    (allStudent as MutableList).add(student) // unsafe !

val examQueue: Queue<Student> = LinkedList(allStudent.subList(0,3))

fun main(){
    println(examQueue)
    println(examQueue.poll())
    println(examQueue)
    println(examQueue.offer(students[4]))
    println(examQueue)
}

val arrayList = ArrayList<Int>()

val treeMap = TreeMap<Int, Int>()
val hashMap = HashMap<Int, Int>()
val linkedHashMap = LinkedHashMap<Int, Int>()


val treeSet = TreeSet<Int>()
val hashSet = HashSet<Int>()
val linkedHashSet = LinkedHashSet<Int>()

