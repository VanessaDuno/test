package dog.ceo.msbreed.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import dog.ceo.msbreed.dto.BreedSubBreedsResponse;
import dog.ceo.msbreed.dto.BreedsResponse;
import dog.ceo.msbreed.dto.ImagesResponse;
import dog.ceo.msbreed.gateway.BreedDogGateway;
import dog.ceo.msbreed.gateway.BreedsListGateway;

import java.util.List;
import java.util.stream.Collectors;

public class BreedDogFacadeImp implements BreedDogFacade {

    private BreedDogGateway breedDogGateway;
    private BreedsListGateway breedsListGateway;

    public BreedDogFacadeImp(BreedDogGateway breedDogGateway, BreedsListGateway breedsListGateway) {
        this.breedDogGateway = breedDogGateway;
        this.breedsListGateway = breedsListGateway;
    }

    private BreedsResponse generateResponse(ImagesResponse images, List<BreedSubBreedsResponse> listSubBreedXBreed) {
        BreedsResponse breedsResponse = new BreedsResponse(listSubBreedXBreed.get(0), images);
        return breedsResponse;
    }

    @Override
    public BreedsResponse processRequest(String breedName) throws JsonProcessingException {
        ImagesResponse images  = breedDogGateway.getDogByBreed(breedName);
        List<BreedSubBreedsResponse> listSubBreedXBreed = breedsListGateway.getListAllDogs()
                .stream()
                .filter(c-> c.getBreed().equals(breedName))
                .collect(Collectors.toList());
        return generateResponse (images, listSubBreedXBreed);
    }


}
