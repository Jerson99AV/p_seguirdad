package proyecto.a.p_seguirdad.Repositorios;

import proyecto.a.p_seguirdad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}