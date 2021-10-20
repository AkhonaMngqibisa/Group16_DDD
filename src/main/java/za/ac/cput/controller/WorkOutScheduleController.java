/* Hlumelo Mpotulo
   215226348
   Controller for WorkOutSchedule
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.factory.WorkOutScheduleFactory;
import za.ac.cput.repository.impl.IWorkOutScheduleRepository;

import java.util.Set;

public class WorkOutScheduleController {

    @Autowired
    private IWorkOutScheduleRepository IWorkOutSchedule;

    @PostMapping("/create")
    public WorkOutSchedule create(@RequestBody WorkOutSchedule WorkOutSchedule) {
        WorkOutSchedule WorkOutSchedule2 = WorkOutScheduleFactory.createWorkOutSchedule(WorkOutSchedule.getScheduleId(), WorkOutSchedule.getTrainerId()
                ,WorkOutSchedule.getMemberId(),
                WorkOutSchedule.getWorkoutId(),
                WorkOutSchedule.getWorkoutDate(),
                WorkOutSchedule.getWorkoutTime());
        return IWorkOutSchedule.create(WorkOutSchedule);
    }
    @GetMapping("/read/{scheduleId}")
    public WorkOutSchedule read(@PathVariable int scheduleId) {
        return IWorkOutSchedule.read(scheduleId);
    }

    @GetMapping("/update")
    public WorkOutSchedule update(@RequestBody WorkOutSchedule WorkOutSchedule){
        return IWorkOutSchedule.update(WorkOutSchedule);

    }
    @GetMapping("/delete/{scheduleId}")
    public boolean delete(@PathVariable int scheduleId){
        return IWorkOutSchedule.delete(scheduleId);
    }

    @GetMapping("/getAll")
    public Set<WorkOutSchedule> getAll(){
        return IWorkOutSchedule.getAll();
    }
}
