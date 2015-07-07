package pl.btbw.factory;

import pl.btbw.service.BirdService;
import pl.btbw.service.SiskinService;
import pl.btbw.service.SparrowService;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import java.io.Serializable;

@SessionScoped
public class BirdServiceFactory implements Serializable {

    private BirdEnum birdEnum;

    @Produces
    @BirdInject(BirdEnum.SPARROW)
    public BirdService getSparrowService() {
        return new SparrowService();
    }

    @Produces
    @BirdInject(BirdEnum.SISKIN)
    public BirdService getSiskinService() {
        return new SiskinService();
    }

}
