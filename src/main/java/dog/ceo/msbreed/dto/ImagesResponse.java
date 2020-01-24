package dog.ceo.msbreed.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImagesResponse {

    @JsonProperty("message")
    private List<Image> images = null;

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }
}

