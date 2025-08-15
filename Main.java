import java.util.Scanner; //Scanner import um einen Input zu lesen

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // diese Zeile wird gescant / gelesen und als Input wahrgenommen

        System.out.println("Gib deine erste Zahl ein:");
        double zahl1 = scan.nextDouble();

        System.out.println("Gib deine zweite Zahl ein:");
        double zahl2 = scan.nextDouble();

        System.out.println("Welcher operator soll genutzt werden?(+,-,*,/)");
        char op = new Scanner(System.in).nextLine().charAt(0);

        //.charAt(0) = char aber als nextline, die 0 in .charAt(0) gilt für die erste Position im input

        if (op == '+') {

        //bei if, muss die bedingung in Klammern stehen + die char-variable op in '' stehen

            double ergebnis = zahl1 + zahl2;
            System.out.println("Ihre Zahl ist:" + ergebnis);
        }
        else if (op == '-') {
            double ergebnis = zahl1 - zahl2;
            System.out.println("Ihre Zahl ist:"+ ergebnis);
        }
        else if (op == '*') {
            double ergebnis = zahl1 * zahl2;
            System.out.println("Ihre Zahl ist:"+ ergebnis);
        }
        else if (op == '/') {
            double ergebnis = zahl1 / zahl2;
            System.out.println("Ihre Zahl ist:" + ergebnis);
        }
        else {
            System.out.println("Ihre Eingaben sind Falsch!");
        }
    }
}
