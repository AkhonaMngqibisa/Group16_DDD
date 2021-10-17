/* PayRollController.java
 * Controller for PayRoll.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 15 August 2021
 */
package za.ac.cput.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.PayRoll;
import za.ac.cput.factory.PayRollFactory;
import za.ac.cput.service.impl.PayRollService;
import java.util.Set;

@Controller
@RequestMapping("/payRoll")
public class PayRollController {

    @Autowired
    private PayRollService payRollService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public PayRoll create(@RequestBody PayRoll payRoll) {
        PayRoll newPayRoll = PayRollFactory.createPayRoll(8000,"55555","8");
        return payRollService.create(newPayRoll);
    }

    @GetMapping("/read/{id}")
    public PayRoll read(@PathVariable int id) { return payRollService.read(id); }

    @PostMapping("/update")
    public PayRoll update(@RequestBody PayRoll payRoll) { return payRollService.update(payRoll); }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) { return payRollService.delete(id); }

    @GetMapping("/getAll")
    public Set<PayRoll> getAll() { return payRollService.getAll(); }
}

