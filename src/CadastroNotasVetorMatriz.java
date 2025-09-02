import java.util.Scanner;

public class CadastroNotasVetorMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomeAluno = new String[3];
        double[][] notaAluno = new double[3][3];


        for (int i = 0; i < 3; i ++){
            System.out.println("===========NOME===========");
            System.out.println("Digite o nome do " + (i+1) + " Aluno: ");
            nomeAluno[i] = sc.nextLine();


            for (int j = 0; j < 3 ; j++){
                System.out.println("Digite a " + (j+1) + " nota do Aluno: ");

                notaAluno[i][j] = sc.nextDouble();

            }

        }
    }
}
