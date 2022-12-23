package ExamenFinal_backend.examen.entities;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name = "bill")
public class bill implements Serializable {
    @Id
    @Column(unique = true,length = 15)
    private int serial;

    @Column(nullable = false)
    private Date date_bill;

    @Column(nullable = false,length = 50)
    private int user_id;

    @Column(nullable = false,length = 50)
    private String observation;

    @ManyToOne
    @JoinColumn(name = "transaction_user",insertable = false,updatable = false)
    private transaction_user transaction_user;

}
