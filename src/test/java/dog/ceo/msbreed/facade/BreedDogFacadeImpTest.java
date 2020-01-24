package dog.ceo.msbreed.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import dog.ceo.msbreed.dto.BreedsResponse;
import dog.ceo.msbreed.gateway.BreedDogGateway;
import dog.ceo.msbreed.gateway.BreedsListGateway;
import dog.ceo.msbreed.mappers.BreedsListMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreedDogFacadeImpTest {

    private BreedDogGateway breedDogGateway;
    private BreedsListGateway breedsListGateway;
    private BreedsListMapper breedsListMapper;
    private BreedDogFacadeImp BreedDogFacadeImp;

    @Before
    public void setUp (){
        breedsListMapper = new BreedsListMapper();
        breedDogGateway = new BreedDogGateway("https://dog.ceo/api/breed/{breed}/images");
        breedsListGateway = new BreedsListGateway("https://dog.ceo/api/breeds/list/all", breedsListMapper);
        BreedDogFacadeImp = new BreedDogFacadeImp(breedDogGateway, breedsListGateway);
    }

    @Test
    public void isClassThere (){
        Assert.assertNotNull(BreedDogFacadeImp);
    }

    @Test
    public void isMethodbreedDogsResultThere () throws JsonProcessingException {
       BreedsResponse breedsResponse=  BreedDogFacadeImp.processRequest(("bulldog"));
       Assert.assertNotNull(breedsResponse);
    }
}
