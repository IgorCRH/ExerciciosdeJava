import java.util.Date;

class NotaFiscal {
    private int codigo;
    private Date dataEmissao;
    private double valor;

    public NotaFiscal(int codigo, Date dataEmissao, double valor) {
        this.codigo = codigo;
        this.dataEmissao = dataEmissao;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public double getValor() {
        return valor;
    }
}