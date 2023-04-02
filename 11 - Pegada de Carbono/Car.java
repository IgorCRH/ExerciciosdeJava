import java.util.Scanner;
// Classe Car implementa a interface CarbonFootprint
public class Car implements CarbonFootprint
{
// Atributos próprios da classe Car utilizados pro método CarbonFootprint
protected String combustivel;
protected float cilindradas;
protected double miporgalao;
protected double mianual;
Scanner leitura = new Scanner (System.in);

// Construtor da classe Car: milhas, mpg, cilindradasent são passadas por
// argumento através da main
public Car (double milhas, double mpg, float cilindradasent){
mianual = milhas;
miporgalao = mpg;
cilindradas = cilindradasent;
}

// Métodos SET e GET para as variáveis retornar
public void setCilindrada (float cilindradasent){
cilindradas = cilindradasent;
}

public void setMilhas (double milhas){
mianual = milhas;
}

public void setMiporGalao (double mpg){
miporgalao = mpg;
}

public double getMilhas (){
return mianual;
}

public double getMiPorGalao (){
return miporgalao;
}

public float getCilindrada(){
return cilindradas;
}

// Método de cálculo da pegada de carbono pra classe Car
@Override
public double getCarbonFootprint (){
return miporgalao*mianual*cilindradas;
}
}
