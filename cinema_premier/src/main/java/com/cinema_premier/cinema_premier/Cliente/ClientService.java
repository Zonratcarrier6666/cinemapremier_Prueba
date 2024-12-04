package com.cinema_premier.cinema_premier.Cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final PearsonRepository pearsonRepo;

    public void createClient(Cliente client) {
        pearsonRepo.save(client);
    }
    public List<Cliente> getAllClients() {
        return pearsonRepo.findAll();
    }
    public String updateClientType(int idClient, String newType) {
        Optional<Cliente> optionalClient = pearsonRepo.findById(idClient);

        if (optionalClient.isPresent()) {
            Cliente client = optionalClient.get();
            String currentType = client.getTypeClient();

            // Reglas de actualización
            if (currentType.equals("OCS") && newType.equals("VIP")) {
                return "No se puede actualizar un cliente OCS a VIP.";
            }

            if (currentType.equals("VIP") && newType.equals("VIP")) {
                return "El cliente ya tiene el tipo VIP.";
            }

            // Actualizar el cliente si cumple las condiciones
            client.setTypeClient(newType);
            pearsonRepo.save(client);
            return "Tipo de cliente actualizado correctamente.";
        } else {
            return "Cliente no encontrado.";
        }
    }
}
