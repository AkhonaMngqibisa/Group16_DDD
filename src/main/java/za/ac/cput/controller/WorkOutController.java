/* Hlumelo Mpotulo
   215226348
   Controller for WorkOut
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.cput.entity.WorkOut;
import za.ac.cput.factory.WorkOutFactory;
import za.ac.cput.repository.impl.IWorkOutRepository;

import java.util.Set;

public class WorkOutController {
    @Autowired
    private IWorkOutRepository IWorkOut;

    @PostMapping("/create")
    public WorkOut create(@RequestBody WorkOut workOut) {
        WorkOut WorkOut2 = WorkOutFactory.createWorkOut(workOut.getWorkoutId(), workOut.getWorkoutName()
                ,workOut.getWorkoutDescription());
        return IWorkOut.create(workOut);
    }
    @GetMapping("/read/{WorkOutId}")
    public WorkOut read(@PathVariable int workOutId) {
        return IWorkOut.read(workOutId);
    }

    @GetMapping("/update")
    public WorkOut update(@RequestBody WorkOut workOut){
        return IWorkOut.update(workOut);

    }
    @GetMapping("/delete/{reportID}")
    public boolean delete(@PathVariable int workOutId){
        return IWorkOut.delete(workOutId);
    }
    @GetMapping("/getAll")
    public Set<WorkOut> getAll(){
        return IWorkOut.getAll();
    }
}
