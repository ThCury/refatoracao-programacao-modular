import java.util.Scanner;


public class Main {
    
public static void main(String[] args) throws Exception {


    // Menu
    Scanner scanner = new Scanner(System.in);
    int opcao;
    Requisicao r= new Requisicao(opcao, null, null);
    do {
        System.out.println("\n\n\n\n\n"); // Espaços em branco para centralizar o menu
        System.out.println("============== MENU ==============");
        System.out.println("|   1. Fazer requisição          |");
        System.out.println("|   2. Sair da mesa              |");
        System.out.println("|   3. Sair do programa          |");
        System.out.println("|================================|");
        System.out.print("   Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                fazerRequisicao();
                break;
            case 2:
                // sairDaMesa();
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 3);

    scanner.close();
}
}