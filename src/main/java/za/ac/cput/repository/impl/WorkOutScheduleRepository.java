//package za.ac.cput.repository.impl;
//
///* Hlumelo Mpotulo
//   215226348
//   WorkOutSchedule Repository
//
// */
//import za.ac.cput.entity.WorkOutSchedule;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class WorkOutScheduleRepository implements IWorkOutScheduleRepository {
//    private static WorkOutScheduleRepository workOutScheduleRepository = null;
//    private Set<WorkOutSchedule> WorkOutScheduleSet;
//
//    private WorkOutScheduleRepository()
//    {
//        WorkOutScheduleSet = new HashSet<>();
//    }
//
//    public static WorkOutScheduleRepository getRepository()
//    {
//        if(workOutScheduleRepository == null)
//        {
//            workOutScheduleRepository = new WorkOutScheduleRepository();
//        }
//        return workOutScheduleRepository;
//    }
//
//    @Override
//    public WorkOutSchedule create(WorkOutSchedule workOutSchedule) {
//        boolean success = WorkOutScheduleSet.add(workOutSchedule);
//        if(!success)
//            return null;
//
//        return workOutSchedule;
//    }
//
//    @Override
//    public WorkOutSchedule read(Integer integer) {
//        for(WorkOutSchedule ws :WorkOutScheduleSet)
//
//            if (ws.getScheduleId()==WorkOutSchedule.getScheduleId())
//                return ws;
//        return null;
//
//    }
//
//    @Override
//    public  WorkOutSchedule update(WorkOutSchedule workOutSchedule) {
//        WorkOutSchedule _WorkOutSchedule = read(workOutSchedule.getScheduleId());
//        if(_WorkOutSchedule != null)
//        {
//            WorkOutScheduleSet.remove(_WorkOutSchedule);
//            WorkOutScheduleSet.add(workOutSchedule);
//            return workOutSchedule;
//        }
//
//        return null;
//    }
//
//    @Override
//    public boolean delete(Integer integer) {
//        WorkOutSchedule delete = read(integer);
//        if(delete == null)
//            return false;
//        WorkOutScheduleSet.remove(delete);
//        return true;
//    }
//
//    @Override
//    public  Set<WorkOutSchedule> getAll() {
//        return WorkOutScheduleSet;
//    }
//}
