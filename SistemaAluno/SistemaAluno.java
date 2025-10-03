package SistemaAluno;
import java.util.Scanner;

public class SistemaAluno {
    public static void main(String[] args){
        Aluno[] turma = new Aluno[3];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i< turma.length;i++){

        turma[i]= new Aluno();
        System.out.printf("Digite o nome do %d° aluno:", i+1);
        turma[i].nome=sc.next();
        System.out.printf("Digite a matricula do %d° aluno:", i+1);
        turma[i].matricula=sc.nextInt();
        System.out.printf("Digite a nota do %d° aluno:", i+1);
        turma[i].notaFinal=sc.nextDouble();
        }
        for(int i=0;i< turma.length;i++){
            turma[i].mostrarDados(i+1);
            turma[i].verificarAprovacao();
        }
        sc.close();
    }

}
