package fit.getmanskii.mapper;

import fit.getmanskii.model.LoanEntity;
import fit.getmanskii.view.Loan;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-03T23:38:58+0700",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class CustomMapperImpl extends CustomMapper {

    @Override
    public void toLoanEntity(Loan loan, LoanEntity loanEntity) {
        if ( loan == null ) {
            return;
        }

        loanEntity.setLoanId( loan.getLoanId() );
        loanEntity.setNamel( loan.getNamel() );
        loanEntity.setSrok( loan.getSrok() );
        loanEntity.setStavka( loan.getStavka() );
        loanEntity.setSumMin( loan.getSumMin() );
        loanEntity.setSumMax( loan.getSumMax() );
    }

    @Override
    public void toLoanEntityList(List<Loan> loanEntities, List<LoanEntity> loans) {
        if ( loanEntities == null ) {
            return;
        }

        loans.clear();
        for ( Loan loan : loanEntities ) {
            loans.add( loanToLoanEntity( loan ) );
        }
    }

    @Override
    public void toLoanList(List<LoanEntity> loanEntities, List<Loan> loans) {
        if ( loanEntities == null ) {
            return;
        }

        loans.clear();
        for ( LoanEntity loanEntity : loanEntities ) {
            loans.add( loanEntityToLoan( loanEntity ) );
        }
    }

    protected LoanEntity loanToLoanEntity(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanEntity loanEntity = new LoanEntity();

        loanEntity.setLoanId( loan.getLoanId() );
        loanEntity.setNamel( loan.getNamel() );
        loanEntity.setSrok( loan.getSrok() );
        loanEntity.setStavka( loan.getStavka() );
        loanEntity.setSumMin( loan.getSumMin() );
        loanEntity.setSumMax( loan.getSumMax() );

        return loanEntity;
    }

    protected Loan loanEntityToLoan(LoanEntity loanEntity) {
        if ( loanEntity == null ) {
            return null;
        }

        Loan loan = new Loan();

        loan.setLoanId( loanEntity.getLoanId() );
        loan.setNamel( loanEntity.getNamel() );
        loan.setSrok( loanEntity.getSrok() );
        loan.setStavka( loanEntity.getStavka() );
        loan.setSumMin( loanEntity.getSumMin() );
        loan.setSumMax( loanEntity.getSumMax() );

        return loan;
    }
}
