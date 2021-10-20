package za.ac.cput.service;

public interface IService <T, ID> {

    static T create(T t);
    static T read(ID id);
    T update(T t);
    static boolean delete(ID id);
}
