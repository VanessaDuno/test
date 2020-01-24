package dog.ceo.msbreed.gateway;

import com.fasterxml.jackson.core.JsonProcessingException;
import dog.ceo.msbreed.dto.BreedSubBreedsResponse;
import dog.ceo.msbreed.mappers.BreedsListMapper;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class BreedsListGateway {

    private String urlListAll;
    private BreedsListMapper breedsListMapper;

    public BreedsListGateway(String urlListAll, BreedsListMapper breedsListMapper) {
        this.urlListAll = urlListAll;
        this.breedsListMapper = breedsListMapper;
    }

    public List<BreedSubBreedsResponse> getListAllDogs() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(urlListAll, String.class);
        return breedsListMapper.map(response);
    }


}
