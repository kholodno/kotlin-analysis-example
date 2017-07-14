package pavsclaws.kotlin_analysis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pavsclaws.kotlin_analysis.potential_bugs.duplicateCaseInWhenExpression
import pavsclaws.kotlin_analysis.potential_bugs.throwException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
