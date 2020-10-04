package fit.getmanskii.service;

import lombok.AllArgsConstructor;
import fit.getmanskii.mapper.CustomMapper;
import fit.getmanskii.model.LoanEntity;
import org.springframework.stereotype.Service;
import fit.getmanskii.repository.LoanRepository;
import fit.getmanskii.view.Loan;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LoanService {
    private final LoanRepository loanRepository;
    private final CustomMapper mapper;

    public List<Loan> showAll() {
        List<LoanEntity> loanEntities = loanRepository.findAll();
        List<Loan> loans = new ArrayList<>();
        mapper.toLoanList(loanEntities, loans);
        return loans;
    }
}
