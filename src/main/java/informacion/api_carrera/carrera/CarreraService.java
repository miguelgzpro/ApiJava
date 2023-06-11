
package informacion.api_carrera.carrera;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class CarreraService {


@Service
public class CarreraService {
    @Autowired CarreraRepository carreraRepository;

    public Carrera save(Carrera entity){
        return productoRepository.save(entity);
    }

    public Carrera findById( Long id){
        return carreraRepository.findById(id).orElse(new Carrera());
    }

    public void deleteById(Long id){
        carreraRepository.deleteById(id);
    }

    public List<Carrera> findAll(){
        return carreraRepository.findAll();
    }
}

}
