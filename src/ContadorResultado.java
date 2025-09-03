import java.util.Scanner;

public class ContadorResultado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] resultadoJogos = new int[10];
        int vitorias = 0;
        int derrotas = 0;
        int empate = 0;


        System.out.println("Vamos anotar o resutado dos jogos");

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o placar do jogo " + (i + 1) + ": ");
            System.out.println("""
                    1- Vitória
                    2- Derrota
                    3- Empate
                    :
                    """);
            int placar = sc.nextInt();

            resultadoJogos[i] = placar;
        }

        for (int i = 0; i < 5; i++) {

            if (resultadoJogos[i] == 1){
                vitorias++;
            } else if (resultadoJogos[i] == 2) {
                derrotas++;
            } else {
                empate++;
            }
        }
        int somaTotalDeJogos = vitorias + derrotas + empate;

        System.out.println("========Resultado dos Jogos=======");
        System.out.println("Total de Partidas:" + somaTotalDeJogos);
        System.out.println("Vitórias: "+ vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empate: " + empate);
    }
}
