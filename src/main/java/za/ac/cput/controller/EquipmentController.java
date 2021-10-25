package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Equipment;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.EquipmentFactory;
import za.ac.cput.service.impl.EquipmentService;
import java.util.Set;

/* EquipmentController.java
Controller for the Equipment
Author: Lilitha Moni (219068429)
Date:16 August 2021
*/

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody

    public Equipment create(@RequestBody Equipment equipment)
    {
        Equipment newEquipment = EquipmentFactory.createEquipment(equipment.getEqName(),equipment.getEqModel(),equipment.getEqInfo());
        return equipmentService.create(newEquipment);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Equipment read(@PathVariable int id)
    {
        return equipmentService.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Equipment update(@RequestBody Equipment equipment)
    {

        return equipmentService.update(equipment);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return equipmentService.delete(id);
    }


    @GetMapping("/getall")
    public Set<Equipment> getAll()
    {
        return equipmentService.getAll();
    }


}