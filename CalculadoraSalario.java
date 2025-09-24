public class CalculadoraSalario{
    public static void main(String[] args){
        String nome;
        float salario= 5600f;
        if(salario<=1751.81){
            System.out.println("O salario com desconto e :"+ salario*0.92);
        }else if(salario<=2919.72){
            System.out.println("O salario com desconto e :"+ salario*0.91);
        }else if(salario<=5839.45){
            System.out.println("O salario com desconto e :"+ salario*0.90);
        }else {
            System.out.println("O salario com desconto e :"+ salario*0.89);
        }
    }
}