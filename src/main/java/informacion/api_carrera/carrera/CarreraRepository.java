package informacion.api_carrera.producto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public class CarreraRepository {
    
   
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

    public List<Carrera> findAll();
    
}

}
