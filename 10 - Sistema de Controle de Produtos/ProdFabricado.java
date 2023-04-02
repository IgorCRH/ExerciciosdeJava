import java.util.Scanner;
import java.util.ArrayList;

public class ProdFabricado implements IProdutoFabricado
{
private String nome;
protected ArrayList<lProduto> Ingrediente;
Scanner leitura = new Scanner (System.in);

public ProdFabricado(String nome, ArrayList<lProduto> Ingrediente) {
this.nome = nome;
this.Ingrediente = Ingrediente;
}
    
public String getNome() {
return nome;
}

@Override
public int getNumeroIngredientes() {
return Ingrediente.size();
}

@Override
public lProduto getIngrediente(int numero) {
if (numero >= 0 && numero < Ingrediente.size()) {
return Ingrediente.get(numero);
} else {
return null;
}
}

@Override
public float getCusto() {
float custo = 0;
for (lProduto ingred : Ingrediente) {
custo += ingred.getCusto();
}
return custo;
}

public void adicionarIngrediente(ProdComprados ingrediente) {
Ingrediente.add(ingrediente);
}
}