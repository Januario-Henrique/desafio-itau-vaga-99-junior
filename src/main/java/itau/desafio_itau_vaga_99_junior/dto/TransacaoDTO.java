


import java.math.BigDecimal;

public class TransacaoDTO {
    private BigDecimal valor;
    private OffsetDateTime dataHora;

    public TransacaoDTO() {
    }

    public TransacaoDTO(BigDecimal valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
