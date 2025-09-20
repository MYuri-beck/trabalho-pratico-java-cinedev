

public class Main {
    public static void main(String[] args) {
        CineRoom sala = new CineRoom();

        System.out.println("=== TESTE 1: Exibindo mapa inicial (todos livres) ===");
        sala.showSeats();

        System.out.println("\n=== TESTE 2: Comprando assento válido (Fileira 1, Assento 1) ===");
        sala.buyTicket(1, 1);

        System.out.println("\n=== TESTE 3: Tentando comprar o mesmo assento novamente ===");
        sala.buyTicket(1, 1);

        System.out.println("\n=== TESTE 4: Tentando comprar assento fora do limite (Fileira 15, Assento 5) ===");
        sala.buyTicket(15, 5);

        System.out.println("\n=== ESTADO FINAL DA SALA ===");
        sala.showSeats();
    }
    
}
