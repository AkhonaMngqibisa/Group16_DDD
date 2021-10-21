package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.service.impl.AdminService;

import java.util.Set;


@Controller
@RequestMapping("/Admin")
public class AdminController {


        @Autowired
        private AdminService adminService;

        @RequestMapping(value = "/create",method = RequestMethod.POST)
        public String create(@ModelAttribute("admin") Admin admin)
        {
            Admin newAdmin = AdminFactory.creatAdmin(admin.getFisrtName(), admin.getLastName(), admin.getPhoneNo(), admin.getEmailAddress());
            if((newAdmin.getFisrtName()== null)|| (newAdmin.getFisrtName().trim().isEmpty())
                    || (newAdmin.getLastName()==null) || (newAdmin.getLastName().trim().isEmpty())
                    || (newAdmin.getEmailAddress()==null) || newAdmin.getEmailAddress().trim().isEmpty())


                throw new NullPointerException();
            else
                adminService.create(newAdmin);
            System.out.println("SHOW THE Admin"+admin.toString());
            return "redirect:/admin/getall";

        }
        @GetMapping("/read/{id}")
        public Admin read(@PathVariable int id)
        {
            return adminService.read(id);
        }

        @PostMapping("/update")
        public Admin update(@RequestBody Admin admin)
        {
            return adminService.update(admin);
        }

        @DeleteMapping("/delete/{id}")
        public boolean delete(@PathVariable int id)
        {
            return adminService.delete(id);
        }


        @GetMapping("/getall")
        public String getAll(Model model)
        {
            Set<Admin> admins = adminService.getAll();
            model.addAttribute("listAdmin", admins);
            return "admins";
        }

        @RequestMapping("/new")
        public String showNewAdminPage(Model model) {
            Admin admin = new Admin();
            model.addAttribute("admin", admin);

            return "newAdminForm";
        }

    }


