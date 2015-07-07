package pl.btbw;

import pl.btbw.factory.BirdEnum;
import pl.btbw.factory.BirdInject;
import pl.btbw.service.BirdService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AppCtrl {

    @Inject
    @BirdInject(BirdEnum.SPARROW)
    private BirdService birdService;

    @GET
    public String getTestString() {

        return "test:" + birdService.toString();
    }

}
