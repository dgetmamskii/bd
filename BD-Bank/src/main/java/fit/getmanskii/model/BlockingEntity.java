package fit.getmanskii.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "blocking")
public class BlockingEntity {
    @EmbeddedId
    private BlockingEntityPK blockingEntityPK;
    private Date dateBegin;
    private Date dateEnd;

    @MapsId("clientId")
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    private ClientEntity clientId;
}
