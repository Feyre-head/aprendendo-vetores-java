import java.util.Scanner; // importa a classe Scanner para ler dados do teclado

public class PlacarJogoSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] placar = new int[3]; // vetor com 3 posições: 0 - vitória, 1 - derrota, 2 - empate

        // perguntar o resultado de 5 jogos
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o resultado do jogo " + (i + 1));
            System.out.println("1 - Vitória");
            System.out.println("2 - Derrota");
            System.out.println("3 - Empate");

            int opcao = sc.nextInt();

            // verifica a opção e soma no placar correspondente
            if (opcao == 1) {
                placar[0]++; // soma 1 na posição das vitórias
            } else if (opcao == 2) {
                placar[1]++; // soma 1 na posição das derrotas
            } else if (opcao == 3) {
                placar[2]++; // soma 1 na posição dos empates
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                i--; // volta uma repetição para repetir a pergunta
            }
        }

        // mostra os resultados finais
        System.out.println("==== Placar Final ====");
        System.out.println("Vitórias: " + placar[0]);
        System.out.println("Derrotas: " + placar[1]);
        System.out.println("Empates: " + placar[2]);

        sc.close(); // fecha o Scanner
    }
}
