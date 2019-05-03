package id.hikari.core.be.hikaricorebe.core;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CoreEndPoint<MODEL> {
    @GetMapping("/findAll")
    Iterable<MODEL> findAll();

    @GetMapping("/findById")
    MODEL findById(Long id);

    MODEL delete(Long id);

    @PostMapping("/save")
    MODEL save(@RequestBody  MODEL model);

    MODEL update(MODEL model);
}
