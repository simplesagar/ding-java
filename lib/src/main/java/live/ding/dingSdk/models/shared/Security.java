/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import live.ding.dingSdk.utils.SpeakeasyMetadata;


public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=x-api-key")
    public String apiKey;

    public Security withAPIKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    public Security(@JsonProperty("APIKey") String apiKey) {
        this.apiKey = apiKey;
  }
}
