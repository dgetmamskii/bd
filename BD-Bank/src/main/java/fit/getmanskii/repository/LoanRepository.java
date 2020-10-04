package fit.getmanskii.repository;

import fit.getmanskii.model.LoanEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanRepository extends CrudRepository<LoanEntity, Integer> {
    @Override
    List<LoanEntity> findAll();

    List<LoanEntity> findByNamel(String name);
}
