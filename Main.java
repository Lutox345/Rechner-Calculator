import java.util.Scanner; //Scanner import um einen Input zu lesen

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // diese Zeile wird gescant / gelesen und als Input wahrgenommen

        System.out.println("Gib deine erste Zahl ein:");
        double zahl1 = scan.nextDouble();

        System.out.println("Gib deine zweite Zahl ein:");
        double zahl2 = scan.nextDouble();

        scan.nextLine(); //Löscht die eingabe von davor

        System.out.println("Welcher operator soll genutzt werden?(+,-,*,/)");
        char op = scan.nextLine().charAt(0);

        //.charAt(0) = char aber als nextline, die 0 in .charAt(0) gilt für die erste Position im input
       switch (op) {
           case '+':
               System.out.println("Ihr Ergebnis ist "+ (zahl1 + zahl2));
               break;
           case '-':
               System.out.println("Ihr Ergebnis ist"+ (zahl1 - zahl2));
               break;
           case '*':
               System.out.println("ihr Ergebnis ist"+(zahl1 + zahl2));
               break;
           case '/':
               System.out.println("Ihr Ergebnis ist:"+ (zahl1 + zahl2));
               break;
           default:
               System.out.println("Einer ihrer Ergebnisse sind falsch");
       }
    }
}
