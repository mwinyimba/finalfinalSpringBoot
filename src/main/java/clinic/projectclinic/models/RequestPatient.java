package clinic.projectclinic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestPatient {
    private Long patientId;
    private Long labTech;
    private String pressure;
    private  String hiv;
    private String weight;
    private  String amount_blood;

}
