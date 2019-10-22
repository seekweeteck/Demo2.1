package my.edu.tarc.demo2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_linear.*

class LinearActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, "Position ${position}", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        val arrayAgeAdapter  = ArrayAdapter.createFromResource(this, R.array.age, android.R.layout.simple_spinner_item)

        arrayAgeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item )

        spinnerAge.adapter = arrayAgeAdapter
        spinnerAge.onItemSelectedListener = this
    }

    fun showResult(view: View) {
        val name :String = editTextName.text.toString()

        if(name.length==0){
            editTextName.setError("Please enter your name")
            return
        }

        val gender : String?
        val genderSelection = radioGroupGender.checkedRadioButtonId
        if(genderSelection == radioButtonMale.id){
            gender = "Male"
        }else if(genderSelection == radioButtonFemale.id){
            gender = "Female"
        }else{
            gender = "Undecided"
        }

        val smoker :String = if(checkBoxSmoker.isChecked) "Smoker" else "Non smoker"

        val index = spinnerAge.selectedItemPosition
        val age = when(index){
            0 -> "Less than 12"
            1 -> "12 to 17"
            2 -> "18 to 25"
            3 -> "More than 25"
            else -> "Unknow age group"
        }
        textViewResult.text = "Your name is ${name}\nGender is ${gender}\nIs a ${smoker}\nAge is ${age}"
    }
}
