package clinic.projectclinic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private  String name;
    private  String address;
    private  String email;
    private  String PhoneNo;
    @ManyToOne
    private  Role role;
   @ManyToOne
    private Patient patient;

}
