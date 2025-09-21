
public class CineRoom {

    private char[][] seats; //Declarando o attributo assentos(matriz) da classe(sala)

    //Método construtor 
    public CineRoom() {
        this.seats = new char[10][20]; // Cria a matriz 10x20
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                this.seats[i][j] = 'L'; // Define TODOS como Livres
            }
        }
    }

    //Métodos
    public void showSeats() { //Método para o mapeamento da sala
        //Print das colunas: 
        System.out.print("Assentos:");
        for (int i = 1; i <= 20; i++) {
            if (i < 10) {
                System.out.print("  " + i); // Dois espaços antes dos números 1-9
            } else {
                System.out.print(" " + i);  // Um espaço antes dos números 10-20
            }
        }
        System.out.println();

        for (int i = 0; i < this.seats.length; i++) {   // percorre as linhas
            if ((i + 1) < 10) {
                System.out.print("Fila  " + (i + 1) + ":"); // Dois espaços após "Fila" para alinhar com "10"
            } else {
                System.out.print("Fila " + (i + 1) + ":");  // Um espaço após "Fila" para a fileira 10
            }

            for (int j = 0; j < this.seats[i].length; j++) {     // percorre as colunas
                System.out.print("[" + this.seats[i][j] + "]"); // Assentos colados: [L][X][L]  ocupam 3 chars cada
            }
            System.out.println(); // quebra a linha
        }
    }

    public void buyTicket(int queue, int seat) {
        //variaveis para operação
        int cordQueue = queue - 1;
        int cordSeat = seat - 1;
        showSeats();

        if ((queue >= 1 && queue <= 10) && (seat >= 1 && seat <= 20)) {
            if (this.seats[cordQueue][cordSeat] == 'L') {
                System.out.println("Assento reservado com sucesso, compra concluida.");
                this.seats[cordQueue][cordSeat] = 'X';
            } else {
                System.out.println("Lugar ja reservado");
                return;
            }
        } else {
            System.out.println("Não existe nenhum assento nas coordenadas informadas");
            return;
        }
    }

    public void cancelTicket(int queue, int seat) { //Lógica reversa em relação ao buyTicket
        int cordQueue = queue - 1;
        int cordSeat = seat - 1;

        if ((queue >= 1 && queue <= 10) && (seat >= 1 && seat <= 20)) {
            if (this.seats[cordQueue][cordSeat] == 'X') { //Se o assento estiver ocupado
                System.out.println("Reserva cancelada com sucesso.");
                this.seats[cordQueue][cordSeat] = 'L'; // libetra

            } else {
                System.out.println("O lugar ja está livre");
                return;
            }
        } else {
            System.out.println("Não existe nenhum assento nas coordenadas informadas");
            return;
        }
    }

    public void occupancyReport() {
        int occupiedSeats = 0;
        int totalSeats = 0;

        for (int i = 0; i < this.seats.length; i++) {   // percorre as linhas
            for (int j = 0; j < this.seats[i].length; j++) { // percorre as colunas
                totalSeats++; // Conta o total de assentos

                if (this.seats[i][j] == 'X') { // Se o assento estiver ocupado ( "X" como ocupado)
                    occupiedSeats++; // Conta os assentos ocupados
                }
            }
        }
        // Calculo do percentual de ocupação 
        double occupancyPercentage = ((double) occupiedSeats / totalSeats) * 100;

        //Calculo de assentos livres
        int freeSeats = totalSeats - occupiedSeats;

        // Exibição do relatorio
        System.out.println("Total de assentos: " + totalSeats);
        System.out.println("Assentos ocupados: " + occupiedSeats);
        System.out.println("Assentos livres: " + freeSeats);
        System.out.printf("Percentual de ocupação: %.2f", occupancyPercentage);
    }
}
