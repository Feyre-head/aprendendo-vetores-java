import java.util.Scanner;

//Cadastro simples de 3 alunos e 1 nota de cada aluno
public class CadastroDeNotas {
    public static void main(String[] args) {
        //Cria objeto scanner
        Scanner sc = new Scanner(System.in);

        String[] nomeAluno = new String[3];
        double[] notaAluno = new double[3];

        System.out.println("=======Cadastro de Aluno=======");

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o nome do Aluno :");
            nomeAluno[i] = sc.next();
        }

        System.out.println("=======Cadastro de Notas=======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do Aluno " + nomeAluno[i] + ":");
            notaAluno[i] = sc.nextDouble();
        }

        System.out.println("==========Resumo=========:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i + 1) + " : " + nomeAluno[i] + " Nota: " + notaAluno[i]);
        }
    }

}
