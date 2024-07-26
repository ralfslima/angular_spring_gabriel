package br.com.projeto.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.back.modelo.Cidade;
import br.com.projeto.back.repositorio.CidadeRepositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin(origins = "*")
@RestController
public class CidadeControle {
    
    @Autowired
    private CidadeRepositorio acao;

    @PostMapping("/cidade")
    public Cidade cadastrar(@RequestBody Cidade c) {
        return acao.save(c);
    }

    @GetMapping("/cidade")
    public Iterable<Cidade> listar() {
        return acao.findAll();
    }

}
