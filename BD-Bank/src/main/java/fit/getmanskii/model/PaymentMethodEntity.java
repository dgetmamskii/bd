package fit.getmanskii.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "payment_method")
public class PaymentMethodEntity {
    @Id
    private int pmethodId;

    private String namep;
    private int commission;
    private boolean inDebt;
    private int typePaymentId;
}
