package ewerton.ucsal.com.giraquegiragirou

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.graphics.drawable.AnimationDrawable
import android.widget.TextView


class TilaInicial : AppCompatActivity() {
    private val img = findViewById(R.id.imgDado) as ImageView;
    private val animacao = img.background as AnimationDrawable
    private val textPonto = findViewById(R.id.textPontos) as TextView;
    private var pontos = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tila_inicial)
    }

    fun Rolar (view: View) {
        img.setBackgroundResource(R.drawable.animacao);
        animacao.start();
    }

    fun Parar (view: View){
        animacao.stop()
        if (animacao.current.equals(R.drawable.dice1)){
            pontos += 1;
        }else if (animacao.current.equals(R.drawable.dice1)){
            pontos += 2;
        }else if (animacao.current.equals(R.drawable.dice1)){
            pontos += 3;
        }else if (animacao.current.equals(R.drawable.dice1)){
            pontos += 4;
        }else if (animacao.current.equals(R.drawable.dice1)){
            pontos += 5;
        }else{
            pontos += 6;
        }

        textPonto.setText(R.string.Pontos + pontos);
    }

    fun Reiniciar (view: View){
        animacao.stop();
        pontos = 0;
        textPonto.setText(R.string.Pontos);
    }
}

