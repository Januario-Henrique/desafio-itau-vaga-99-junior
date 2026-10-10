

import itau.desafio_itau_vaga_99_junior.dto.TransacaoDTO;
import java.math.BigDecimal;

@Service
public class TransacaoService {

    public void validarTransacao(TransacaoDTO transacaoDTO){
        // VALOR MAIO OU IGUAL
        if(transacaoDTO.getValor().compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("Valor da transação deve ser maior que zero");
        }
        // DATA HORA NÃO PODE SER FUTURA
        if(transacaoDTO.getDataHora().isAfter(offsetDateTime.now())  == null || transacaoDTO.getDescricao().isEmpty()){
            throw new RuntimeException("Descrição da transação não pode ser vazia");
        }
    }
}
