package my.edu.tarc.demo2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity(),
    AdapterView.OnItemClickListener {


    val programmeArray = listOf<String>("REI", "RIT", "RSD", "RSF", "RST")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1, programmeArray
        )

        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter
        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, programmeArray.get(position), Toast.LENGTH_SHORT).show()
    }

}
