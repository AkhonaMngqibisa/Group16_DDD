package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Package;
import za.ac.cput.factory.PackageFactory;
import za.ac.cput.service.impl.IPackageService;

import java.util.Set;

@Controller
@RequestMapping("/package")
public class PackageController {
    @Autowired
    private IPackageService iPackageService;
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Package create(@RequestBody Package aPackag) {
        Package aPackage = PackageFactory.createPackage(
                aPackag.getHoursPerWeek(),
                aPackag.getPrice(), aPackag.getPackageName());
        return iPackageService.create(aPackage);
    }
    @GetMapping("/read/{packageID}")
    public Package read(@PathVariable int packageID) {
        return iPackageService.read(packageID);
    }
    @GetMapping("/update")
    public Package update(@RequestBody Package aPackage){
        return iPackageService.update(aPackage);
    }
    @GetMapping("/delete/{packageID}")
    public boolean delete(@PathVariable int packageID){
        return iPackageService.delete(packageID);
    }
    @GetMapping("/getAll")
    public Set<Package> getAll(){
        return iPackageService.getAll();
    }
}
