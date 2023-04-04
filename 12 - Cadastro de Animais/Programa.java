import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Programa
{
public static void main (String [] args){
String nome = " ", especie = " ", cor = " ";
int i = 0, j = 0, opc, cont = 0, proxPosicao = 0, numpatas = 0, codigo = 0;
AnimalID a = new AnimalID (nome,especie,cor,numpatas,codigo);
Scanner leitura = new Scanner (System.in);
ArrayList<AnimalID> animais = new ArrayList<>();
AnimalID [][] m = new AnimalID [5] []; //

// Área de inserção de valores
System.out.println("Entre com os dados de um animal: \n");
do {
// Try, Catch para superar o erro de ArrayIndexOutOfBoundsException   
try { System.out.println("Entre com o nome do animal: \n");
nome = leitura.next();
System.out.println("Entre com a espécie do animal: \n");
especie = leitura.next();
System.out.println("Entre com a cor do animal: \n");
cor = leitura.next();
System.out.println("Entre com o número de patas do animal: \n");
numpatas = leitura.nextInt();
System.out.println("Entre com o código do animal: \n");
codigo = leitura.nextInt();
cont++;
// Adiciona animal cadastrado ao vetor que guarda todos os animais cadastrados    
animais.add(a);
// Incrementa a linha de acordo com a quantidade de animais cadastrados
// já que a coluna é fixa
m[proxPosicao] = new AnimalID[]{new AnimalID(nome, especie, cor, numpatas, codigo)};
proxPosicao++; // avança a próxima posição livre na matriz
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("A matriz de animais ainda não possui animal cadastrado. Este é o primeiro.");
}
System.out.println("Deseja encerrar (1) ou continuar cadastrando?: \n");
opc = leitura.nextInt();
} while (opc != 1);
// For para impressão da matriz, determina o tamanho da matriz de acordo com
// o número de linhas que é a quantidade de animais cadastrados, além disso
// percorre a matriz e não imprime elementos nulos.
for (i = 0; i < animais.size(); i++) {
    for (j = 0; j < m[i].length; j++) {
        if (m[i][j] != null) {
            System.out.println(m[i][j]);
        }
    }
}
}
}
