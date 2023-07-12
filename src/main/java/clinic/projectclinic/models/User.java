package clinic.projectclinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String first_name;
    private  String last_name ;
    private String age;
    private  String phone_No;
    private String email;
    private  String password;
   private String username;
    private  String address;
    private  String status ;
    private String role_name;
}
