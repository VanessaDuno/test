package dog.ceo.msbreed.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import dog.ceo.msbreed.dto.BreedsResponse;

public interface BreedDogFacade {

    BreedsResponse processRequest(String breed) throws JsonProcessingException;
}
