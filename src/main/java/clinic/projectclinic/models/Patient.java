package clinic.projectclinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
//@EqualsAndHashCode(callSuper = true)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String name;
    private String address;
    private String email;
    private LocalDate dob;
    private String gender;
    private String phoneNo;
    private String password;
//    @ManyToOne
//    private Doctor doctor;
        


}
