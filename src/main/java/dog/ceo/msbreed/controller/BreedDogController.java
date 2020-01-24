package dog.ceo.msbreed.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import dog.ceo.msbreed.dto.BreedsResponse;
import dog.ceo.msbreed.manager.BreedDogManager;
import dog.ceo.msbreed.manager.FlowManagerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreedDogController {

    private FlowManagerFactory flowManagerFactory;

    public BreedDogController(FlowManagerFactory flowManagerFactory) {
        this.flowManagerFactory = flowManagerFactory;
    }

    @RequestMapping(value="/api/breed/{breedName}/images", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<BreedsResponse> getImagesByBreed (@PathVariable String breedName) throws JsonProcessingException {
        BreedDogManager breedDogManager = flowManagerFactory.init();
        return new ResponseEntity<BreedsResponse>(breedDogManager.execute(breedName), HttpStatus.OK);
    }
}
