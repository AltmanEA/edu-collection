class Grade(
    val student: Student,
    val value: Int
){
    override fun toString() = "$student - $value"
}