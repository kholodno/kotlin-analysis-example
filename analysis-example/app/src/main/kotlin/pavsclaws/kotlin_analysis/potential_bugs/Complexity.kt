package pavsclaws.kotlin_analysis.potential_bugs

import android.util.Log
import pavsclaws.kotlin_analysis.doSomething
import java.util.Collections.swap

fun longMethod() {
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
    doSomething()
}

fun longparameterlist(a: Any, b: Int, c: Boolean, d: Int, e: Int, f: String) {

}

class LargeClass() {
    val a = 1
    val b = 2

    fun cccc(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun cc1cc(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun c1ccc(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun ccc3c(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun sdfcccc(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun svsdv(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun ccasdasdcc(){
        if (a >b) {
            Log.e("a","a")
        }
    }

    fun ccdfgdfgcc(){
        if (a >b) {
            Log.e("a","a")
        }
    }
}
