data class Course(
    val name: String,
    val students: List<Student> = emptyList()
)