import java.util.HashMap;
import java.util.Map;

public class GerenteProdutos { // Classe Auxiliar
private static Map<String, String[]> Ingrediente = new HashMap<>(); // Declaração do tipo Map para preencher o vetor

static {
Ingrediente.put("produtoA", new String[] { "ingrediente1", "ingrediente2" }); // Preenche o vetor de strings dos ingredientes
Ingrediente.put("produtoB", new String[] { "ingrediente2", "ingrediente3" });
Ingrediente.put("produtoC", new String[] { "ingrediente3", "ingrediente4" });
}

public static String[] getIngredientes(String nomeProduto) { // Método para pegar os ingredientes
return Ingrediente.get(nomeProduto);
}

public static float getValorCompra(String nomeProduto) {
if (nomeProduto.equals("produtoA")) {
return 10.0f;
} else if (nomeProduto.equals("produtoB")) {
return 15.0f;
} else if (nomeProduto.equals("produtoC")) {
return 20.0f;
} else {
return 0.0f;
}
}

public static lProduto reduzirCusto(lProduto produto) { // Método de redução de custo
int numero;
if (produto instanceof IProdutoFabricado) { // Usando a interface de marcação instanceof, se o produto for fabricado se aplicará a redução de custo
IProdutoFabricado produtoFabricado = (IProdutoFabricado) produto;
int numIngredientes = produtoFabricado.getNumeroIngredientes();
float custoFabricado = 0.0f;
boolean podeSerFabricado = true;
for (int i = 0; i < numIngredientes; i++) {
lProduto ingrediente = produtoFabricado.getIngrediente(i);
if (ingrediente instanceof IProdutoFabricado) {// Usando a interface de marcação instanceof, se o ingrediente for de um produto fabricado se aplicará a redução de custo
ingrediente = reduzirCusto(ingrediente);
}
if (ingrediente == null) { // Se o ingrediente não estiver listado, o produto não poderá ser fabricado
podeSerFabricado = false;
break;
}
custoFabricado += ingrediente.getCusto();
}
if (podeSerFabricado && custoFabricado < produto.getCusto()) {
return produto;
}
}
return produto;
}
}
