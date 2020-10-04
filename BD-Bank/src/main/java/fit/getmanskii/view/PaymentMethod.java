package fit.getmanskii.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethod {
    private int pmethodId;
    private String namep;
    private int commission;
    private boolean inDebt;
    private int typePaymentId;
}
