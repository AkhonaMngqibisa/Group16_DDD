package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Supplier;
import za.ac.cput.factory.SupplierFactory;
import za.ac.cput.service.impl.SupplierService;
import java.util.Set;

/* SupplierController.java
Controller for the Supplier
Author: Lilitha Moni (219068429)
Date:16 August 2021
*/

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/Create")
    public Supplier create(@RequestBody Supplier supplier)
    {
        Supplier newSupplier = SupplierFactory.createSupplier(supplier.getSupName(),supplier.getEqId());
        return supplierService.create(newSupplier);
    }

    @GetMapping("/read/{id}")
    public Supplier read(@PathVariable int id)
    {
        return supplierService.read(id);
    }

    @PostMapping("/update")
    public Supplier update(@RequestBody Supplier supplier)
    {

        return supplierService.update(supplier);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return supplierService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Supplier> getAll()
    {
        return supplierService.getAll();
    }

}
