

package itau.desafio_itau_vaga_99_junior.repository;

import itau.desafio_itau_vaga_99_junior.dto.TransacaoDTO;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepository {

    List<TransacaoDTO> listaDeTransacoes = new ArrayList<>();
    //salvar os dados em uma lista
    public void salvarDados(TransacaoDTO transacaoDTO){
        listaDeTransacoes.add(transacaoDTO);
    }

    //Apagar essa lista depois de 60 segundos
    public void limparDados(){

    }
    // apagar todos as transacoes da lista
    public void deletarDados(){
        listaDeTransacoes.clear();
    }


}
