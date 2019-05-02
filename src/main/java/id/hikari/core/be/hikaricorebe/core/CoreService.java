package id.hikari.core.be.hikaricorebe.core;


public interface CoreService<MODEL> {
    Iterable<MODEL> findAll();

    MODEL findById(Long id);

    MODEL delete(Long id);

    MODEL save(MODEL model);

    MODEL update(MODEL model);
}
