package dev.fadul.m06frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void gerarFrase(View view) {

        // Array com as frases que serão exibidas
        String[] frases = {
                "Enfrente os problemas e leve a melhor!",
                "Dê mais atenção ao que você tem de bom na sua vida",
                "Não se exija demais",
                "Um passo por dia",
                "Para chegar ao topo, o que importa é começar!",
                "De nada adianta ter sonhos, se você não se empenhar em correr atrás",
                "Preste atenção nas oportunidades que estão à sua frente!",
                "Positividade para começar o dia é colocar a sua fé em prática",
        };

        // Gerando número aleatório para selecionar uma frase aleatória
        // int aleatorio = new Random().nextInt(frases.length);
        int aleatorio = (int) (Math.random() * frases.length);

        // Acessando um objeto da tela (componente de interface) pelo ID
        // Movendo esse objeto para um objeto TextView
        TextView texto =findViewById(R.id.txtFrase);

        // Executando um método do objeto TextView
        // Alterando o seu atributo text para a frase selecionada aleatoriamente
        String frase = frases[aleatorio];
        texto.setText(frase);

    }

}