package pavsclaws.kotlin_analysis.potential_bugs

import pavsclaws.kotlin_analysis.Animals
import pavsclaws.kotlin_analysis.Person

fun duplicateCaseInWhenExpression(animal: Animals) = when (animal) {
    Animals.Cat -> "cat"
    Animals.Bird -> "dog"
    Animals.Cow -> "cow"
    Animals.Cat -> "kitten"
    else -> {}
}

fun equalsWithHashCodeExist(): Boolean {
    val person1 = Person("qqq", "qqq")
    val person2 = Person("qqq", "ttt")
    return person1.hashCode() === person2.hashCode()
}

fun explicitGarbageCollectionCall() {
    System.gc()
}
