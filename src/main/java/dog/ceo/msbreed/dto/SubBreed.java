
package dog.ceo.msbreed.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class SubBreed {

    @JsonProperty("subBreed")
    private String subBreed;

    @JsonProperty("subBreed")
    public String getSubBreed() {
        return subBreed;
    }

    @JsonProperty("subBreed")
    public void setSubBreed(String subBreed) {
        this.subBreed = subBreed;
    }
}
