// Classe Bicycle implementa a interface CarbonFootprint
public class Bicycle implements CarbonFootprint
{
// Atributos próprios da classe Bicycle utilizados pro método CarbonFootprint    
protected double mianual;
protected float calorias;

// Construtor da classe Bicycle: milhas e calorias são passadas por argumento
// através da main
public Bicycle (double milhas, float cal){
mianual = milhas;
calorias = cal;
}

// Métodos GET e SET para retornar as variáveis
public void setMilhas (double milhas){
mianual = milhas;
}

public void setCalorias (float cal){
calorias = cal;
}

public double getMilhas (){
return mianual;
}

public float getCalorias (){
return calorias;
}

// Método de cálculo da pegada de carbono pra classe Bicycle
@Override
public double getCarbonFootprint(){
return mianual*calorias;
}
}
