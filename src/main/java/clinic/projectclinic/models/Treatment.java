package clinic.projectclinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "treatment")
public class Treatment {
    @Id
    private long id;
    private String medicals;
    private Locale treatedDate;
    private Locale ReturnDate;
    private String status; //hali bado

    @ManyToOne
    private Lab labInfo;
}
