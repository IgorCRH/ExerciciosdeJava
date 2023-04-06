import java.util.Scanner;
public class Programa
{
public static void main (String [] args){   
String nome2 = " ",resp;
int i = 0, cont = 0, codigo2 = 0, nmusicas2 = 0, nfaixas2 = 0, opc = 0;
double preco2 = 0;
Scanner leit = new Scanner (System.in);
CMidia [] produtos = new CMidia [60]; 
// Todos os produtos são agrupados e listados em um vetor de 60 elementos.

System.out.println("Área de inserção de Dados: \n");
for (i=0; i<60; i++) { // For que cadastra todos os elementos percorrendo o vetor.   
System.out.println("Entre com o nome do produto: \n");
nome2 = leit.next();
System.out.println("Entre com o código do produto: \n");
codigo2 = leit.nextInt();
System.out.println("Entre com o preço do produto: \n");
preco2 = leit.nextDouble();
System.out.println("CD ou DVD? \n");
resp = leit.next();    
if (resp.equals("CD") || resp.equals("cd")){   
System.out.println("Entre com a quantidade de músicas do CD: \n");
nmusicas2 = leit.nextInt();
CD c = new CD(nome2,codigo2,preco2,nmusicas2); // Cria uma nova instância de objeto para CD 
c.setNumMusicas(nmusicas2); // Pega a variável do nº de músicas pro método SET da classe CD
produtos[i] = c; // Atualiza o objeto c e cria um novo elemento CD na lista
} else if (resp.equals("DVD") || resp.equals("dvd")){
System.out.println("Entre com a quantidade de faixas do DVD: \n");
nfaixas2 = leit.nextInt();
DVD d = new DVD(nome2,codigo2,preco2,nfaixas2); // Cria uma nova instância de objeto para DVD
d.setNumFaixas(nfaixas2);  // Pega a variável do nº de músicas pro método SET da classe DVD
produtos[i] = d;  // Atualiza o objeto d e cria um novo elemento DVD na lista
} else {
System.out.println("Resposta não válida.");
continue; // Caso a resposta não for CD ou DVD executa denovo o loop sem incrementar 1 em cont
}
cont++; // Contador para quantificar os objetos registrados para o for de impressão
if (i == produtos.length) { // Determina o break quando chega aos 60 elementos
System.out.println("Limite de produtos alcançado.");
break;
}
System.out.println("Deseja continuar cadastrando? Sim (1) Não (2): \n");
opc = leit.nextInt();
if (opc == 2){
break; // Break caso a opção digita pelo usuário seja 2 se ele não quiser mais cadastrar
}   
} 

for (i = 0; i < cont; i++){ // For de impressão dos elementos até a quantidade total de produtos registrados
produtos[i].printDados(); // Chamada para o método printDados da classe CMidia
}
}
}
