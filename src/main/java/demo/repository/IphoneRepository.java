package demo.repository;

import demo.model.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IphoneRepository extends CrudRepository<Phone,Long> {
    List<Phone> findAllByNameContaining(String name);
}
