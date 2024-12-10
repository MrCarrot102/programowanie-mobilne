package com.example.lista_4_pum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                QuizScreen(questions = questionList)
            }
        }
    }
}

@Composable
fun QuizScreen(questions: List<Question>) {
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableStateOf(0) }
    var showFinalScreen by remember { mutableStateOf(false) }

    if (showFinalScreen) {
        FinalScoreScreen(score = score, totalQuestions = questions.size)
    } else {
        val question = questions[currentQuestionIndex]
        val progress = (currentQuestionIndex + 1).toFloat() / questions.size

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text("Pytanie ${currentQuestionIndex + 1}/${questions.size}", style = MaterialTheme.typography.bodyMedium)
            LinearProgressIndicator(progress = progress, modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp))

            Text(question.questionText, style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(vertical = 8.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Column {
                    question.options.forEachIndexed { index, option ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { selectedAnswer = index }
                                .padding(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = selectedAnswer == index,
                                onClick = { selectedAnswer = index }
                            )
                            Text(option, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }

            Button(
                onClick = {
                    if (selectedAnswer == question.correctAnswerIndex) {
                        score += 10
                    }
                    if (currentQuestionIndex < questions.size - 1) {
                        currentQuestionIndex++
                        selectedAnswer = null
                    } else {
                        showFinalScreen = true
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Text("Następne")
            }
        }
    }
}

@Composable
fun FinalScoreScreen(score: Int, totalQuestions: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Brawo!", style = MaterialTheme.typography.bodyMedium)
        Text(
            "Uzyskałeś $score punktów na ${totalQuestions * 10}.",
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(vertical = 16.dp)
        )
    }
}

// pytania
// co to state -
// co to obserwator i za co jest odpowiedzialny -
// co to jest mutableStateOf -
// za co odpowiada remember -