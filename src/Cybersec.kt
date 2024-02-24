import java.awt.BorderLayout
import java.awt.GridLayout
import javax.swing.*

class QuizGUI : JFrame("Cybersecurity Awareness Quiz") {
    private val questionLabel: JLabel
    private val optionButtons: Array<JRadioButton?>
    private val nextButton: JButton
    private val submitButton: JButton
    private var currentQuestionIndex: Int
    private val selectedIndices = mutableSetOf<Int>()
    private var score = 0

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        val questionPanel = JPanel(BorderLayout())
        questionLabel = JLabel()
        questionPanel.add(questionLabel, BorderLayout.NORTH)

        val optionsPanel = JPanel(GridLayout(4, 1))
        optionButtons = arrayOfNulls(4)
        val optionGroup = ButtonGroup()
        for (i in optionButtons.indices) {
            optionButtons[i] = JRadioButton()
            optionGroup.add(optionButtons[i])
            optionsPanel.add(optionButtons[i])
        }
        questionPanel.add(optionsPanel, BorderLayout.CENTER)

        val buttonPanel = JPanel()
        nextButton = JButton("Next")
        nextButton.addActionListener { displayNextQuestion() }
        buttonPanel.add(nextButton)

        submitButton = JButton("Submit")
        submitButton.addActionListener { submitQuiz() }
        buttonPanel.add(submitButton)
        submitButton.isEnabled = false // Initially disabled until last question

        add(questionPanel, BorderLayout.CENTER)
        add(buttonPanel, BorderLayout.SOUTH)

        pack()
        setLocationRelativeTo(null) // Center the frame
        isVisible = true

        currentQuestionIndex = 0
        displayQuestion()
    }

    private fun displayQuestion() {
        // Check if selectedIndices is empty
        if (selectedIndices.isEmpty()) {
            // Populate selectedIndices with random indices
            val random = java.util.Random()
            while (selectedIndices.size < 10) {
                val index = random.nextInt(30)
                selectedIndices.add(index)
            }
        }
        // Get the current question index from selectedIndices
        val index = selectedIndices.elementAt(currentQuestionIndex)
        questionLabel.text = "Scenario #${currentQuestionIndex + 1}: ${questions[index]}"
        for (i in optionButtons.indices) {
            optionButtons[i]?.text = options[index][i]
            optionButtons[i]?.isSelected = false
        }
    }

    private fun displayNextQuestion() {
        if (currentQuestionIndex < questions.size - 1) {
            currentQuestionIndex++
            displayQuestion()
            nextButton.isEnabled = true
            submitButton.isEnabled = false
        } else {
            nextButton.isEnabled = false
            submitButton.isEnabled = true
        }
    }




    private fun submitQuiz() {
        score = 0
        for (i in optionButtons.indices) {
            if (optionButtons[i]?.isSelected == true && options[currentQuestionIndex][i].startsWith("A")) {
                score++
            }
        }
        JOptionPane.showMessageDialog(this, "Quiz submitted! Score: $score out of 10")
    }



    companion object {
        // Actual pool of questions and options
        private val questions = listOf(
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

        private val options = listOf(
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

        @JvmStatic
        fun main(args: Array<String>) {
            SwingUtilities.invokeLater { QuizGUI() }
        }
    }
}
