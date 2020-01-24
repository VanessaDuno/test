
package dog.ceo.msbreed.dto;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
@Builder
public class BreedSubBreedsResponse {

    public String breed;

     public List<SubBreed> subBreeds= new ArrayList<SubBreed>();

    public BreedSubBreedsResponse(String breed, List<SubBreed> subBreeds) {
        this.breed = breed;
        this.subBreeds = subBreeds;
    }
    public BreedSubBreedsResponse() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<SubBreed> getSubBreeds() {
        return subBreeds;
    }

    public void setSubBreeds(List<SubBreed> subBreeds) {
        this.subBreeds = subBreeds;
    }
}
