package za.ac.cput.util;

import java.util.UUID;

/* GenericHelper.java
Makes random number for ID
Author: Akhona Mngqibisa (217302394)
Date: 9 June 2021
*/
public class GenericHelper
{
    public static int generateId()
    {
        return UUID.randomUUID().toString().hashCode();
    }


}
