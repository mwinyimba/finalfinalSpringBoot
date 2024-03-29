package clinic.projectclinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aaa")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String full_name;
    private String age;
    private  String phone_No;
    private String type_sickle;
    private String email;
    private  String password;
    private  String address;
    private String gender;
    private  String statusPatient;
    private String role_name;


//    @OneToMany(mappedBy ="labTech")
//    private List<Lab> lab;
//
//    @OneToMany(mappedBy ="patients")
//    private List<Lab> patients;
//    @OneToMany (mappedBy = "mes")
//    private List<Message>  messages;
}
