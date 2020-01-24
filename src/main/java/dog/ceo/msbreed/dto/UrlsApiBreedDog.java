package dog.ceo.msbreed.dto;

public class UrlsApiBreedDog {

    private String urlListAll;
    private String urlImagesBreed;

    public UrlsApiBreedDog() {
    }

    public UrlsApiBreedDog(String urlListAll, String urlImagesBreed) {
        this.urlListAll = urlListAll;
        this.urlImagesBreed = urlImagesBreed;
    }

    public String getUrlListAll() {
        return urlListAll;
    }

    public void setUrlListAll(String urlListAll) {
        this.urlListAll = urlListAll;
    }

    public String getUrlImagesBreed() {
        return urlImagesBreed;
    }

    public void setUrlImagesBreed(String urlImagesBreed) {
        this.urlImagesBreed = urlImagesBreed;
    }
}
