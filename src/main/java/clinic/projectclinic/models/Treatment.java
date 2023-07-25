package clinic.projectclinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "treatment")
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String medicals;
    private LocalDate treatedDate;
    private LocalDate ReturnDate;
    private String status; //hali bado

    @ManyToOne(cascade = CascadeType.ALL)
    private Lab labDetail;

}
