import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions, Options, and Answers
        String[] questions = {
            "1. What is the capital of India?",
            "2. Who is known as the father of Java?",
            "3. What is the largest planet in our solar system?",
            "4. What is the full form of CPU?",
            "5. Who wrote 'Romeo and Juliet'?"
        };

        String[][] options = {
            {"A) Mumbai", "B) Delhi", "C) Kolkata", "D) Chennai"},
            {"A) Dennis Ritchie", "B) James Gosling", "C) Bjarne Stroustrup", "D) Guido van Rossum"},
            {"A) Earth", "B) Mars", "C) Jupiter", "D) Venus"},
            {"A) Central Processing Unit", "B) Central Performance Unit", "C) Central Programming Unit", "D) Central Power Unit"},
            {"A) Mark Twain", "B) J.K. Rowling", "C) William Shakespeare", "D) Charles Dickens"}
        };

        char[] answers = {'B', 'B', 'C', 'A', 'C'};

        int score = 0;

        System.out.println("📘 Welcome to the Quiz Game!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is: " + answers[i] + "\n");
            }
        }

        // Final Score
        System.out.println("🎯 Your final score: " + score + " out of " + questions.length);

        if (score == questions.length) {
            System.out.println("🏆 Excellent! You got all answers correct.");
        } else if (score >= 3) {
            System.out.println("👍 Good job!");
        } else {
            System.out.println("📘 Keep practicing!");
        }

        scanner.close();
    }
}
