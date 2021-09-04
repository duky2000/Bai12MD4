package demo.service;

import demo.model.Phone;

import java.util.List;
import java.util.Optional;


public interface IphoneService {
    Iterable<Phone> findAll();

    Phone findById(Long id);

    List<Phone> findByName(String name);

    Phone save(Phone phone);

    void delete(Phone phone);

}
