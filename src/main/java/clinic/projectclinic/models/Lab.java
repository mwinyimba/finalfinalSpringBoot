package clinic.projectclinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lab")
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id ;

    private  String amount_blood;
    private  String hiv ;
    private  String pressure ;
    private  String weight;
    private String status;//kapimwa

    @ManyToOne
    private User patients;

    @ManyToOne
    private User labTech;
}
