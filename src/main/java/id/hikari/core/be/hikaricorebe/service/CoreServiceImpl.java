package id.hikari.core.be.hikaricorebe.service;

import id.hikari.core.be.hikaricorebe.dao.CoreDAO;
import id.hikari.core.be.hikaricorebe.data.model.BaseData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoreServiceImpl<MODEL extends BaseData> implements CoreService<MODEL>{


    private CoreDAO<MODEL> coreDAO;

    @Override
    public List<MODEL> findAll() {
        return coreDAO.findAll();
    }
}
