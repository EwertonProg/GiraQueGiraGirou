package ewerton.ucsal.com.giraquegiragirou

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.graphics.drawable.AnimationDrawable
import android.widget.TextView


public  class TilaInicial : AppCompatActivity() {
    private var img: ImageView? = null
    private var animacao: AnimationDrawable? = null
    private var textPonto: TextView? = null
    private var pontos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tila_inicial)
         img = findViewById(R.id.imgDado)
         img!!.setBackgroundResource(R.drawable.animacao)
         animacao = img!!.background as AnimationDrawable
         textPonto = findViewById(R.id.textPontos) as TextView
         pontos = 0
    }

    fun Rolar (view: View) {

        animacao?.start()
    }

    fun Parar (view: View){
        if(animacao!!.isRunning) {
            animacao?.stop()
            if (animacao!!.current!!.equals(animacao!!.getFrame(0))) {
                pontos += 1
            } else if (animacao!!.current!!.equals(animacao!!.getFrame(1))) {
                pontos += 2
            } else if (animacao!!.current!!.equals(animacao!!.getFrame(2))) {
                pontos += 3
            } else if (animacao!!.current!!.equals(animacao!!.getFrame(3))) {
                pontos += 4
            } else if (animacao!!.current!!.equals(animacao!!.getFrame(4))) {
                pontos += 5
            } else {
                pontos += 6
            }

            textPonto!!.setText("Pontos: " + pontos)
        }
    }

    fun Reiniciar (view: View){
        animacao!!.stop()
        pontos = 0
        textPonto!!.setText(R.string.Pontos)
    }
}

