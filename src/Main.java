import one.digital.innovation.bootcamp.Quadrilatero;

public class Main {
    public static void main(String[] args) {

       //Quadrilatero
        //Cria uma aplicação que calcula a área dos 3 equiláteros notáveis: quadrado, retângulo e trapézio.

        System.out.println( "Exercicio quadrilatero:");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        System.out.println("\n FIM");
    }

}