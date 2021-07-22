package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Member;

/* MemberFactoryTest.java
Test MemberFactory
Author: Akhona Mngqibisa (217302394)
Date: 9 June 2021
*/
class MemberFactoryTest
{
    @Test
    public void createMember()
    {
        Member member = MemberFactory.createMember("Akhona", "Mngqibisa", "Ny1 No147 Gugulethu", "0621982193", 22,"Active","a@gmail.com","123456");
        System.out.println(member);
    }

}