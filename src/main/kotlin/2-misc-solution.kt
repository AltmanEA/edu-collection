import java.util.*

fun <T> Iterable<T>.countBy(value: Int, selector: (T) -> Int): Int {
    var count = 0
    for (element in this)
        if (selector(element) == value)
            count++
    return count
}

val gradesHist =
    grades
        .mapTo(TreeSet()) { it.value }
        .associate { value ->
            value to grades.countBy(value) { it.value }
        }

fun main(){
    println(gradesHist)
}