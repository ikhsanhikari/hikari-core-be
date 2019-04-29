package id.hikari.core.be.hikaricorebe.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "menu")
@Setter
@Getter
public class Menu extends BaseData implements Serializable {
    private static final long serialVersionUID = 1709189606106768711L;

    @Id
    private Long id;

    @Column(name = "name")
    private String name;
}
