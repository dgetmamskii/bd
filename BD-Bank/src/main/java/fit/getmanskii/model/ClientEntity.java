package fit.getmanskii.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "client")
public class ClientEntity {
    @Id
    private int clientId;
    private String firstName;
    private String secondName;
    private String patronymic;
    private int balance;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "clientId")
    Collection<ApprovedLoanEntity> approvedLoanEntities;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "clientId")
    Collection<BlockingEntity> blockingEntities;

}
