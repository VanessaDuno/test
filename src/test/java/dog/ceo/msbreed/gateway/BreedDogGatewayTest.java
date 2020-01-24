package dog.ceo.msbreed.gateway;

import dog.ceo.msbreed.dto.ImagesResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreedDogGatewayTest {

    private BreedDogGateway breedDogGateway;

    @Before
    public void setUp (){
        breedDogGateway = new BreedDogGateway("https://dog.ceo/api/breed/{breed}/images");
    }
    @Test
    public void isClassThere (){
        Assert.assertNotNull(breedDogGateway);
    }

    @Test
    public void getListBreeds (){
        ImagesResponse response = breedDogGateway.getDogByBreed("hound");
        Assert.assertNotNull(response);
    }

}
