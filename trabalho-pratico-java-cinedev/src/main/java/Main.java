
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CineRoom sala = new CineRoom(); //Instanciando uma sala de cinema
        int option;
        do {
            System.out.println("=== CineDev - Sistema de Gerenciamento de Assentos ===");
            System.out.println("1. Exibir Mapa de Assentos");
            System.out.println("2. Comprar Ingresso");
            System.out.println("3. Cancelar Compra de Ingresso");
            System.out.println("4. Exibir Relatório de Ocupação");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    sala.showSeats();
                    break;

                case 2:
                    sala.showSeats();
                    System.out.println("Digite a fila (1-10): ");
                    int queue = scan.nextInt();
                    System.out.println("Digite o assento (1-20): ");
                    int seat = scan.nextInt();
                    sala.buyTicket(queue, seat);
                    break;

                case 3:
                    sala.showSeats();
                    System.out.println("Digite a fila (1-10): ");
                    queue = scan.nextInt();
                    System.out.println("Digite o assento (1-20): ");
                    seat = scan.nextInt();
                    sala.cancelTicket(queue, seat);
                    break;

                case 4:
                    sala.occupancyReport();
                    break;

                case 5:
                    System.out.println("Saindo... Obrigado por usar o CineDev!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (option != 5);
    }
}
