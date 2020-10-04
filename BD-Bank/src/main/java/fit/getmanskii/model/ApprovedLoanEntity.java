package fit.getmanskii.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "approved_loan")
public class ApprovedLoanEntity {
    @Id
    @Column(name = "approved_loan_id")
    private int approvedLoanId;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    private ClientEntity clientId;
    @ManyToOne
    @JoinColumn(name = "loan_id", referencedColumnName = "loan_id", nullable = false)
    private LoanEntity loanId;
}


