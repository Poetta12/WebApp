package edu.campus.numerique.client.controller;

import edu.campus.numerique.client.Client;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private List<Client> clients = new ArrayList<>();

    public ClientController() {
        // Données statiques
        clients.add(new Client(1L, "Hamad", "Cheick", LocalDate.of(1985, 5, 20), "AB1234567"));
        clients.add(new Client(2L, "Costa", "Pedro", LocalDate.of(1980, 3, 9), "CD2345678"));
        clients.add(new Client(3L, "Urvoy", "Mikael", LocalDate.of(1985, 5, 20), "AB1234567"));
        clients.add(new Client(4L, "Leroy", "Stephan", LocalDate.of(1990, 8, 15), "CD2345678"));
    }

    @GetMapping
    public List<Client> getAllClients() {
        // Affiche le hashCode pour chaque client
        clients.forEach(client -> System.out.println(client.hashCode()));
        System.out.println(clients);
        return clients;
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clients.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
