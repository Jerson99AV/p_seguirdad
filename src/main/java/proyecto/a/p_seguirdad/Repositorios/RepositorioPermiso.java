package proyecto.a.p_seguirdad.Repositorios;

import proyecto.a.p_seguirdad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}