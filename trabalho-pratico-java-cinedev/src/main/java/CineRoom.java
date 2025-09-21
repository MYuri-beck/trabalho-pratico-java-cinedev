
public class CineRoom {

    // Matriz que representa os assentos da sala de cinema (10 fileiras x 20 assentos)
    private char[][] seats;

    // Construtor: inicializa todos os assentos como livres ('L')
    public CineRoom() {
        this.seats = new char[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                this.seats[i][j] = 'L'; // 'L' significa assento Livre
            }
        }
    }

    // Exibe o mapa da sala com todos os assentos formatados
    // Cada assento é mostrado como [L] (livre) ou [X] (ocupado)
    public void showSeats() {
        // Cabeçalho com os números dos assentos (colunas)
        System.out.print("Assentos:");
        for (int i = 1; i <= 20; i++) {
            if (i < 10) {
                System.out.print("  " + i); // Alinha os números de 1 a 9 com dois espaços
            } else {
                System.out.print(" " + i);  // Alinha os números de 10 a 20 com um espaço
            }
        }
        System.out.println();

        // Percorre cada fileira (linha da matriz)
        for (int i = 0; i < this.seats.length; i++) {
            // Mostra o número da fileira com alinhamento adequado
            if ((i + 1) < 10) {
                System.out.print("Fila  " + (i + 1) + ":");
            } else {
                System.out.print("Fila " + (i + 1) + ":");
            }

            // Percorre os assentos da fileira (colunas da matriz)
            for (int j = 0; j < this.seats[i].length; j++) {
                System.out.print("[" + this.seats[i][j] + "]"); // Exibe [L] ou [X]
            }

            // Quebra de linha para a próxima fileira
            System.out.println();
        }
    }

    // Realiza a compra de um ingresso (reserva um assento)
    // Marca o assento como 'X' se estiver livre
    public void buyTicket(int queue, int seat) {
        int cordQueue = queue - 1; // Ajusta para índice da matriz (0 a 9)
        int cordSeat = seat - 1;   // Ajusta para índice da matriz (0 a 19)

        // Verifica se a posição é válida na matriz
        if ((queue >= 1 && queue <= 10) && (seat >= 1 && seat <= 20)) {
            // Verifica se o assento está livre
            if (this.seats[cordQueue][cordSeat] == 'L') {
                System.out.println("Assento reservado com sucesso, compra concluída.");
                this.seats[cordQueue][cordSeat] = 'X'; // Marca como ocupado
            } else {
                System.out.println("Lugar já reservado.");
                return;
            }
        } else {
            System.out.println("Não existe nenhum assento nas coordenadas informadas.");
            return;
        }
    }

    // Cancela uma reserva, liberando o assento
    // Marca o assento como 'L' se estiver ocupado
    public void cancelTicket(int queue, int seat) {
        int cordQueue = queue - 1;
        int cordSeat = seat - 1;

        // Verifica se a posição é válida na matriz
        if ((queue >= 1 && queue <= 10) && (seat >= 1 && seat <= 20)) {
            // Verifica se o assento está ocupado
            if (this.seats[cordQueue][cordSeat] == 'X') {
                System.out.println("Reserva cancelada com sucesso.");
                this.seats[cordQueue][cordSeat] = 'L'; // Marca como livre
            } else {
                System.out.println("O lugar já está livre.");
                return;
            }
        } else {
            System.out.println("Não existe nenhum assento nas coordenadas informadas.");
            return;
        }
    }

    // Gera e exibe um relatório com:
    // - Total de assentos
    // - Assentos ocupados
    // - Assentos livres
    // - Percentual de ocupação da sala
    public void occupancyReport() {
        int occupiedSeats = 0;
        int totalSeats = 0;

        // Conta todos os assentos e quantos estão ocupados
        for (int i = 0; i < this.seats.length; i++) {
            for (int j = 0; j < this.seats[i].length; j++) {
                totalSeats++; // Soma ao total
                if (this.seats[i][j] == 'X') {
                    occupiedSeats++; // Soma se estiver ocupado
                }
            }
        }

        // Calcula o percentual de ocupação (em %)
        double occupancyPercentage = ((double) occupiedSeats / totalSeats) * 100;
        int freeSeats = totalSeats - occupiedSeats;

        // Exibe os dados do relatório
        System.out.println("Total de assentos: " + totalSeats);
        System.out.println("Assentos ocupados: " + occupiedSeats);
        System.out.println("Assentos livres: " + freeSeats);
        System.out.printf("Percentual de ocupação: %.2f%%\n", occupancyPercentage);
        System.out.println();
    }
}
