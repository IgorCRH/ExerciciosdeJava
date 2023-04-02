import java.util.Scanner;

public class ProdComprados implements lProduto // Implementa a Interface lProduto
{
protected String nome;
private float custo;
Scanner leitura = new Scanner (System.in);

@Override // Sobrepõe para delimitar o nome do produto. O método getNome, aonde estará a variável nome, é um dos campos da interface implementada.
public String getNome(){
System.out.println("Entre com nome do produto: \n");
nome = leitura.next();
return nome;
}

@Override // Sobrepõe para delimitar o custo do produto. O método getCusto, aonde estará a variável custo, é um dos campos da interface implementada.
public float getCusto(){
System.out.println("Entre com o custo do produto: \n");
custo = leitura.nextFloat();
return custo;
}

public ProdComprados (String nome, float custo) { // Construtor da Classe ProdComprados
this.nome = nome;
this.custo = custo;
}
}
