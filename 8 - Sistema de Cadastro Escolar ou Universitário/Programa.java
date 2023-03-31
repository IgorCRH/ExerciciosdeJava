import java.util.Scanner;

public class Programa
{
public static void main (String [] args){
Scanner leitura = new Scanner (System.in);
int matricula, matnov, cpf = 0, cpfnov, valor, opc;
String nome = " ", nomenov, nanul, natt, email = " ", emailnov, data = " ", datanov;

Aluno a = new Aluno (nome,email,cpf,data);
Funcionario f = new Funcionario (nome,email,cpf,data);

do {
System.out.println("Digite a opção desejada: \n");
System.out.println("1 - Cadastrar Aluno: \n");
System.out.println("2 - Cadastrar Funcionário: \n");
System.out.println("3 - Atualizar Dados do Aluno: \n");
System.out.println("4 - Atualizar Dados do Funcionário: \n");
System.out.println("5 - Reajustar Salário do Funcionário: \n");
System.out.println("6 - Listar Alunos: \n");
System.out.println("7 - Listar Funcionários: \n");
System.out.println("8 - Anular Matrícula de Aluno: \n");
opc = leitura.nextInt();

switch (opc){
case 1:
a.cadaluno();
break;
case 2:
f.cadfunc();
break;
case 3:
System.out.println("Entre com o nome do aluno que deseja atualizar");
natt = leitura.next();
a.atualizaaluno(natt);
break;
case 4:
System.out.println("Entre com o nome do funcionário que deseja atualizar");
natt = leitura.next();
f.atualizafunc(natt);
break;
case 5:
System.out.println("Informe a quantia do reajuste:");
valor = leitura.nextInt();
f.reajuste(valor);
break;
case 6:
System.out.println("Lista dos Alunos:");
a.listaralunos();
break;
case 7:
System.out.println("Lista dos Funcionários:");
f.listarfunc();
break;
case 8:
System.out.println("Qual o nome do aluno que deseja anular matrícula?: ");
nanul = leitura.next();
a.anulamatricula(nanul);
break;
}
} while (opc !=9);
}
}
