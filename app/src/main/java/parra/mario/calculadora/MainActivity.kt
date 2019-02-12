package parra.mario.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1: EditText? = null
    var num2: EditText? = null
    var res: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.campoNum1) as EditText
        num2 = findViewById(R.id.campoNum2) as EditText

        res = findViewById(R.id.campo_resultado) as TextView
    }

    fun sumar(v: View){
        var numero1 = num1?.text.toString().toDouble()
        var numero2 = num2?.text.toString().toDouble()

        var suma = numero1 + numero2

        res?.text = "$suma"
    }

    fun restar(v: View){
        var numero1 = num1?.text.toString().toDouble()
        var numero2 = num2?.text.toString().toDouble()

        var resta = numero1 - numero2

        res?.text = "$resta"
    }

    fun multiplicar(v: View){
        var numero1 = num1?.text.toString().toDouble()
        var numero2 = num2?.text.toString().toDouble()

        var mult = numero1 * numero2

        res?.text = "$mult"
    }

    fun dividir(v: View){
        var numero1 = num1?.text.toString().toDouble()
        var numero2 = num2?.text.toString().toDouble()

        var div = numero1 / numero2

        res?.text = "$div"
    }
}
