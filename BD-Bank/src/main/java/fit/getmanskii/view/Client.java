package fit.getmanskii.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private int clientId;
    private String firstName;
    private String secondName;
    private String patronymic;
    private int balance;
}
