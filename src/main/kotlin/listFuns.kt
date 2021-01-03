val boys: List<String> = listOf("Sheldon", "Leonard", "Howard", "Raj")
val girls: List<String> = listOf("Penny", "Amy", "Bernadette")

val students: List<Student> =
    (boys + girls)
        .map {
            Student(it)
        }

val groups: List<Group> = listOf(
    Group("Boys", students.filter { it.name in boys }),
    Group("Girls", students.filter { it.name in girls })
)

val grades: List<Grade> = listOf(
    "Sheldon" to 5,
    "Leonard" to 4,
    "Howard" to 4,
    "Raj" to 3
).map { grade: Pair<String, Int> ->
    Grade(students.find { it.name == grade.first }!!, grade.second)
}

val averageGrade = grades.fold(0, { acc, grade ->
    acc + grade.value
}) / grades.size