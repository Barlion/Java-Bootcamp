import kotlin.random.Random

fun main() {
	// Welcome message and name collection
	println("Welcome to the Cybersecurity Awareness Quiz!")
	print("Please enter your first name: ")
	val name = readLine() ?: ""

	// Generate questions and answers
	val questions = generateQuestions(10)

	// Start the quiz
	println("Hello, $name! Are you ready to begin the quiz? (y/n)")
	val answer = readLine()?.toLowerCase() ?: ""

	if (answer == "y") {
		var score = 0
		for ((index, question) in questions.withIndex()) {
			println("-------------------------------------------")
			println("Question #${index + 1}: ${question.first}")
			question.second.forEach { println(it) }

			print("Your answer: ")
			val userAnswer = readLine()?.toUpperCase() ?: ""

			if (userAnswer == question.second[question.third]) {
				score++
			}
		}

		println("-------------------------------------------")
		println("Your score: $score out of ${questions.size}")
		println("Thank you for taking the Cybersecurity Awareness Quiz, $name!")
	} else {
		println("Thank you for your time!")
	}
}

fun generateQuestions(numQuestions: Int): List<Pair<String, List<String>>> {
		val questions = mutableListOf<Pair<String, List<String>>>()
val random = Random(System.currentTimeMillis())

    for (i in 0 until numQuestions) {
// Generate question and incorrect options
val question = "This is a cybersecurity question about $getRandomTopic()"
val options = mutableListOf<String>()
        for (j in 0 until 3) {
		options.add(getRandomCybersecurityTerm())
		}

// Generate correct option and insert it randomly
val correctOption = getRandomCybersecurityTerm()
val correctIndex = random.nextInt(4)
        options.add(correctIndex, correctOption)

        questions.add(Pair(question, options))
		}

		return questions
}

fun getRandomTopic(): String {
	val topics = listOf(
			"phishing",
			"passwords",
			"firewalls",
			"social engineering",
			"malware",
			"data breaches",
			"encryption",
			"two-factor authentication"
	)
	return topics[Random(System.currentTimeMillis()).nextInt(topics.size)]
}

fun getRandomCybersecurityTerm(): String {
	val terms = listOf(
			"spam",
			"virus",
			"biometrics",
			"vulnerability",
			"patch",
			"VPN",
			"access control",
			"brute force attack",
			"DDoS attack",
			"ransomware",
			"security awareness training"
	)
	return terms[Random(System.currentTimeMillis()).nextInt(terms.size)]
}
