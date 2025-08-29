import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        //Registrar nome de 5 alunos

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println("Informe o nome do " + (1+i) + " Aluno:");
            nomes[i] = sc.nextLine();

        }

        for (int i  = 0 ; i< nomes.length ; i++){
            System.out.println((i+1) + "- Aluna:" + nomes[i]);
        }
    }
}