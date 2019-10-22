package my.edu.tarc.demo2_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLinear.setOnClickListener {
            val intentLinear: Intent = Intent(this, LinearActivity::class.java)
            startActivity(intentLinear)
        }
    }

    fun showWeb(view : View){
        val intentWeb = Intent(this, WebActivity::class.java)
        startActivity(intentWeb)
    }

    fun showList(view: View){
        val intentList = Intent(this, ListActivity::class.java)
        startActivity(intentList)
    }
}
