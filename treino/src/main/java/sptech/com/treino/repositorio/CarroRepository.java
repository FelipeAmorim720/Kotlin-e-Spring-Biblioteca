package sptech.com.treino.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.com.treino.entidade.Carro;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    List<Carro> findByMarcaNome(String nomeMarca);

}
