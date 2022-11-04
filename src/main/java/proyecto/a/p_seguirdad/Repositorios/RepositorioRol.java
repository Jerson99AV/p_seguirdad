package proyecto.a.p_seguirdad.Repositorios;

import proyecto.a.p_seguirdad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}