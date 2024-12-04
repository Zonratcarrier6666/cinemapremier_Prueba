package com.cinema_premier.cinema_premier.Cliente;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
@PostMapping()
    public void createClient(@RequestBody Cliente cliente){
        clientService.createClient(cliente);
    }
@GetMapping()
    public List<Cliente> getAllClients() {
        return clientService.getAllClients();
    }
@PutMapping("/{id}/type")
    public String updateClientType(@PathVariable int id, @RequestParam String newType) {
        return clientService.updateClientType(id, newType);
    }
}
