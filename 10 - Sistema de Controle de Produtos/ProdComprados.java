import java.util.Scanner;

public class ProdComprados implements lProduto
{
protected String nome;
private float custo;
Scanner leitura = new Scanner (System.in);

@Override
public String getNome(){
System.out.println("Entre com nome do produto: \n");
nome = leitura.next();
return nome;
}

@Override
public float getCusto(){
System.out.println("Entre com o custo do produto: \n");
custo = leitura.nextFloat();
return custo;
}

public ProdComprados (String nome, float custo) {
this.nome = nome;
this.custo = custo;
}
}
