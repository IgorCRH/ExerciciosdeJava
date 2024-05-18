import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

public class Vendedor extends Funcionario
{
    
    private static final double valorSalario = 12000.0;
    private static final double valorAnoServico = 1800.0;
    private static final double beneficioPercentual = 0.30;
    private Map<String, Map<String, Double>> vendasMensais;

    public Vendedor(String nome, LocalDate dataContratacao, Map<String, Map<String, Double>> vendasMensais) {
        super(nome, "Vendedor", dataContratacao, valorSalario);
        this.vendasMensais = vendasMensais;
    }
    
    @Override
    public double calcularSalario(int mes, int ano){
    int anosdeServico = Period.between(dataContratacao, LocalDate.of(ano, mes, 1)).getYears();
    return valorSalario + (anosdeServico * valorAnoServico);
    }
    
    @Override
    public double calcularBeneficio(int mes, int ano) {
    String mesAno = String.format("%02d/%04d", mes, ano);
    
    if (vendasMensais.containsKey(nome)) {
        Map<String, Double> vendasPorMes = vendasMensais.get(nome);

        if (vendasPorMes.containsKey(mesAno)) {
            double vendasMes = vendasPorMes.get(mesAno);

            return vendasMes * beneficioPercentual;
        }
    }
    return 0.0;
}

    public Map<String, Map<String, Double>> getVendasMensais() {
        return vendasMensais;
    }

}
