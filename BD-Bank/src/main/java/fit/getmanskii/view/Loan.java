package fit.getmanskii.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    private int loanId;
    private String namel;
    private int srok;
    private int stavka;
    private int sumMin;
    private int sumMax;
}
