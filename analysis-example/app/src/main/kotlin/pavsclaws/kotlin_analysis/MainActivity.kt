package pavsclaws.kotlin_analysis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pavsclaws.kotlin_analysis.code_sheets.multiply
import pavsclaws.kotlin_analysis.code_sheets.plus

class MainActivity : AppCompatActivity() {

    private val a: Int = 3
    private val b: Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus(a, b)

        multiply(a, b)
    }
}
