/* Hlumelo Mpotulo
   215226348
   Controller for WorkOutSchedule
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.WorkOutSchedule;
import za.ac.cput.factory.WorkOutScheduleFactory;
import za.ac.cput.repository.impl.IWorkOutScheduleRepository;
import za.ac.cput.service.impl.WorkOutScheduleService;
import za.ac.cput.service.impl.WorkOutService;

import java.util.Set;

public class WorkOutScheduleController {

    @Autowired
    private WorkOutScheduleService workOutScheduleService;

    @PostMapping("/create")
    @ResponseBody
    public WorkOutSchedule create(@RequestBody WorkOutSchedule workOutSchedule) {
        WorkOutSchedule newWorkOutSchedule = WorkOutScheduleFactory.createWorkOutSchedule(
                workOutSchedule.getScheduleId(),
                workOutSchedule.getTrainerId(),
                workOutSchedule.getMemberId(),
                workOutSchedule.getWorkoutId(),
                workOutSchedule.getWorkoutDate(),
                workOutSchedule.getWorkoutTime());
        return workOutScheduleService.create(newWorkOutSchedule);
    }
    @GetMapping("/read/{scheduleId}")
    @ResponseBody
    public WorkOutSchedule read(@PathVariable int scheduleId) {
        return workOutScheduleService.read(scheduleId);
    }

    @GetMapping("/update")
    @ResponseBody
    public WorkOutSchedule update(@RequestBody WorkOutSchedule WorkOutSchedule){
        return workOutScheduleService.update(WorkOutSchedule);
    }

    @GetMapping("/delete/{scheduleId}")
    @ResponseBody
    public boolean delete(@PathVariable int scheduleId){
        return workOutScheduleService.delete(scheduleId);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<WorkOutSchedule> getAll(){
        return workOutScheduleService.getAll();
    }
}