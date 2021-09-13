package za.ac.cput.repository;

@Deprecated //We will no longer use this we will use jpa
public interface IRepository<T, ID> {

    public T create(T t);
    public T read(ID id);
    public T update(T t);
    public boolean delete(ID id);


}
