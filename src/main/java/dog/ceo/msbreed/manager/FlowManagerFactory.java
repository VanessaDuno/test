package dog.ceo.msbreed.manager;

import dog.ceo.msbreed.dto.UrlApiBreedDogInput;
import dog.ceo.msbreed.dto.UrlsApiBreedDog;
import dog.ceo.msbreed.facade.BreedDogFacadeImp;
import dog.ceo.msbreed.gateway.BreedDogGateway;
import dog.ceo.msbreed.gateway.BreedDogUrlsGateway;
import dog.ceo.msbreed.gateway.BreedsListGateway;
import dog.ceo.msbreed.mappers.BreedsListMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class FlowManagerFactory {

    @Autowired
    UrlApiBreedDogInput urlApiBreedDogInput;
    private BreedsListMapper breedsListMapper;
    private BreedDogGateway breedDogGateway;
    private BreedsListGateway breedsListGateway;
    private BreedDogUrlsGateway breedDogUrlsGateway;
    private BreedDogFacadeImp breedDogFacadeImp;

    public FlowManagerFactory(UrlApiBreedDogInput urlApiBreedDogInput, BreedsListMapper breedsListMapper, BreedDogGateway breedDogGateway, BreedsListGateway breedsListGateway, BreedDogUrlsGateway breedDogUrlsGateway) {
        this.urlApiBreedDogInput = urlApiBreedDogInput;
        this.breedsListMapper = breedsListMapper;
        this.breedDogGateway = breedDogGateway;
        this.breedsListGateway = breedsListGateway;
        this.breedDogUrlsGateway = breedDogUrlsGateway;
    }

    public FlowManagerFactory() {

    }

    public UrlsApiBreedDog getUrlsApiBreed() {
        String url= urlApiBreedDogInput.getUrl();
        breedDogUrlsGateway  = new BreedDogUrlsGateway(url);
        return breedDogUrlsGateway.getUrlsApiBreedDog();
    }

    public BreedDogManager init (){
        UrlsApiBreedDog urlsApiBreedDog = getUrlsApiBreed();
        breedsListMapper = new BreedsListMapper();
        breedDogGateway = new BreedDogGateway(urlsApiBreedDog.getUrlImagesBreed());
        breedsListGateway = new BreedsListGateway(urlsApiBreedDog.getUrlListAll(), breedsListMapper);
        breedDogFacadeImp = new BreedDogFacadeImp(breedDogGateway,breedsListGateway);
        return new BreedDogManager(breedDogFacadeImp);
    }


}
