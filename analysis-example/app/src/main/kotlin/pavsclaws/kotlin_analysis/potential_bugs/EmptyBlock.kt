package pavsclaws.kotlin_analysis.potential_bugs

fun emptyBlock() {

    val a = true
    if (a) {

    } else {
        doNothing()
    }
}

fun doNothing(){}
