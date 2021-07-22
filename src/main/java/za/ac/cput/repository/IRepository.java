package za.ac.cput.repository;

public interface IRepository<T, ID> {

    public T create(T t);
    public T read(ID id);
    public T update(T t);
    public boolean delete(ID id);


}
