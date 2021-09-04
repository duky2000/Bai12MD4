package demo.controller;

import demo.model.Phone;
import demo.service.IphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/phones")
public class ControllerAPI {
    @Autowired
    IphoneService iphoneService;

    @GetMapping
    public ResponseEntity finAll() {
        return new ResponseEntity(iphoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity findByName(@PathVariable String name) {
        return new ResponseEntity(iphoneService.findByName(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Phone> createPhone(@RequestBody  Phone phone) {

        return new ResponseEntity(iphoneService.save(phone), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Phone> editPhone(@RequestBody Phone phone) {

        return new ResponseEntity(iphoneService.save(phone), HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Phone> delete(@PathVariable Long id){
        iphoneService.delete(iphoneService.findById(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
