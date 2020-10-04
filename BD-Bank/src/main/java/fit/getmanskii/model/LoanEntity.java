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
@Table(name = "loan")
public class LoanEntity {
    @Id
    private int loanId;

    private String namel;
    private int srok;
    private int stavka;
    private int sumMin;
    private int sumMax;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "loanId")
    Collection<ApprovedLoanEntity> approvedLoanEntities;

}
