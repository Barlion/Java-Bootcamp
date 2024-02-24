import kotlin.random.Random

fun main() {
    println("Welcome to the Cybersecurity Awareness Quiz!")
    println("-------------------------------------------")

    val questions = listOf(
        "Your supervisor is very busy and asks you to log into the HR Server using her user-ID and password to retrieve some reports. What should you do?",
        "You receive an email from the Help Desk asking for your personal information. What should you do?",
        "A friend sends an electronic Hallmark greeting card to your work email. What should you do?",
        "You notice that the mouse on your computer is moving on its own. What should you do?",
        "What is phishing?",
        "What is social engineering?",
        "What is malware?",
        "What is a firewall?",
        "What is encryption?",
        "What is a VPN?",
        "What is two-factor authentication?",
        "What is a brute force attack?",
        "What is a DDoS attack?",
        "What is ransomware?",
        "What is a data breach?",
        "What is a vulnerability?",
        "What is a patch?",
        "What is endpoint security?",
        "What is a security audit?",
        "What is a security policy?",
        "What is access control?",
        "What is authentication?",
        "What is authorization?",
        "What is cybersecurity hygiene?",
        "What is a security incident?",
        "What is security awareness training?",
        "What is a security risk assessment?",
        "What is a security breach?",
        "What is security governance?",
        "What is security compliance?"
    )

    val options = listOf(
        listOf("A - Log in using her credentials", "B - Log in using your own credentials", "C - Decline the request and remind your supervisor that it is against policy", "D - None of the above"),
        listOf("A - Provide the information", "B - Ignore the email", "C - Contact the Help Desk using a known method", "D - None of the above"),
        listOf("A - Open the attachment", "B - Forward the email to the IT department", "C - Delete the message", "D - None of the above"),
        listOf("A - Ignore it", "B - Disconnect from the network and report the problem", "C - Log out of your account", "D - None of the above"),
        listOf("A - Fishing for compliments", "B - A method of catching fish", "C - A cyber attack that disguises as a trustworthy entity", "D - None of the above"),
        listOf("A - A technique for making friends", "B - Manipulating people into divulging confidential information", "C - A type of computer virus", "D - None of the above"),
        listOf("A - Software used for mail management", "B - Malicious software", "C - A type of virus", "D - None of the above"),
        listOf("A - A protective wall around your computer", "B - A physical barrier made of fire-resistant material", "C - A security device that monitors and controls incoming and outgoing network traffic", "D - None of the above"),
        listOf("A - A secret code", "B - A method for secure communication", "C - A way to hide data", "D - None of the above"),
        listOf("A - Virtual Public Network", "B - Very Private Network", "C - Visual Private Network", "D - None of the above"),
        listOf("A - A single-factor authentication method", "B - A two-step verification process", "C - A password manager", "D - None of the above"),
        listOf("A - An attack that involves trying many passwords", "B - A sophisticated cyber attack", "C - A type of physical security breach", "D - None of the above"),
        listOf("A - A Distributed Denial of Service attack", "B - A Direct Denial of Service attack", "C - A type of physical attack", "D - None of the above"),
        listOf("A - A type of software used for data encryption", "B - A type of security training", "C - Malicious software that encrypts your files and demands a ransom", "D - None of the above"),
        listOf("A - Unauthorized access to sensitive information", "B - A data management technique", "C - A secure communication protocol", "D - None of the above"),
        listOf("A - An unpatched vulnerability", "B - A software update", "C - A hardware vulnerability", "D - None of the above"),
        listOf("A - Security at the end of a process", "B - Security on mobile devices", "C - Protection of computer networks that are remotely bridged to client devices", "D - None of the above"),
        listOf("A - An examination of computer systems", "B - A formalized process for evaluating the security of an organization", "C - A type of security software", "D - None of the above"),
        listOf("A - A set of rules for computer usage", "B - A software for security analysis", "C - A type of security hardware", "D - None of the above"),
        listOf("A - Controlling access to information or resources", "B - Biometric identification", "C - A software for monitoring network traffic", "D - None of the above"),
        listOf("A - Verifying the identity of a user", "B - Authorizing access to a resource", "C - A type of security software", "D - None of the above"),
        listOf("A - A process for obtaining a security clearance", "B - A security protocol", "C - The process of granting permission to access a resource", "D - None of the above"),
        listOf("A - Keeping your computer clean", "B - Washing your hands", "C - Following best practices for staying safe online", "D - None of the above"),
        listOf("A - A security breach that doesn't cause any harm", "B - A minor security issue", "C - An event that could compromise the confidentiality, integrity, or availability of data", "D - None of the above"),
        listOf("A - Training employees to be more security conscious", "B - A type of security software", "C - An examination of security cameras", "D - None of the above"),
        listOf("A - An evaluation of the security of an organization's systems and procedures", "B - A type of security incident", "C - A type of security breach", "D - None of the above"),
        listOf("A - Unauthorized access to a system", "B - A type of security breach", "C - A physical barrier", "D - None of the above"),
        listOf("A - Ensuring that security measures align with business objectives", "B - Ensuring compliance with security regulations", "C - A type of security breach", "D - None of the above")
    )

    val random = Random(System.currentTimeMillis())
    val selectedIndices = mutableSetOf<Int>()
    while (selectedIndices.size < 10) {
        selectedIndices.add(random.nextInt(30))
    }

    var score = 0
    for (index in selectedIndices) {
        println("Scenario #${index + 1}: ${questions[index]}")
        options[index].forEach { println(it) }
        print("Your answer: ")
        val answer = readLine()?.toUpperCase()
        when (index) {
            0, 1, 2, 3 -> if (answer == "C") score++
            4 -> if (answer == "C") score++
            5 -> if (answer == "B") score++
            6 -> if (answer == "B") score++
            7 -> if (answer == "C") score++
            8 -> if (answer == "A") score++
            9 -> if (answer == "C") score++
            10 -> if (answer == "B") score++
            11 -> if (answer == "A") score++
            12 -> if (answer == "A") score++
            13 -> if (answer == "C") score++
            14 -> if (answer == "A") score++
            15 -> if (answer == "A") score++
            16 -> if (answer == "B") score++
            17 -> if (answer == "B") score++
            18 -> if (answer == "A") score++
            19 -> if (answer == "A") score++
            20 -> if (answer == "C") score++
            21 -> if (answer == "A") score++
            22 -> if (answer == "A") score++
            23 -> if (answer == "A") score++
            24 -> if (answer == "C") score++
            25 -> if (answer == "A") score++
            26 -> if (answer == "A") score++
            27 -> if (answer == "A") score++
            28 -> if (answer == "A") score++
            29 -> if (answer == "A") score++
        }
    }

    println("-------------------------------------------")
    println("Your score: $score out of ${selectedIndices.size}")
    println("Thank you for taking the Cybersecurity Awareness Quiz!")
}
