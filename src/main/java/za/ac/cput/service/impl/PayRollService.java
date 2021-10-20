/* PayRollService.java
 * Service implementation for PayRoll.
 * Author: Bokang Molaoa [ 218131097 ]
 * Date: 01 August 2021
 */
package za.ac.cput.service.impl;

import za.ac.cput.entity.PayRoll;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PayRollService extends IService<PayRoll, Integer> {
    public Set<PayRoll> getAll();
}