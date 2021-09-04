package demo.controller;

import demo.model.Phone;
import demo.service.IphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class PhoneController {
    @Autowired
    IphoneService iphoneService;

    @GetMapping("/show")
    public ModelAndView showFormPhone() {
        List<Phone> phones = (List<Phone>) iphoneService.findAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", phones);
        return modelAndView;
    }
}
