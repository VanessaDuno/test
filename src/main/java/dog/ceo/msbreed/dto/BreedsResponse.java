package dog.ceo.msbreed.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class BreedsResponse {

    @JsonUnwrapped
    private BreedSubBreedsResponse breedSubBreedsResponse;
    @JsonUnwrapped
    private ImagesResponse imagesResponseList;

    public BreedsResponse(BreedSubBreedsResponse breedSubBreedsResponse, ImagesResponse imagesResponseList) {
        this.breedSubBreedsResponse = breedSubBreedsResponse;
        this.imagesResponseList = imagesResponseList;
    }

    public BreedSubBreedsResponse getBreedSubBreedsResponse() {
        return breedSubBreedsResponse;
    }

    public void setBreedSubBreedsResponse(BreedSubBreedsResponse breedSubBreedsResponse) {
        this.breedSubBreedsResponse = breedSubBreedsResponse;
    }

    public ImagesResponse getImagesResponseList() {
        return imagesResponseList;
    }

    public void setImagesResponseList(ImagesResponse imagesResponseList) {
        this.imagesResponseList = imagesResponseList;
    }
}
