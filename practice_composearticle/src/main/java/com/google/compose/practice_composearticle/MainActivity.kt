package com.google.compose.practice_composearticle

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.compose.practice_composearticle.ui.theme.EducationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EducationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeTutorial()
                }
            }
        }
    }
}

@Composable
fun ComposeTutorial() {
    Column {
        Image(painter = painterResource(R.drawable.bg_compose_background),
            contentDescription =null ,
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(text = stringResource(id = R.string.title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp))
        Text(text = stringResource(id = R.string.topic),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = stringResource(id = R.string.topic_text),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify)
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EducationAppTheme {
        ComposeTutorial()
    }
}