package id.hikari.core.be.hikaricorebe.core.impl;

import id.hikari.core.be.hikaricorebe.core.CoreEndPoint;
import id.hikari.core.be.hikaricorebe.core.CoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class CoreEndPointImpl<MODEL> implements CoreEndPoint<MODEL> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoreEndPointImpl.class);
    @Autowired
    private CoreService<MODEL> coreService;

    @Override
    public Iterable<MODEL> findAll() {
        return coreService.findAll();
    }

    @Override
    public MODEL findById(@PathVariable("id") Long id) {
        return coreService.findById(id);
    }

    @Override
    public MODEL delete(Long id) {
        return null;
    }

    @Override
    public MODEL save(@RequestBody MODEL model) {
        return coreService.save(model);
    }

    @Override
    public MODEL update(MODEL model) {
        return null;
    }
}
