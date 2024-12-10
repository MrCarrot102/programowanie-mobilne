package com.example.lista_4_pum

data class Question(
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)

// lista pytan
val questionList = listOf(
    Question("Jaką właściwość ciała określa stosunek masy do objętości?", listOf("Prędkość", "Energia kinetyczna", "Gęstość", "Temperatura"), 2),
    Question("Co jest jednostką energii?", listOf("Dżul", "Metr", "Sekunda", "Newton"), 0),
    Question("Który gaz dominuje w atmosferze Ziemi?", listOf("Tlen", "Azot", "Wodór", "Dwutlenek węgla"), 1),
    Question("Ile wynosi prędkość światła w próżni?", listOf("300 000 km/s", "150 000 km/s", "1 000 000 km/s", "299 792 km/s"), 3),
    Question("Który pierwiastek chemiczny ma symbol 'O'?", listOf("Tlen", "Złoto", "Srebro", "Wodór"), 0),
    Question("Kto jest autorem teorii względności?", listOf("Isaac Newton", "Albert Einstein", "Nikola Tesla", "Galileusz"), 1),
    Question("W którym roku człowiek po raz pierwszy stanął na Księżycu?", listOf("1969", "1955", "1971", "1980"), 0),
    Question("Które z poniższych zwierząt jest ssakiem?", listOf("Żółw", "Delfin", "Wąż", "Krokodyl"), 1),
    Question("Który kontynent jest największy pod względem powierzchni?", listOf("Afryka", "Azja", "Ameryka Południowa", "Europa"), 1),
    Question("Ile wynosi liczba Pi (przybliżona)?", listOf("3.12", "3.14", "3.16", "3.18"), 1)
)

