package dog.ceo.msbreed.gateway;

import dog.ceo.msbreed.dto.UrlsApiBreedDog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreedDogUrlsGatewayTest {

    private BreedDogUrlsGateway breedDogUrlsGateway;

    @Before
    public void setUp(){
        breedDogUrlsGateway = new BreedDogUrlsGateway("http://localhost:9090/api/breed/urls");
    }

    @Test
    public void isClassThere (){
        Assert.assertNotNull(breedDogUrlsGateway);
    }

    @Test
    public void isMethodGetUrlsThere (){
        UrlsApiBreedDog urlsApiBreedDog = breedDogUrlsGateway.getUrlsApiBreedDog();
        Assert.assertNotNull(urlsApiBreedDog);
        Assert.assertEquals("https://dog.ceo/api/breeds/list/all", urlsApiBreedDog.getUrlListAll());
        Assert.assertEquals("https://dog.ceo/api/breed/{breed}/images", urlsApiBreedDog.getUrlImagesBreed());
    }
}
