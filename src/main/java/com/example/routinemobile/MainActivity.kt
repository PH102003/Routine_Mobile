package com.example.routinemobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.routinemobile.ui.theme.RoutineMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RoutineMobileTheme {


                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaRotina(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TelaRotina(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier

    ) {


        Historinha(
            "Olá! Me chamo Pedro e gostaria de compartilhar minha rotina diária."
        )
        Historinha("Meu dia começa bem cedo, às 6:30 da manhã. Assim que o despertador toca, eu me levanto e me preparo para ir na universidade.")
        Historinha("Ás 7:30 da manhã começam minhas aulas propriamente na faculdade .")
        Historinha("Às 12:30 da manhã, somos liberados para nossas casas.")
        Historinha("Chega em casa por volta de 13:00 e é hora de almoçar, mas antes tomo um banho.")
        Historinha("Após o almoço, às 13:00, volto para minhas atividades de trabalho ou estudo. Continuo focado até o final da tarde, garantindo que tudo o que precisa ser feito, seja feito.")
        Historinha("Às 16:00, começo a estudar um pouco ou faço atividades pendentes")
        Historinha("Às 19:00, é hora do jantar")
        Historinha("Depois do jantar, dedico um tempo para o lazer, vendo séries ou vídeos no youtube")
        Historinha("Às 22:00, começo a me preparar para dormir, escovo os dentes e etc")
        Historinha("Por fim, às 23:00, é praticamente minha hora de dormir.")
    }
    Image(
        painter = painterResource(id = R.drawable.ft_minha),
        contentDescription = "Minha foto",
        modifier = Modifier
            .padding(top = 716.dp)
    )
}

@Composable
fun Historinha(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier.padding(vertical = 4.dp)
    )
}

/*@Composable
fun Saudacao(nome: String, modifier: Modifier = Modifier) {
    Text(
        text = "Olá! Me chamo $nome e gostaria de compartilhar minha rotina diária com você!",
        modifier = modifier.padding(vertical = 16.dp)
    )
}

*/



@Preview(showBackground = true)
@Composable
fun TelaRotinaPreview() {
    RoutineMobileTheme {


        TelaRotina()
    }
}