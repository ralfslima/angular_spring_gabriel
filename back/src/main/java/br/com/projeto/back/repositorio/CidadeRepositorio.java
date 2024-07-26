// Pacote
package br.com.projeto.back.repositorio;

// Importações
import org.springframework.data.repository.CrudRepository;
import br.com.projeto.back.modelo.Cidade;

// Interface
public interface CidadeRepositorio extends CrudRepository<Cidade, Long>{
    
}
