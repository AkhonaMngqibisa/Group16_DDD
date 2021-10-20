package za.ac.cput.repository.impl;
/**
 PackageRepository.java
 Repository: PackageRepository
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

/*public class PackageRepository implements IPackageRepository {
    private static PackageRepository packageRepository = null;
    private Set<Package> packageSet;

    private PackageRepository() {
        this.packageSet = new HashSet<>();
    }

    public static IPackageRepository getPackageRepository() {
        if (packageRepository == null) {
            packageRepository = new PackageRepository();
        }
        return new PackageRepository();
    }

    @Override
    public Package create(Package aPackage) {
        this.packageSet.add(aPackage);
        return aPackage;
    }

    @Override
    public Package read(Integer integer) {
        for (Package aPackage : this.packageSet) {
            return aPackage;
        }
        return null;
    }

    @Override
    public Package update(Package aPackage) {
        Package update = read(aPackage.getPackageID());
        if (update != null)
            this.packageSet.remove(update);
            this.packageSet.add(aPackage);
        return aPackage;
    }

    @Override
    public boolean delete(Integer integer) {
        Package aPackage = read(integer);
        if (aPackage != null) {
            this.packageSet.remove(aPackage);
            return true;
        } else {
            return false;
        }
    }
        @Override
        public Set<Package> getAll () {
            return this.packageSet;
        }

    @Override
    public List<Package> findAll() {
        return null;
    }

    @Override
    public List<Package> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Package> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Package> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Package aPackage) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Package> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Package> S save(S s) {
        return null;
    }

    @Override
    public <S extends Package> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Package> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Package> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Package> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Package> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Package getOne(Integer integer) {
        return null;
    }

    @Override
    public Package getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Package> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Package> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Package> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Package> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Package> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Package> boolean exists(Example<S> example) {
        return false;
    }
}

 */
