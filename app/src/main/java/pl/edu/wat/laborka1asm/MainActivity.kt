package pl.edu.wat.laborka1asm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Deklaracje zmiennych do obsługi pół textView:
        val signTextView : TextView = findViewById(R.id.sign_textView)
        val resultTextView : TextView = findViewById(R.id.textView_result)

        //Deklaracje zmiennych do obsługi radioButtonów:
        val addRadioButton : RadioButton = findViewById(R.id.add_radioButton)
        val subRadioButton : RadioButton = findViewById(R.id.sub_radioButton)
        val mulRadioButton : RadioButton = findViewById(R.id.mul_radioButton)
        val divRadioButton : RadioButton = findViewById(R.id.div_radioButton)
        val actionTypeRadioGroup :RadioGroup = findViewById(R.id.radioGroup)

        //Deklaracja zmiennej do obsługi buttona:
        val executeButton : Button = findViewById(R.id.execute_button)

        //Deklaracje zmiennych do obsługi pól editText:
        val inputTextA : EditText = findViewById(R.id.inputA_editText)
        val inputTextB : EditText = findViewById(R.id.inputB_editText)

        //Dodanie listenera do wykonania akcji po kliknięciu przycisku:
        executeButton.setOnClickListener{
            val aValue : Int = inputTextA.text.toString().toInt()
            val bValue : Int = inputTextB.text.toString().toInt()

            when (actionTypeRadioGroup.checkedRadioButtonId) {
                addRadioButton.id -> {
                    signTextView.text = " + "
                    val result : Int = aValue + bValue
                    resultTextView.text = "Wynik powyższego działania to $result"
                }
                subRadioButton.id -> {
                    signTextView.text = " - "
                    val result : Int = aValue - bValue
                    resultTextView.text = "Wynik powyższego działania to $result"
                }
                mulRadioButton.id -> {
                    signTextView.text = " * "
                    val result : Int = aValue * bValue
                    resultTextView.text = "Wynik powyższego działania to $result"
                }
                divRadioButton.id -> {
                    signTextView.text = " / "
                    val result : Int = aValue / bValue
                    resultTextView.text = "Wynik powyższego działania to $result"
                }
            }
        }
    }
}