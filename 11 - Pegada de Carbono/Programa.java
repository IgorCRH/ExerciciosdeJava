import java.util.Scanner;
import java.util.ArrayList;

public class Programa
{
public static void main (String [] args){
// Declara as variáveis a serem usadas e passadas por argumento pras Classes    
Scanner leitura = new Scanner (System.in);
int opc;
double kwhconsumomensal = 0, milhas = 0, mpg = 0;
float cal = 0, cilindradasent = 0;
Building b = new Building (kwhconsumomensal); // Criar objetos para chamar os métodos das classes
Car c = new Car (milhas,mpg,cilindradasent);
Bicycle y = new Bicycle (milhas,cal);
ArrayList<CarbonFootprint> objetos = new ArrayList<CarbonFootprint>(); // Vetor que guardará os objetos das Classes

// Delimitar os atributos dos objetos da Classe Building que serão adicionados
System.out.println("Entre com o número de pessoas do prédio 1: \n");
double pessoas = leitura.nextInt();
System.out.println("Entre com o número de pessoas do prédio 2: \n");
double pessoas2 = leitura.nextInt();
b.calculakwhmes(); // Chama o método da classe Building

// Delimitar os atributos dos objetos da Classe Car que serão adicionados
System.out.println("Entre com a milha ao ano do Carro 1: \n");
double milhas3 = leitura.nextDouble();
System.out.println("Entre com a milhas por galao do Carro 1: \n");
double mpg3 = leitura.nextDouble();
float cilindradas3 = leitura.nextFloat();
System.out.println("Entre com o combustível: \n");
String combustivel3 = leitura.next();
System.out.println("Entre com a milha ao ano do Carro 2: \n");
double milhas4 = leitura.nextDouble();
System.out.println("Entre com a milhas por galao do Carro 2: \n");
double mpg4 = leitura.nextDouble();
System.out.println("Entre com a cilindrada: \n");
float cilindradas4 = leitura.nextFloat();
System.out.println("Entre com o combustível: \n");
String combustivel4 = leitura.next();

// Delimitar os atributos dos objetos da Classe Bicycle que serão adicionados
System.out.println("Entre com as calorias gastas da bicicleta 1: \n");
cal = leitura.nextFloat();
System.out.println("Entre com as milhas da bicicleta 1: \n");
milhas = leitura.nextDouble();
System.out.println("Entre com as calorias gastas da bicicleta 2: \n");
float cal2 = leitura.nextFloat();
System.out.println("Entre com as milhas da bicicleta 2: \n");
double milhas2 = leitura.nextDouble();

// Adiciona os objetos que serão analisados e listados ao vetor ArrayList de objetos
objetos.add(new Building(pessoas));
objetos.add(new Building(pessoas2));
objetos.add(new Car(milhas3,mpg3,cilindradas3));
objetos.add(new Car(milhas4,mpg4,cilindradas4));
objetos.add(new Bicycle (milhas,cal));
objetos.add(new Bicycle (milhas2,cal2));

// imprime a pegada de carbono de todos os objetos registrados
for (CarbonFootprint CurrentObject : objetos){
System.out.println("Pegada de Carbono: \n");
System.out.println(CurrentObject.getCarbonFootprint());
}
}
}
