import java.util.HashMap;
import java.util.Map;

public class GerenteProdutos {
private static Map<String, String[]> Ingrediente = new HashMap<>();

static {
Ingrediente.put("produtoA", new String[] { "ingrediente1", "ingrediente2" });
Ingrediente.put("produtoB", new String[] { "ingrediente2", "ingrediente3" });
Ingrediente.put("produtoC", new String[] { "ingrediente3", "ingrediente4" });
}

public static String[] getIngredientes(String nomeProduto) {
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

public static lProduto reduzirCusto(lProduto produto) {
int numero;
if (produto instanceof IProdutoFabricado) {
IProdutoFabricado produtoFabricado = (IProdutoFabricado) produto;
int numIngredientes = produtoFabricado.getNumeroIngredientes();
float custoFabricado = 0.0f;
boolean podeSerFabricado = true;
for (int i = 0; i < numIngredientes; i++) {
lProduto ingrediente = produtoFabricado.getIngrediente(i);
if (ingrediente instanceof IProdutoFabricado) {
ingrediente = reduzirCusto(ingrediente);
}
if (ingrediente == null) {
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