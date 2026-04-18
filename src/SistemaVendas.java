import java.util.Scanner;

public class SistemaVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double total = 0;

        do {
            System.out.println("\n1 - Produto A (R$10)");
            System.out.println("2 - Produto B (R$20)");
            System.out.println("3 - Produto C (R$30)");
            System.out.println("4 - Finalizar compra");
            System.out.println("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                total += 10;
                System.out.println("Produto A adicionado!");
            }
            else if (opcao == 2) {
                total += 20;
                System.out.println("Produto B adicionado!");
            }
            else if (opcao == 3) {
                total += 30;
                System.out.println("Produto C adicionado!");
            }

        } while (opcao != 4);

        System.out.println("\nTotal da compra: R$ " +  total);

        sc.close();
    }
}