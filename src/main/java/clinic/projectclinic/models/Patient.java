package clinic.projectclinic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String name;
    private String address;
    private LocalDate dob;
    private String phoneNo;
    private String password;
    @ManyToOne
    private Doctor doctor;
    @OneToOne
    private Card card;
    @ManyToOne
    private Notification notification;

}
