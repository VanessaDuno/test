package dog.ceo.msbreed.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dog.ceo.msbreed.dto.BreedSubBreedsResponse;
import dog.ceo.msbreed.dto.SubBreed;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BreedsListMapper {

    public List<BreedSubBreedsResponse> map(String breedResponseJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, List<String>> myData = mapper.readValue(breedResponseJson, Map.class);
        Map<String,List<SubBreed>> list = (Map<String, List<SubBreed>>) myData.get("message");
        List<BreedSubBreedsResponse> breedsResponseList = new ArrayList<>();
        list.forEach((breedParam, subBreedParam) -> {
            BreedSubBreedsResponse breedSubBreedsResponse = BreedSubBreedsResponse.builder().breed(breedParam).subBreeds(subBreedParam).build();
            breedsResponseList.add(breedSubBreedsResponse);
        } );
        return breedsResponseList;
    }
}
