package clinic.projectclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestMessage {
    private long patientId;
    private String sms;
    private String respSms;
    private  String status;
}
