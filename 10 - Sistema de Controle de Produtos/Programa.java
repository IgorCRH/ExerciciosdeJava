import java.util.ArrayList;
import java.util.Scanner;

public class Programa
{
public static void main(String[] args) {
ArrayList<lProduto> Ingredientes = new ArrayList<>();  
lProduto produtoComprado = new ProdComprados("produto1", 10.0f); // Objetos cast usados nas chamadas da main
GerenteProdutos g = new GerenteProdutos();
Scanner leitura = new Scanner (System.in);

g.reduzirCusto(produtoComprado);

lProduto produtoFabricado = new ProdFabricado("produto2",Ingredientes); // Objetos cast usados nas chamadas da main
ProdFabricado prodfabricado = new ProdFabricado ("produto2",Ingredientes); // Objetos cast usados nas chamadas da main

System.out.println("Digite o nome e o custo de cada ingrediente (para sair digite 'fim'):");
String nome;
float custo;
while (true) { // Preenche os ingredientes
System.out.print("Nome: ");
nome = leitura.nextLine();
if (nome.equals("fim")) {
break;
}
System.out.print("Custo: ");
custo = leitura.nextFloat();
leitura.nextLine();
ProdComprados ingrediente = new ProdComprados(nome, custo);
Ingredientes.add(ingrediente);
}
// Área de criação e listagem dos produtos
String[] ingredientes = GerenteProdutos.getIngredientes("produto2");
if (ingredientes != null) {
for (String ingredienteNome : ingredientes) {
ProdComprados ingrediente = new ProdComprados(ingredienteNome, GerenteProdutos.getValorCompra(ingredienteNome));
prodfabricado.adicionarIngrediente(ingrediente);
System.out.println("Nome do Produto: " +produtoFabricado.getNome());
System.out.println("Custo do Produto Fabricado: " +produtoFabricado.getCusto());
System.out.println("Ingredientes do produto fabricado: ");
System.out.println("  - " + ingrediente.getNome() + " (Custo: " + ingrediente.getCusto() + ")");
}
}
g.reduzirCusto(produtoFabricado);

System.out.println("Nome do produto: " + produtoComprado.getNome());
System.out.println("Valor do produto comprado: " + produtoComprado.getCusto());
}
}
