// lab

val studentIndexes = students.mapIndexed { index, _ -> index }
val studentWithIndexes = studentIndexes.zip(students)
val studentsString = studentWithIndexes.joinToString {
    "${it.first}  - ${it.second}"
}

fun main(){
    println(studentIndexes)
    println(studentWithIndexes)
    println(studentsString)
}