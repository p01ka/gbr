package com.frontend.gbr.controller;

import com.frontend.gbr.domain.Client;
import com.frontend.gbr.domain.ClientGuardItem;
import com.frontend.gbr.repos.ClientGuardItemRepo;
import com.frontend.gbr.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private ClientGuardItemRepo itemRepo;

    @GetMapping("/list")
    public String clientList(Model model){
        Iterable<Client> clientRepoAll = clientRepo.findAll();
        model.addAttribute("clients",clientRepoAll);
        return "clients";
    }

    @PostMapping("/list")
    public String add(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String region,
                      @RequestParam String city, Model model){
        Client client = new Client(firstName,lastName);
        clientRepo.save(client);
        ClientGuardItem guardItem = new ClientGuardItem();
        guardItem.setRegion(region);
        guardItem.setCity(city);
        guardItem.setClientId(client.getId());
        itemRepo.save(guardItem);
        return "redirect:/list";
    }
}
