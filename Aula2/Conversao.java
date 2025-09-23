public class Conversao {
    public static void main(String[] args){
        int a= 100;
        float b= a;
        double c = 4.19;
        //int d= c; não pode converter assim
        int d= (int) c;
        float e= (float)c;
        /*todos os pontos flutuantes são doubles por padrão para ser floatprecisa do f no final */
        float f= 6.19f;
        System.out.println(b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);

    }
    
}
