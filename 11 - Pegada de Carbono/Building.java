import java.util.Scanner;

public class Building implements CarbonFootprint
{
// Atributos próprios da classe Building utilizados pro método CarbonFootprint    
protected int numpessoas;
protected String s, ac;
protected boolean usoenergrenov;
protected int numlampada;
protected double kwhconsumomensal, conslampada, consenerg, consac, energrenov;
protected boolean usoac;
private double kwhmes;
private int meses = 12;

Scanner leitura = new Scanner (System.in);
public double calculakwhmes (){ // Método para calcular o KWH mensal
System.out.println("Entre com o número de lampadas: \n");
numlampada = leitura.nextInt();
System.out.println("Entre com o consumo das lampadas: \n");
conslampada = leitura.nextDouble();
System.out.println("Entre com o consumo de energia restante: \n");
consenerg = leitura.nextDouble();
System.out.println("Há o uso de energia renovável? \n");
s = leitura.next();
if (s.equals("s")){ // Condições IF que determinam se energia renovável e AC entram no cálculo
usoenergrenov = true;
} else {
usoenergrenov = false;
}
System.out.println("Há o uso de ar condicionado? \n");
ac = leitura.next();
if (ac.equals("s")){
usoac = true;
} else {
usoac = false;
}
if (usoenergrenov){
System.out.println("Entre com o consumo da renovável do prédio: \n");
energrenov = leitura.nextDouble();         
kwhconsumomensal = numlampada + conslampada + consenerg - energrenov;
} else {
kwhconsumomensal = numlampada + conslampada + consenerg;
}
if (usoac){
System.out.println("Entre com o consumo do ar condicionado: \n");
consac = leitura.nextDouble();
kwhconsumomensal = numlampada + conslampada + consenerg + consac;  
} else {
kwhconsumomensal = numlampada + conslampada + consenerg;
}
return kwhconsumomensal;
}

// Construtor da classe Building: kwhconsumomensal é calculado após a chamada
// do método calculakwhmes na main, e khwmes recebe o get e depois o set.
public Building (double kwhconsumomensal){ // Constrói a classe Building para instanciá-la na classe Main
kwhmes = kwhconsumomensal;
}

public double setKwhmes(double kwhconsumomensal){ // Método SET pro KwhMes usado no cálculo da pegada de carbono
return kwhmes;
}

// Método de cálculo da pegada de carbono pra classe Building
@Override
public double getCarbonFootprint (){  
return kwhmes * meses;
}
}
