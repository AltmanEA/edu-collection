fun <T> Iterator<T>.str(): String {
    var out = "["
    while (hasNext())
        out += next().toString() + "; "
    return out.dropLast(2) + "]"
}

val math = Course(
    "Math",
    listOf(0, 1, 2).map { students[it] }
)
val phys = Course(
    "Phys",
    listOf(0, 1, 3).map { students[it] }
)
val chem = Course(
    "Chem",
    listOf(0, 5).map { students[it] }
)
val courses = listOf(math, phys, chem)

val studyingStudent = courses.flatMap { it.students }

val studyingStudentSet: Set<Student> = courses.flatMapTo(HashSet()) { it.students }

val otherStudent = students - studyingStudentSet

val newGrades: Map<String, Int> = mapOf(
    "Sheldon" to 5,
    "Leonard" to 4,
    "Howard" to 4,
    "Raj" to 3
)



