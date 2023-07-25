package clinic.projectclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestLab {
    private Long labId;
    private String medical;
    private LocalDate returnDate;
}
