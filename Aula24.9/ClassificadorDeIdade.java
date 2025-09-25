public class ClassificadorDeIdade{
     public static void main(String [] args){
    int idade=4;
    
    // Classificar se é criança, adolescente, adulto ou idoso
   
    if(idade<=14){
        System.out.println("Voce e crianca!");
    }else if(idade<21){
         System.out.println("Voce e adolescente!");
    }else if(idade<65){
        System.out.println("Voce e adulto!");
    }else { 
        System.out.println("Voce e idoso!");
    }

     }
 }