import java.util.Scanner;
import java.util.ArrayList;

public class ProdFabricado implements IProdutoFabricado // Implementa a interface IProdutoFabricado
{
private String nome;
protected ArrayList<lProduto> Ingrediente; // Criar Array para ser o vetor de strings com os ingredientes
Scanner leitura = new Scanner (System.in);

public ProdFabricado(String nome, ArrayList<lProduto> Ingrediente) { // Construtor da Classe ProdFabricado
this.nome = nome;
this.Ingrediente = Ingrediente;
}
    
public String getNome() {
return nome;
}

@Override // Sobrepõe para delimitar a quantidade dos ingredientes
public int getNumeroIngredientes() {
return Ingrediente.size();
}

@Override // Sobrepõe para delimitar os ingredientes
public lProduto getIngrediente(int numero) {
if (numero >= 0 && numero < Ingrediente.size()) {
return Ingrediente.get(numero);
} else {
return null;
}
}

@Override // Sobrepõe para delimitar a soma do custo dos produtos fabricados
public float getCusto() {
float custo = 0;
for (lProduto ingred : Ingrediente) {
custo += ingred.getCusto();
}
return custo;
}

public void adicionarIngrediente(ProdComprados ingrediente) { // Método para adicionar ingredientes
Ingrediente.add(ingrediente);
}
}
