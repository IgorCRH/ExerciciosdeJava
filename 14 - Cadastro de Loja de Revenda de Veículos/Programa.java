import java.util.Scanner;
public class Programa
{
public static void main (String [] args){   
String nome2 = " ",resp;
int i = 0, cont = 0, codigo2 = 0, ano2 = 0, km2 = 0, opc = 0;
double preco2 = 0,totalpreco = 0;
Scanner leit = new Scanner (System.in);
CVeiculos [] veiculos = new CVeiculos [100]; 
// Todos os produtos são agrupados e listados em um vetor de 60 elementos.

System.out.println("Área de inserção de Dados: \n");
for (i=0; i<100; i++) { // For que cadastra todos os elementos percorrendo o vetor.   
System.out.println("Entre com o nome do veículo: \n");
nome2 = leit.next();
System.out.println("Entre com o código do veículo: \n");
codigo2 = leit.nextInt();
System.out.println("Entre com o preço do veículo: \n");
preco2 = leit.nextDouble();
System.out.println("Moto ou Carro? \n");
resp = leit.next();    
if (resp.equals("Moto") || resp.equals("moto")){   
System.out.println("Entre com o ano da moto: \n");
ano2 = leit.nextInt();
Moto m = new Moto(nome2,codigo2,preco2,ano2); // Cria uma nova instância de objeto para Moto 
m.setAno(ano2); // Pega a variável do ano pro método SET da classe Moto
if (m.ano > 2008){
System.out.println("O preco anterior era de: "+m.preco);
m.preco = m.preco*1.1;
System.out.println("O novo preco é de: "+m.preco);
}
veiculos[i] = m; // Atualiza o objeto m e cria um novo elemento Moto na lista
} else if (resp.equals("Carro") || resp.equals("carro")){
System.out.println("Entre com a quantidade de quilometragem: \n");
km2 = leit.nextInt();
Carro c = new Carro(nome2,codigo2,preco2,km2); // Cria uma nova instância de objeto para Carro
c.setKm(km2);  // Pega a variável do nº de músicas pro método SET da classe Carro
if (c.km > 100000){
System.out.println("O preco anterior era de: "+c.preco);    
c.preco = c.preco*0.92;
System.out.println("O novo preco é de: "+c.preco);
}
veiculos[i] = c;  // Atualiza o objeto c e cria um novo elemento Carro na lista
} else {
System.out.println("Resposta não válida.");
continue; // Caso a resposta não for CD ou DVD executa denovo o loop sem incrementar 1 em cont
}
cont++; // Contador para quantificar os objetos registrados para o for de impressão

if (i == veiculos.length) { // Determina o break quando chega aos 100 elementos
System.out.println("Limite de veiculos alcançado.");
break;
}
System.out.println("Deseja continuar cadastrando? Sim (1) Não (2): \n");
opc = leit.nextInt();
if (opc == 2){
break; // Break caso a opção digita pelo usuário seja 2 se ele não quiser mais cadastrar
}   
} 

for (Veiculos v : veiculos) { // For para calcular o total de preços até o total dos veículos registrador
if (v != null) { // verifica se o objeto existe no vetor
totalpreco += v.getPreco(); // soma dos preços dos veículos
}
}

for (i = 0; i < cont; i++){ // For de impressão dos elementos até a quantidade total de veiculos registrados
veiculos[i].printDados(); // Chamada para o método printDados da classe CVeiculos
}
System.out.println("\nTotal do Preço dos Veículos: \n"+totalpreco);
}
}