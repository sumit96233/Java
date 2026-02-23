package Has_a;
class HappyBirthdayPravinSir {

    // Typing animation method
    public static void typeWriter(String message) throws InterruptedException {
        for (char ch : message.toCharArray()) {
            System.out.print(ch);
            Thread.sleep(40);
        }
        System.out.println();
    }

    // ASCII Cake
    public static void printCake() {
        System.out.println("            🎂🎂🎂🎂🎂🎂🎂🎂🎂");
        System.out.println("          🎂  HAPPY BIRTHDAY  🎂");
        System.out.println("        🎂🎂🎂🎂🎂🎂🎂🎂🎂🎂🎂🎂🎂");
        System.out.println("        |======================|");
        System.out.println("        |   PRAVIN BAGAL SIR   |");
        System.out.println("        |======================|");
        System.out.println("        |  JAVA GURU & HERO 💻  |");
        System.out.println("        |______________________|");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n");
        typeWriter("Booting BirthdayWishes.java...");
        Thread.sleep(600);

        typeWriter("Loading Respect & Gratitude Modules...");
        Thread.sleep(600);

        typeWriter("Compiling LoveAndBestWishes.class...");
        Thread.sleep(800);

        System.out.println("\n");
        printCake();
        System.out.println("\n");

        typeWriter("Dear Pravin Bagal Sir,");
        System.out.println();

        typeWriter("You are the best mentor, guide, and Java expert! 💻");
        typeWriter("You debug our doubts before we even compile them 😄");
        typeWriter("You turn our syntax errors into life lessons 🌟");
        System.out.println();

        typeWriter("May your life always be:");
        typeWriter("✔ Free from Exceptions");
        typeWriter("✔ Full of Success Statements");
        typeWriter("✔ Overflowing with Happiness Objects");
        System.out.println();

        typeWriter("Happy Birthday, Sir! 🎉🎂");
        typeWriter("Wishing you success, health, and endless joy.");
        System.out.println();

        typeWriter("From: Your Proud Java Students ❤️");

        System.out.println("\nProgram executed successfully without errors ✔");
    }
}

