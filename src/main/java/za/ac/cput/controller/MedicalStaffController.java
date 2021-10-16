/* MedicalStaffController.java
 * Controller for MedicalStaff
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 18 August 2021
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.MedicalStaff;
import za.ac.cput.factory.MedicalStaffFactory;
import za.ac.cput.service.impl.MedicalStaffService;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@RestController
@RequestMapping("/medicalstaff")
public class MedicalStaffController {
    
    @Autowired
    private MedicalStaffService medicalStaffService;

    @PostMapping(value="/create", consumes= MediaType.APPLICATION_JSON_VALUE)
    public MedicalStaff create_application_json(@RequestBody MedicalStaff medicalStaff) {
        MedicalStaff newMedicalStaff =
                MedicalStaffFactory.createMedicalStaff(
                        medicalStaff.getFirstName(),
                        medicalStaff.getLastName(),
                        medicalStaff.getEmail(),
                        medicalStaff.getPhoneNumber()
                        );
        return medicalStaffService.create(newMedicalStaff);
    }

    @PostMapping(value="/create", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
    public MedicalStaff create_multipart_form_data(@ModelAttribute("medicalStaff") MedicalStaff medicalStaff) {
        MedicalStaff newMedicalStaff =
                MedicalStaffFactory.createMedicalStaff(
                        medicalStaff.getFirstName(),
                        medicalStaff.getLastName(),
                        medicalStaff.getEmail(),
                        medicalStaff.getPhoneNumber()
                        );
        return medicalStaffService.create(newMedicalStaff);
    }

    @GetMapping("/read/{id}")
    public MedicalStaff read(@PathVariable int id) {
        return medicalStaffService.read(id);
    }

    @PostMapping("/update")
    public MedicalStaff update(@RequestBody MedicalStaff medicalStaff) {
        return medicalStaffService.update(medicalStaff);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return medicalStaffService.delete(id);
    }

    @GetMapping("/getall")
    public Set<MedicalStaff> getAll() {
        return medicalStaffService.getAll();
    }

}
