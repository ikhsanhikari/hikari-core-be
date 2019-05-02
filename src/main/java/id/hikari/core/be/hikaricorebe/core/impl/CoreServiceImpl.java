package id.hikari.core.be.hikaricorebe.core.impl;

import id.hikari.core.be.hikaricorebe.core.CoreDAO;
import id.hikari.core.be.hikaricorebe.core.CoreService;
import id.hikari.core.be.hikaricorebe.data.model.BaseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CoreServiceImpl<MODEL extends BaseData> implements CoreService<MODEL> {

    @Autowired
    private CoreDAO<MODEL> coreDAO;

    @Override
    public Iterable<MODEL> findAll() {
        return coreDAO.findAll();
    }

    @Override
    public MODEL findById(Long id) {
        MODEL model ;
        if(id!=null){
            model = coreDAO.findById(id).orElse(null);
        }else{
            model = null;
        }
        return model;
    }

    @Override
    public MODEL delete(Long id) {
        return null;
    }

    @Override
    public MODEL save(MODEL model) {
        return coreDAO.save(model);
    }

    @Override
    public MODEL update(MODEL model) {
        return null;
    }
}
