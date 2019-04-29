package id.hikari.core.be.hikaricorebe.dao;

import id.hikari.core.be.hikaricorebe.data.model.BaseData;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created on 4/29/19.
 *
 * @author <a href="mailto:ikhsanhikari29@gmail.com">Nurikhsan</a>
 * @param <MODEL>
 */
public interface CoreDAO<MODEL extends BaseData> extends JpaRepository<MODEL,Long> {

}
