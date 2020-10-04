package fit.getmanskii.repository;

import fit.getmanskii.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository  extends CrudRepository<ClientEntity, Integer> {
    @Override
    List<ClientEntity> findAll();
}
