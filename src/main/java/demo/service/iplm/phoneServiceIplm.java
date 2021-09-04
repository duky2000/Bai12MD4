package demo.service.iplm;

import demo.model.Phone;
import demo.repository.IphoneRepository;
import demo.service.IphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class phoneServiceIplm implements IphoneService {
    @Autowired
    IphoneRepository iphoneRepository;
    @Override
    public Iterable<Phone> findAll() {
        return iphoneRepository.findAll();
    }

    @Override
    public Phone findById(Long id) {
        return iphoneRepository.findById(id).get();
    }

    @Override
    public List<Phone> findByName(String name) {
        return iphoneRepository.findAllByNameContaining(name);
    }

    @Override
    public Phone save(Phone phone) {

        return iphoneRepository.save(phone);
    }

    @Override
    public void delete(Phone phone) {
iphoneRepository.delete(phone);
    }
}
