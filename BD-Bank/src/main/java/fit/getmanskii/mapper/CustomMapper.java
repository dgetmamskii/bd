package fit.getmanskii.mapper;

import fit.getmanskii.model.ClientEntity;
import fit.getmanskii.model.LoanEntity;
import fit.getmanskii.view.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import fit.getmanskii.view.Loan;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CustomMapper {

//    public abstract void toLoan(LoanEntity loanEntity, @MappingTarget Loan loan);

    @Mapping(ignore = true, target = "approvedLoanEntities")
    public abstract void toLoanEntity(Loan loan, @MappingTarget LoanEntity loanEntity);


    public abstract void toLoanEntityList(List<Loan> loanEntities, @MappingTarget List<LoanEntity> loans);
    public abstract void toLoanList(List<LoanEntity> loanEntities, @MappingTarget List<Loan> loans);

    @Mapping(ignore = true, target = "blockingEntities")

    public abstract void toClientList(List<ClientEntity> clientEntities, @MappingTarget List<Client> clients;

    public abstract void toClientEntity(Client client, @MappingTarget ClientEntity clientEntity);
    public abstract void toClientEntityList(List<Client> clients, @MappingTarget List<ClientEntity> clientEntities);

}
