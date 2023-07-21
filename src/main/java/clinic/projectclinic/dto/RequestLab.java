package clinic.projectclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestLab {
    private Long labId;
    private String medical;
    private Locale treatedDate;
    private Locale returnDate;
    private String status;
}
