package id.hikari.core.be.hikaricorebe.service;

import java.util.List;

public interface CoreService<MODEL> {
    List<MODEL> findAll();
}
