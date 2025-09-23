public class ConversorDeMoeda{
    public static void main(String[] args){
     float  valorEmDolar= 50f;
     float taxaDecambio=5.25f;
     float conversao= (float) valorEmDolar*taxaDecambio;
     System.out.println("O valor em reais(R$) e "+ conversao);
    }
}