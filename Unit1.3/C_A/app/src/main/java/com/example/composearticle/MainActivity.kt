package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    val image = painterResource(R.drawable.bg_compose_background)
    val titel = stringResource(R.string.titel)
    val paragraph1 = stringResource(R.string.text_boven)
    val paragraph2 = stringResource(R.string.text_onder)

    ArticleApp(
        titel = titel,
        paragraph1 = paragraph1,
        paragraph2 = paragraph2,
        imagePainter = image
    )
}

 @Composable
 fun ArticleApp(
     titel: String,
     paragraph1: String,
     paragraph2: String,
     imagePainter: Painter,
     modifier: Modifier = Modifier
 ) {
     Column(modifier = modifier) {
         Image(
             painter = imagePainter,
             contentDescription = null
         )

         Text(
             text = titel,
             modifier = Modifier.padding(16.dp),
             fontSize = 24.sp
         )

         Text(
             text = paragraph1,
             modifier = Modifier.padding(
                 start = 16.dp,
                 end = 16.dp
             ),
             textAlign = TextAlign.Justify
         )

         Text(
             text = paragraph2,
             modifier = Modifier.padding(16.dp),
             textAlign = TextAlign.Justify
         )
     }
 }

@Preview(showBackground = true)
@Composable
fun ComposeArticleAppPreview() {
    ComposeArticleTheme {
        ComposeArticleApp()
    }
}