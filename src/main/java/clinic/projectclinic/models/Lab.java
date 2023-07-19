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

    @ManyToOne(cascade = CascadeType.ALL)
    private User patients;

    @ManyToOne(cascade = CascadeType.ALL)
    private User labTech;

    @OneToMany(mappedBy = "measured")
    private List<Treatment> treatments ;
}
