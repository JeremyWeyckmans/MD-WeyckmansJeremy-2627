package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()) {
    Row(
        modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .fillMaxHeight()
    ) {

        Column(modifier = Modifier
            .weight(1f)
            .background(Color(0xFFEADDFF))
            .fillMaxHeight()
            .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = stringResource(id = R.string.text_composable),
                color = Color.Black,
                fontWeight = FontWeight.Bold,

                textAlign = TextAlign.Center



            )
            Text(
                text = stringResource(R.string.text_composable_t),
                color = Color.Black,

                textAlign = TextAlign.Justify
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFFD0BCFF))
                .fillMaxHeight()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.image_composable),
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify
            )
            Text(
                text = stringResource(R.string.image_composable_t),
                color = Color.Black,

                textAlign = TextAlign.Justify
            )
        }
    }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.row_composable),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = stringResource(R.string.row_composable_t),
                    color = Color.Black,

                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.column_composable),
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = stringResource(R.string.column_composable_t),
                    color = Color.Black,

                    textAlign = TextAlign.Justify
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        QuadrantApp()
    }
}