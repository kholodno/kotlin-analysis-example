package pavsclaws.kotlin_analysis

enum class Animals { Cat, Dog, Bird, Cow, Horse }

data class Person(val name: String,
                  val secondName: String) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

fun doSomething() {
    val a = 1
    val b = 2
    a + b
    b * a
}
