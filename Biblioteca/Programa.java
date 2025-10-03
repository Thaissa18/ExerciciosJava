package Biblioteca;

public class Programa {
    public static void main(String[] args) {
        Autor machado= new Autor();
        machado.nome= "Joaquim Machado De Assis";
        machado.nacionalidade= "Brasileiro";

        Livros codigoLimpo= new Livros();
        codigoLimpo.titulo="Codigo limpo";
        codigoLimpo.anoPublicacao= 1908;
        codigoLimpo.autor= machado;

        System.out.printf("O livro '%s' foi escrito por %S",codigoLimpo.titulo,codigoLimpo.autor.nome);



    }
    
}
