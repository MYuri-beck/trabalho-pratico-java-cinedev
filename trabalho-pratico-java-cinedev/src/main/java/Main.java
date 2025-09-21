public class Main {
    public static void main(String[] args) {
        CineRoom sala = new CineRoom();

        System.out.println("=== TESTE 1: Relatório inicial (todos livres) ===");
        sala.occupancyReport();

        System.out.println("=== TESTE 2: Comprando 3 assentos ===");
        sala.buyTicket(1, 1); // Ocupa 1 assento
        sala.buyTicket(1, 2); // Ocupa outro
        sala.buyTicket(2, 1); // Ocupa mais um

        System.out.println("=== TESTE 3: Relatório após 3 compras ===");
        sala.occupancyReport();

        System.out.println("=== TESTE 4: Cancelando 1 assento ===");
        sala.cancelTicket(1, 1); // Libera 1

        System.out.println("=== TESTE 5: Relatório final ===");
        sala.occupancyReport();
    }
}