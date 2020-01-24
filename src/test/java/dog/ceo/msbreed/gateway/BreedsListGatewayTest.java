package dog.ceo.msbreed.gateway;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dog.ceo.msbreed.dto.BreedSubBreedsResponse;
import dog.ceo.msbreed.mappers.BreedsListMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class BreedsListGatewayTest {

    BreedsListGateway breedsListGateway;
    BreedSubBreedsResponse breedSubBreedsResponse;
    BreedsListMapper breedsListMapper;

    @Before
    public void setUp() {
        breedsListMapper = new BreedsListMapper();
        breedsListGateway = new BreedsListGateway("https://dog.ceo/api/breeds/list/all", breedsListMapper);
        breedSubBreedsResponse = new BreedSubBreedsResponse();
    }

    @Test
    public void isClassThere() {
        Assert.assertNotNull(breedsListGateway);
    }

    @Test
    public void isMethodGetListAllDogsThere() throws JsonProcessingException {
        List<BreedSubBreedsResponse> breedSubBreedsResponse = breedsListGateway.getListAllDogs();
        Assert.assertNotNull(breedSubBreedsResponse);
    }

    @Test
    public void mappearDataBread() throws IOException {
        String jsonSP = new String("{\n" +
                "  \"message\": {\n" +
                "    \"affenpinscher\": [],\n" +
                "    \"african\": [],\n" +
                "    \"airedale\": [],\n" +
                "    \"akita\": [],\n" +
                "    \"appenzeller\": [],\n" +
                "    \"australian\": [\n" +
                "      \"shepherd\"\n" +
                "    ],\n" +
                "    \"basenji\": [],\n" +
                "    \"beagle\": [],\n" +
                "    \"bluetick\": [],\n" +
                "    \"borzoi\": [],\n" +
                "    \"bouvier\": [],\n" +
                "    \"boxer\": [],\n" +
                "    \"brabancon\": [],\n" +
                "    \"briard\": [],\n" +
                "    \"buhund\": [\n" +
                "      \"norwegian\"\n" +
                "    ],\n" +
                "    \"bulldog\": [\n" +
                "      \"boston\",\n" +
                "      \"english\",\n" +
                "      \"french\"\n" +
                "    ],\n" +
                "    \"bullterrier\": [\n" +
                "      \"staffordshire\"\n" +
                "    ],\n" +
                "    \"cairn\": [],\n" +
                "    \"cattledog\": [\n" +
                "      \"australian\"\n" +
                "    ],\n" +
                "    \"chihuahua\": [],\n" +
                "    \"chow\": [],\n" +
                "    \"clumber\": [],\n" +
                "    \"cockapoo\": [],\n" +
                "    \"collie\": [\n" +
                "      \"border\"\n" +
                "    ],\n" +
                "    \"coonhound\": [],\n" +
                "    \"corgi\": [\n" +
                "      \"cardigan\"\n" +
                "    ],\n" +
                "    \"cotondetulear\": [],\n" +
                "    \"dachshund\": [],\n" +
                "    \"dalmatian\": [],\n" +
                "    \"dane\": [\n" +
                "      \"great\"\n" +
                "    ],\n" +
                "    \"deerhound\": [\n" +
                "      \"scottish\"\n" +
                "    ],\n" +
                "    \"dhole\": [],\n" +
                "    \"dingo\": [],\n" +
                "    \"doberman\": [],\n" +
                "    \"elkhound\": [\n" +
                "      \"norwegian\"\n" +
                "    ],\n" +
                "    \"entlebucher\": [],\n" +
                "    \"eskimo\": [],\n" +
                "    \"frise\": [\n" +
                "      \"bichon\"\n" +
                "    ],\n" +
                "    \"germanshepherd\": [],\n" +
                "    \"greyhound\": [\n" +
                "      \"italian\"\n" +
                "    ],\n" +
                "    \"groenendael\": [],\n" +
                "    \"hound\": [\n" +
                "      \"afghan\",\n" +
                "      \"basset\",\n" +
                "      \"blood\",\n" +
                "      \"english\",\n" +
                "      \"ibizan\",\n" +
                "      \"walker\"\n" +
                "    ],\n" +
                "    \"husky\": [],\n" +
                "    \"keeshond\": [],\n" +
                "    \"kelpie\": [],\n" +
                "    \"komondor\": [],\n" +
                "    \"kuvasz\": [],\n" +
                "    \"labrador\": [],\n" +
                "    \"leonberg\": [],\n" +
                "    \"lhasa\": [],\n" +
                "    \"malamute\": [],\n" +
                "    \"malinois\": [],\n" +
                "    \"maltese\": [],\n" +
                "    \"mastiff\": [\n" +
                "      \"bull\",\n" +
                "      \"english\",\n" +
                "      \"tibetan\"\n" +
                "    ],\n" +
                "    \"mexicanhairless\": [],\n" +
                "    \"mix\": [],\n" +
                "    \"mountain\": [\n" +
                "      \"bernese\",\n" +
                "      \"swiss\"\n" +
                "    ],\n" +
                "    \"newfoundland\": [],\n" +
                "    \"otterhound\": [],\n" +
                "    \"papillon\": [],\n" +
                "    \"pekinese\": [],\n" +
                "    \"pembroke\": [],\n" +
                "    \"pinscher\": [\n" +
                "      \"miniature\"\n" +
                "    ],\n" +
                "    \"pitbull\": [],\n" +
                "    \"pointer\": [\n" +
                "      \"german\",\n" +
                "      \"germanlonghair\"\n" +
                "    ],\n" +
                "    \"pomeranian\": [],\n" +
                "    \"poodle\": [\n" +
                "      \"miniature\",\n" +
                "      \"standard\",\n" +
                "      \"toy\"\n" +
                "    ],\n" +
                "    \"pug\": [],\n" +
                "    \"puggle\": [],\n" +
                "    \"pyrenees\": [],\n" +
                "    \"redbone\": [],\n" +
                "    \"retriever\": [\n" +
                "      \"chesapeake\",\n" +
                "      \"curly\",\n" +
                "      \"flatcoated\",\n" +
                "      \"golden\"\n" +
                "    ],\n" +
                "    \"ridgeback\": [\n" +
                "      \"rhodesian\"\n" +
                "    ],\n" +
                "    \"rottweiler\": [],\n" +
                "    \"saluki\": [],\n" +
                "    \"samoyed\": [],\n" +
                "    \"schipperke\": [],\n" +
                "    \"schnauzer\": [\n" +
                "      \"giant\",\n" +
                "      \"miniature\"\n" +
                "    ],\n" +
                "    \"setter\": [\n" +
                "      \"english\",\n" +
                "      \"gordon\",\n" +
                "      \"irish\"\n" +
                "    ],\n" +
                "    \"sheepdog\": [\n" +
                "      \"english\",\n" +
                "      \"shetland\"\n" +
                "    ],\n" +
                "    \"shiba\": [],\n" +
                "    \"shihtzu\": [],\n" +
                "    \"spaniel\": [\n" +
                "      \"blenheim\",\n" +
                "      \"brittany\",\n" +
                "      \"cocker\",\n" +
                "      \"irish\",\n" +
                "      \"japanese\",\n" +
                "      \"sussex\",\n" +
                "      \"welsh\"\n" +
                "    ],\n" +
                "    \"springer\": [\n" +
                "      \"english\"\n" +
                "    ],\n" +
                "    \"stbernard\": [],\n" +
                "    \"terrier\": [\n" +
                "      \"american\",\n" +
                "      \"australian\",\n" +
                "      \"bedlington\",\n" +
                "      \"border\",\n" +
                "      \"dandie\",\n" +
                "      \"fox\",\n" +
                "      \"irish\",\n" +
                "      \"kerryblue\",\n" +
                "      \"lakeland\",\n" +
                "      \"norfolk\",\n" +
                "      \"norwich\",\n" +
                "      \"patterdale\",\n" +
                "      \"russell\",\n" +
                "      \"scottish\",\n" +
                "      \"sealyham\",\n" +
                "      \"silky\",\n" +
                "      \"tibetan\",\n" +
                "      \"toy\",\n" +
                "      \"westhighland\",\n" +
                "      \"wheaten\",\n" +
                "      \"yorkshire\"\n" +
                "    ],\n" +
                "    \"vizsla\": [],\n" +
                "    \"waterdog\": [\n" +
                "      \"spanish\"\n" +
                "    ],\n" +
                "    \"weimaraner\": [],\n" +
                "    \"whippet\": [],\n" +
                "    \"wolfhound\": [\n" +
                "      \"irish\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"status\": \"success\"\n" +
                "}");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, List<String>> myData = mapper.readValue(jsonSP, LinkedHashMap.class);
        Map list = (Map) myData.get("message");
        Assert.assertNotNull(myData);
    }
}
