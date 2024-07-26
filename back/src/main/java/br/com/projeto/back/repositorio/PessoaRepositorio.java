// Pacote
package br.com.projeto.back.repositorio;

// Importações
import org.springframework.data.repository.CrudRepository;
import br.com.projeto.back.modelo.Pessoa;

// Interface
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long>{
    
}
