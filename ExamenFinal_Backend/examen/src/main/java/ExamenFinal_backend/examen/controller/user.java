package ExamenFinal_backend.examen.controller;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name = "user")
public class user implements Serializable {
    @Id
    @Column(unique = true,length = 15)
    private int id;

    @Column(nullable = false,length = 50)
    private String username;

    @Column(nullable = false,length = 50)
    private String pass;

    @Column(nullable = false,length = 50)
    private String email;

    @ManyToOne
    @JoinColumn(name = "user",insertable = false,updatable = false)
    private user user;

}
