package proyecto.a.p_seguirdad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyecto.a.p_seguirdad.Modelos.PermisosRoles;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}