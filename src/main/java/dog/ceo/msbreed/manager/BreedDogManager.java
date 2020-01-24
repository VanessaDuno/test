package dog.ceo.msbreed.manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import dog.ceo.msbreed.dto.BreedsResponse;
import dog.ceo.msbreed.facade.BreedDogFacade;

public class BreedDogManager {

    private BreedDogFacade breedDogFacade;

    public BreedDogManager(BreedDogFacade breedDogFacade) {
        this.breedDogFacade = breedDogFacade;
    }

    public BreedsResponse execute (String breed) throws JsonProcessingException {
       return breedDogFacade.processRequest(breed);
    }
}
