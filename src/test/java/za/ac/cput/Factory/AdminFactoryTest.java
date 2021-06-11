package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {

    @Test
    public void createAdmin(){
        Admin admin=AdminFactory.creatAdmin("bongisa","mpahleni",
                "0781837656","216205999@mycput.ac.za");
        System.out.println(admin);

    }

}