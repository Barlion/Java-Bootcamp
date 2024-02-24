fun main() {
    var score = 0

    println("Cybersecurity Awareness Quiz")
    println("-----------------------------")

    // Question 1
    println("Scenario #1: Your supervisor is very busy and asks you to log into the HR Server using her user-ID and password to retrieve some reports. What should you do?")
    println("A - Log in using her credentials")
    println("B - Log in using your own credentials")
    println("C - Decline the request and remind your supervisor that it is against policy")
    println("D - None of the above")
    print("Your answer: ")
    val answer1 = readLine()
    if (answer1 != null && answer1.toUpperCase() == "C") {
        score++
    }

    // Question 2
    println("Scenario #2: You receive an email from the Help Desk asking for your personal information. What should you do?")
    println("A - Provide the information")
    println("B - Ignore the email")
    println("C - Contact the Help Desk using a known method")
    println("D - None of the above")
    print("Your answer: ")
    val answer2 = readLine()
    if (answer2 != null && answer2.toUpperCase() == "C") {
        score++
    }

    // Question 3
    println("Scenario #3: A friend sends an electronic Hallmark greeting card to your work email. What should you do?")
    println("A - Open the attachment")
    println("B - Forward the email to the IT department")
    println("C - Delete the message")
    println("D - None of the above")
    print("Your answer: ")
    val answer3 = readLine()
    if (answer3 != null && answer3.toUpperCase() == "C") {
        score++
    }

    // Question 4
    println("Scenario #4: You notice that the mouse on your computer is moving on its own. What should you do?")
    println("A - Ignore it")
    println("B - Disconnect from the network and report the problem")
    println("C - Log out of your account")
    println("D - None of the above")
    print("Your answer: ")
    val answer4 = readLine()
    if (answer4 != null && answer4.toUpperCase() == "B") {
        score++
    }

    println("-----------------------------")
    println("Your score: $score")
}
