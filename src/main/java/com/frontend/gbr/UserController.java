//package com.frontend.gbr;
//
//
//import com.frontend.gbr.domain.Client;
//import com.frontend.gbr.domain.ClientGuardItem;
//import com.frontend.gbr.repos.ClientGuardItemRepo;
//import com.frontend.gbr.repos.ClientRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Map;
//
//@Controller
//public class UserController {
//
//    @Autowired
//    private ClientRepo clientRepo;
//    @Autowired
//    private ClientGuardItemRepo itemRepo;
//
//    @GetMapping("/list")
//    public String clientList(Map<String,Object> model){
//        Iterable<Client> clientRepoAll = clientRepo.findAll();
//        model.put("clients",clientRepoAll);
//        return "client";
//    }
//
//    @PostMapping("/list")
//    public String add(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String region,
//                      @RequestParam String city, Map<String,Object>model){
//        Client client = new Client(firstName,lastName);
//        clientRepo.save(client);
//        ClientGuardItem guardItem = new ClientGuardItem();
//        guardItem.setRegion(region);
//        guardItem.setCity(city);
//        guardItem.setClientId(client.getId());
//        itemRepo.save(guardItem);
//        Iterable<Client> clientRepoAll = clientRepo.findAll();
//        model.put("clients",clientRepoAll);
//        return "client";
//    }
//
//}
