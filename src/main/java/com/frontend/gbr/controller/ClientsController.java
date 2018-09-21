package com.frontend.gbr.controller;

import com.frontend.gbr.domain.Client;
import com.frontend.gbr.domain.ClientGuardItem;
import com.frontend.gbr.form.ClientForm;
import com.frontend.gbr.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
@Controller
public class ClientsController implements WebMvcConfigurer {
@Autowired
   private ClientRepo clientRepo;

    @GetMapping("/")
    public String showForm(ClientForm clientForm) {
        return "form";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid ClientForm clientForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        Client client = new Client(clientForm.getFirstName(),clientForm.getLastName());
        clientRepo.save(client);
        return "redirect:/list";
    }
}
