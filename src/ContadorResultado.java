import java.util.Scanner;

public class ContadorResultado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] resultadoJogos = new int[10];

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
            System.out.println("Resultado do jogo " + (i + 1) + " : " + resultadoJogos[i]);
        }
    }
}
