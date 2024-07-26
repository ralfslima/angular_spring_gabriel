package br.com.projeto.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.back.modelo.Pessoa;
import br.com.projeto.back.repositorio.PessoaRepositorio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
public class PessoaControle {
    
    @Autowired
    private PessoaRepositorio acao;

    @PostMapping("/pessoa")
    public Pessoa cadastrar(@RequestBody Pessoa p) {
        return acao.save(p);
    } 
    
    @GetMapping("/pessoa")
    public Iterable<Pessoa> listar() {
        return acao.findAll();
    }

}
