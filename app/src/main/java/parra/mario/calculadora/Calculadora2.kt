package parra.mario.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class Calculadora2 : AppCompatActivity() {
    var campoTexto1: TextView? = null
    var campoTexto2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora2)

        campoTexto1 = findViewById(R.id.texto1) as TextView
        campoTexto2 = findViewById(R.id.texto2) as TextView
    }

    fun resultado(v: View){
        if (!campoTexto2?.text.isNullOrBlank() && !campoTexto1?.text.isNullOrBlank()){
            var cadena1: String = campoTexto2?.text.toString()
            var numero1: Int = cadena1.substring(0, cadena1.length -1).toInt()
            var operacion: Char = cadena1.last()
            var numero2: Int = campoTexto1?.text.toString().toInt()
            var respuesta: Double = 0.0
            when(operacion){
                '+' -> respuesta = numero1 + numero2.toDouble()
                '-' -> respuesta = numero1 - numero2.toDouble()
                '*' -> respuesta = numero1 * numero2.toDouble()
                '/' -> respuesta = numero1 / numero2.toDouble()

            }
            campoTexto2?.text = "$respuesta";
            campoTexto1?.text = ""
            campoTexto1?.hint = "0"
        }else{
            Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show()
        }
    }

    fun sumar(v: View){
        if (!campoTexto1?.text.isNullOrBlank()){
            campoTexto2?.text = campoTexto1?.text.toString() + "+"
            campoTexto1?.text = ""
            campoTexto1?.hint = "0"
        }else{
            Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show()
        }

    }
    fun restar(v: View){
        if (!campoTexto1?.text.isNullOrBlank()){
            campoTexto2?.text = campoTexto1?.text.toString() + "-"
            campoTexto1?.text = ""
            campoTexto1?.hint = "0"
        }else{
            Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show()
        }
    }
    fun multiplicar(v: View){
        if (!campoTexto1?.text.isNullOrBlank()){
            campoTexto2?.text = campoTexto1?.text.toString() + "*"
            campoTexto1?.text = ""
            campoTexto1?.hint = "0"
        }else{
            Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show()
        }
    }
    fun dividir(v: View){
        if (!campoTexto1?.text.isNullOrBlank()){
            campoTexto2?.text = campoTexto1?.text.toString() + "/"
            campoTexto1?.text = ""
            campoTexto1?.hint = "0"
        }else{
            Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show()
        }
    }
    fun borrar(v: View){
        if (!campoTexto1?.text.isNullOrBlank()){
            var cadenaCampo1: String = campoTexto1?.text.toString()
            campoTexto1?.text = cadenaCampo1.substring(0, cadenaCampo1.length-1)
        }else{
            Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show()
        }

    }

    fun cero(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "0"
    }
    fun uno(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "1"
    }
    fun dos(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "2"
    }
    fun tres(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "3"
    }
    fun cuatro(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "4"
    }
    fun cinco(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "5"
    }
    fun seis(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "6"
    }
    fun siete(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "7"
    }
    fun ocho(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "8"
    }
    fun nueve(v: View){
        campoTexto1?.text = campoTexto1?.text.toString() + "9"
    }


}
