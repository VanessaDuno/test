package dog.ceo.msbreed.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UrlApiBreedDogInput {

    @Value("${url.api.breed.dog}")
    private String url;


    public UrlApiBreedDogInput() {
    }

    public UrlApiBreedDogInput(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
