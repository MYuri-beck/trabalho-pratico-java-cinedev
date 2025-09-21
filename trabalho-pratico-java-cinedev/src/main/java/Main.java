

public class Main {
    public static void main(String[] args) {
        CineRoom sala = new CineRoom();

        // 1. Compra um assento
        System.out.println("\n=== TESTE 1: Comprando assento 1 da fileira 1 ===");
        sala.buyTicket(1, 1);

        // 2. Cancela a compra
        System.out.println("\n=== TESTE 2: Cancelando assento 1 da fileira 1 ===");
        sala.cancelTicket(1, 1);

        // 3. Tenta cancelar assento já livre
        System.out.println("\n=== TESTE 3: Tentando cancelar assento já livre ===");
        sala.cancelTicket(1, 1);

        // 4. Tenta cancelar assento inválido
        System.out.println("\n=== TESTE 4: Tentando cancelar com coordenadas inválidas ===");
        sala.cancelTicket(99, 5);

        // 5. Mostra estado final
        System.out.println("\n=== ESTADO FINAL DA SALA ===");
        sala.showSeats();
    }
    
}
