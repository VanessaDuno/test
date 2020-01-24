package dog.ceo.msbreed.gateway;

import dog.ceo.msbreed.dto.ImagesResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class BreedDogGateway {

    private String urlApiListBreed;

    public BreedDogGateway(String urlApiListAll) {
        this.urlApiListBreed = urlApiListAll;
    }

    public ImagesResponse getDogByBreed(String breed) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("breed", breed);
        ImagesResponse response = restTemplate.getForObject(urlApiListBreed, ImagesResponse.class, params);
        return response;
    }
}
