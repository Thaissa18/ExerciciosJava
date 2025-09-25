public class VerificadorDiaDaSemana {
    public static void main(String [] args){
        int diaDaSemana=7;
        switch (diaDaSemana) {
            case 1,7:
                System.out.println("Fim de semana");
                break;
            case 2,3,4,5,6:
             System.out.println("Dia de semana");
                break;
            default:
              System.out.println("Dia inavalido");
                break;
        }
    }
}
   