import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade para a verificar a sua classificação: ");
        int idade = scanner.nextInt();

        if (idade > 0 && idade <= 11){
            System.out.println("A sua idade é " + idade + " anos");
            System.out.println("Classifição: CRIANÇA!");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("A sua idade é " + idade + " anos");
            System.out.println("Classifição: ADOLESCENTE!");
        } else if (idade >= 18 && idade <= 29) {
            System.out.println("A sua idade é " + idade + " anos");
            System.out.println("Classifição: JOVEM!");
        } else if (idade >= 30 && idade <= 59) {
            System.out.println("A sua idade é " + idade + " anos");
            System.out.println("Classifição: ADULTO!");
        } else {
            System.out.println("A sua idade é " + idade + " anos");
            System.out.println("Classifição: IDOSO!");
        }

        scanner.close();
    }
}