//package za.ac.cput.repository.impl;
//
///* Hlumelo Mpotulo
//   215226348
//   workout repository
// */
//
//import org.springframework.stereotype.Repository;
//import za.ac.cput.entity.WorkOut;
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class WorkOutRepository implements IWorkOutRepository {
//
//    private static WorkOutRepository workOutRepository = null;
//    private Set<WorkOut> workOutSet;
//
//    public WorkOutRepository() {
//        this.workOutSet = new HashSet<>();
//    }
//
//    public static WorkOutRepository getWorkOutRepository(){
//
//        if(workOutRepository == null)
//        {
//            workOutRepository = new WorkOutRepository();
//        }
//        return workOutRepository;
//    }
//
//    @Override
//    public static WorkOut create(WorkOut workOut) {
//
//
//        boolean added = workOutSet.add(workOut);
//        if(!added)
//            return null;
//
//        return workOut;
//    }
//
//    @Override
//    public static WorkOut read(Integer WorkOutId) {
//
//        for(WorkOut workOut : workOutSet)
//
//            if(workOut.getWorkoutId()==WorkOutId)
//            {
//                return workOut;
//            }
//        return null;
//    }
//
//    @Override
//    public static WorkOut update(WorkOut workOut) {
//
//        WorkOut workOut1 = read(workOut.getWorkoutId());
//        if(workOutSet != null)
//        {
//            workOutSet.remove(workOut1);
//            workOutSet.add(workOut1);
//            return workOut;
//        }
//        return null;
//    }
//
//    @Override
//    public static boolean delete(Integer ID) {
//
//        WorkOut delete = read(ID);
//        if(delete == null)
//            return false;
//        workOutSet.remove(delete);
//        return true;
//    }
//
//    @Override
//    public static Set<WorkOut> getAll() {
//        return workOutSet;
//    }
//}
