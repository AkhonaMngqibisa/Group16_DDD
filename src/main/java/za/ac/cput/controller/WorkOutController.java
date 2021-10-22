/* Hlumelo Mpotulo
   215226348
   Controller for WorkOut
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.factory.WorkOutFactory;
import za.ac.cput.service.impl.WorkOutService;
import za.ac.cput.repository.impl.IWorkOutRepository;

import java.util.Set;

@Controller
@RequestMapping("/WorkOut")
public class WorkOutController {

    @Autowired
    private WorkOutService workOutService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String create(@ModelAttribute("WorkOut")WorkOut workOut) {
        WorkOut newWorkOut = WorkOutFactory.createWorkOut(workOut.getWorkoutId(),
                workOut.getWorkoutName(),
                workOut.getWorkoutDescription());

//        if(!(!(newWorkOut.getWorkoutId() = 89) && !(newWorkOut.getWorkoutId().trim.isEmpty())
//                && !(newMember.getLastName() == null) && !(newMember.getLastName().trim().isEmpty())
//                && !(newMember.getEmailAddress() == null) && !newMember.getEmailAddress().trim().isEmpty()))
//            //These are compulsory
//
//            throw new NullPointerException();
//        else
//            memberService.create(newMember);
//        System.out.println("SHOW THE MEMBER"+member.toString());
//        return "redirect:/member/getall";
        return null;
    }
    @GetMapping("/read/{workOutId}")
    public WorkOut read(@PathVariable int workOut) {
        return workOutService.read(workOut);
    }

    @PostMapping("/update")
    public WorkOut update(@RequestBody WorkOut workOut)
    {
        return workOutService.update(workOut);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return workOutService.delete(id);
    }


    @GetMapping("/getall")
    public Set<WorkOut> getAll(){
        return workOutService.getAll();}

    @RequestMapping("/new")
    public String showNewWorkOut(Model model) {
        WorkOut workOut = new WorkOut();
        model.addAttribute("workOut", workOut);

        return "newWorkOut";
    }

}