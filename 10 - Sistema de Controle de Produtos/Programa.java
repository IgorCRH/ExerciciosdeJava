import java.util.ArrayList;
import java.util.Scanner;

public class Programa
{
public static void main(String[] args) {
String nome = " ", nomeing = " ";
float custo = 0, custoing = 0;
int qtd, esc;
ArrayList<lProduto> Ingredientes = new ArrayList<>();  
lProduto produtoComprado = new ProdComprados("produto1", 10.0f); // Objetos cast usados nas chamadas da main
ProdComprados c = new ProdComprados(nome,custo); 
ProdFabricado f = new ProdFabricado (nome,Ingredientes);
GerenteProdutos g = new GerenteProdutos();
Scanner leitura = new Scanner (System.in);
lProduto produtoFabricado = new ProdFabricado("produto2",Ingredientes); // Objetos cast usados nas chamadas da main
ProdFabricado prodfabricado = new ProdFabricado ("produto2",Ingredientes); // Objetos cast usados nas chamadas da main

System.out.println("O produto é comprado (1) ou fabricado (2)?");
esc = leitura.nextInt();
if (esc == 1){
c.getNome();
c.getCusto();

System.out.println("Nome do produto: " +c.getNome());
System.out.println("Valor do produto comprado: " +c.getCusto());
} else if (esc == 2){
System.out.println("Digite o nome e o custo de cada ingrediente (para sair digite 'fim'):");
while (true) { // Preenche os ingredientes
System.out.print("Nome do Ingrediente: ");
nomeing = leitura.nextLine();
leitura.nextLine();
System.out.print("Custo do Ingrediente: ");
custoing = leitura.nextFloat();
System.out.print("Quantidade: ");
qtd = leitura.nextInt();
leitura.nextLine();
if (nomeing.equals("fim")) {
break;
}
ProdFabricado ingrediente = new ProdFabricado(nomeing,Ingredientes);
Ingredientes.add(ingrediente);
}
f.getNome();
f.getCusto();
// Área de criação e listagem dos produtos
String[] ingredientes = GerenteProdutos.getIngredientes("produto2");
if (ingredientes != null) {
for (String ingredienteNome : ingredientes) {
ProdComprados ingrediente = new ProdComprados(ingredienteNome, GerenteProdutos.getValorCompra(ingredienteNome));
prodfabricado.adicionarIngrediente(ingrediente);
System.out.println("Nome do Produto: " +f.getNome());
System.out.println("Custo do Produto Fabricado: " +f.getCusto());
System.out.println("Ingredientes do produto fabricado: ");
System.out.println("  - " +ingrediente.getNome() + " (Custo: " +ingrediente.getCusto() + ")");
}
}
} else {
System.out.println("Opção Inválida.");
}

}
}
