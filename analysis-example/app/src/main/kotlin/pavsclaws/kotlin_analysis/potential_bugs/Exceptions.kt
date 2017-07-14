package pavsclaws.kotlin_analysis.potential_bugs

class CustomException : UnsupportedOperationException("test")
class CustomExceptionOne : UnsupportedOperationException("test")
class CustomExceptionTwo : UnsupportedOperationException("test")

fun throwException() {
    try {
        throw CustomException()
    } catch (e: Exception) {
        when (e) {
            is CustomException -> { }
            is CustomExceptionTwo -> "qqqqqq"
        }
    }
}
