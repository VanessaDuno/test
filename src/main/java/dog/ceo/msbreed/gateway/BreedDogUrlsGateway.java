package dog.ceo.msbreed.gateway;

import dog.ceo.msbreed.dto.UrlsApiBreedDog;
import org.springframework.web.client.RestTemplate;

public class BreedDogUrlsGateway {

    private String urlService;

    public BreedDogUrlsGateway(String urlService) {
        this.urlService= urlService;
    }

    public UrlsApiBreedDog getUrlsApiBreedDog() {
        RestTemplate restTemplate = new RestTemplate();
        UrlsApiBreedDog urlsApiBreedDog = restTemplate.getForObject(urlService, UrlsApiBreedDog.class);
        return urlsApiBreedDog;
    }
}
