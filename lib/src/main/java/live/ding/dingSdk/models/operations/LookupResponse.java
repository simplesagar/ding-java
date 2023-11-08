/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class LookupResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public LookupResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public live.ding.dingSdk.models.shared.ErrorResponse errorResponse;

    public LookupResponse withErrorResponse(live.ding.dingSdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public live.ding.dingSdk.models.shared.LookupResponse lookupResponse;

    public LookupResponse withLookupResponse(live.ding.dingSdk.models.shared.LookupResponse lookupResponse) {
        this.lookupResponse = lookupResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public LookupResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public LookupResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public LookupResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}