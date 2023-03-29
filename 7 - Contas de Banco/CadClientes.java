import java.util.Scanner;
public class CadClientes
{
public static void main (String [] args){
Scanner leitura = new Scanner (System.in);
String nome;
int numconta, cpf, quantia, qtdanos, qtdmes, opc;
double saldo, rendimento;
Clientes cadastro = new Clientes ();

do {
System.out.println("Digite a opção desejada: \n");
System.out.println("1 - Cadastrar Cliente: \n");
System.out.println("2 - Listar Clientes: \n");
System.out.println("3 - Depositar: \n");
System.out.println("4 - Sacar: \n");
System.out.println("5 - Ver Rendimento Anual: \n");
System.out.println("6 - Ver Rendimento por Mês: \n");
opc = leitura.nextInt();

switch (opc){
case 1:
System.out.println("Entre com o nome do cliente: ");
nome = leitura.next();
System.out.println("Entre com o número da conta do cliente: ");
numconta = leitura.nextInt();
System.out.println("Entre com o CPF do cliente: ");
cpf = leitura.nextInt();
System.out.println("Entre com o Saldo do cliente: ");
saldo = leitura.nextDouble();

cadastro.setNome(nome);
cadastro.setNumConta(numconta);
cadastro.setCpf(cpf);
cadastro.setSaldo(saldo);
break;

case 2:
System.out.println("Listagem dos Clientes:");
cadastro.exibir();
System.out.println("---------------------------");
break;

case 3:
System.out.println("Informe a quantia que deseja depositar:");
quantia = leitura.nextInt();
cadastro.depositar(quantia);
break;

case 4:
System.out.println("Informe a quantia que deseja sacar:");
quantia = leitura.nextInt();
cadastro.sacar(quantia);
break;

case 5:
System.out.println("Informe a rendimento anual em porcentagem:");
rendimento = leitura.nextDouble();
rendimento = rendimento/100;
cadastro.rendpoupançaano(rendimento);
break;

case 6:
System.out.println("Informe a rendimento mensal em porcentagem:");
rendimento = leitura.nextDouble();
rendimento = rendimento/100;
cadastro.rendpoupançames(rendimento);
break;
}
} while (opc !=7);
}
}
