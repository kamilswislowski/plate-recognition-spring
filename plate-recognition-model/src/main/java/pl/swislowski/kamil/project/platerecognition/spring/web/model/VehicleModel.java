package pl.swislowski.kamil.project.platerecognition.spring.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleModel {

    private Long id;

    private RegistrationPlateModel registrationPlate;

    private LocationModel location;

}
