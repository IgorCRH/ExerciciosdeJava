import java.util.Scanner;

public class Frase { // o nome da classe é o mesmo do arquivo
public static void main (String[] args)  {
Scanner leitura = new Scanner (System.in); // declara objeto leitura do tipo
// scanner com a entrada padrão, para sinalizar op. de leitura pra variavel nome
String nome; // declara a variavel nome a ser imprimida
System.out.println("Informe um nome"); // println quando pede algo
nome = leitura.next(); // aloca o valor ou string lida a variavel nome
System.out.printf("Ola + %s",nome); // imprime 
}    
}    