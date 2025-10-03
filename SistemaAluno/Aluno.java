package SistemaAluno;
public class Aluno{
    String nome;
    int matricula;
    double notaFinal;
    void verificarAprovacao(){
        if(notaFinal>=7){
            System.out.println("Aluno aprovado");
        }else{ 
            System.out.println("Aluno reprovado");
        }
    }
    void mostrarDados(int num){
        System.out.printf("Dados do %d° Aluno são: \nNome:%s\nMatricula:%d\nNota:%.2f\n",num,nome,matricula,notaFinal);
    }
}
