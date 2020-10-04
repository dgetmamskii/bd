package fit.getmanskii.service;


import fit.getmanskii.mapper.CustomMapper;
import fit.getmanskii.model.ClientEntity;
import fit.getmanskii.model.LoanEntity;
import fit.getmanskii.repository.ClientRepository;
import fit.getmanskii.view.Client;
import fit.getmanskii.view.Loan;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final CustomMapper mapper;

    public List<Client> showAll() {
        List<ClientEntity> clientEntities = ClientRepository.findAll();
        List<Client> clients = new ArrayList<>();
        mapper.toClientList(clientEntities, clients);
        return clients;
    }
}
