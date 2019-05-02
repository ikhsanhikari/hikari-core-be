package id.hikari.core.be.hikaricorebe.endpoint.impl;


import id.hikari.core.be.hikaricorebe.core.impl.CoreEndPointImpl;
import id.hikari.core.be.hikaricorebe.data.model.Menu;
import id.hikari.core.be.hikaricorebe.endpoint.MenuEndPoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuEndPointImpl<Menu> extends CoreEndPointImpl<Menu> implements MenuEndPoint {
}
