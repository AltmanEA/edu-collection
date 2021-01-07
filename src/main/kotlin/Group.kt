class Group(
    val name: String,
    val students: List<Student>,
){
    override fun toString() = "$name $students"
}