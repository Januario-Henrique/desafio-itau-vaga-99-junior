
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import itau.desafio_itau_vaga_99_junior.repository.TransacaoRepository;

import itau.desafio_itau_vaga_99_junior.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;


    @Autowired
    private TransacaoRepository transacaoRepository;

    @PostMapping
    public ResponseEntity adicionarTransacao(@RequestBody TransacaoDTO transacaoDTO){
        try{
            transacaoService.validarTransacao(transacaoDTO);
            transacaoRepository.salvarDados(transacaoDTO);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (IllegalArgumentException exeception) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }

    }
}
