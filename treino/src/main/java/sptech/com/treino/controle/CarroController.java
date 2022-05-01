package sptech.com.treino.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.com.treino.entidade.Carro;
import sptech.com.treino.entidade.Marca;
import sptech.com.treino.repositorio.CarroRepository;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @GetMapping
    public ResponseEntity<List<Carro>> listarCarros(){
        List<Carro> carros = repository.findAll();
        if (carros.isEmpty()){
            return noContent().build();
        }
        return ok(carros);
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarCarro(@RequestBody Carro carro){
        repository.save(carro);
        return created(null).build();
    }


}
