/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;
import live.ding.dingSdk.models.shared.ErrorResponse;
import live.ding.dingSdk.utils.Response;
import live.ding.dingSdk.utils.Utils;


public class FeedbackResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Bad Request
     */
    private Optional<? extends ErrorResponse> errorResponse;

    /**
     * OK
     */
    private Optional<? extends live.ding.dingSdk.models.shared.FeedbackResponse> feedbackResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public FeedbackResponse(
            String contentType,
            Optional<? extends ErrorResponse> errorResponse,
            Optional<? extends live.ding.dingSdk.models.shared.FeedbackResponse> feedbackResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorResponse, "errorResponse");
        Utils.checkNotNull(feedbackResponse, "feedbackResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorResponse = errorResponse;
        this.feedbackResponse = feedbackResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public FeedbackResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Bad Request
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ErrorResponse> errorResponse() {
        return (Optional<ErrorResponse>) errorResponse;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<live.ding.dingSdk.models.shared.FeedbackResponse> feedbackResponse() {
        return (Optional<live.ding.dingSdk.models.shared.FeedbackResponse>) feedbackResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public FeedbackResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Bad Request
     */
    public FeedbackResponse withErrorResponse(ErrorResponse errorResponse) {
        Utils.checkNotNull(errorResponse, "errorResponse");
        this.errorResponse = Optional.ofNullable(errorResponse);
        return this;
    }

    /**
     * Bad Request
     */
    public FeedbackResponse withErrorResponse(Optional<? extends ErrorResponse> errorResponse) {
        Utils.checkNotNull(errorResponse, "errorResponse");
        this.errorResponse = errorResponse;
        return this;
    }

    /**
     * OK
     */
    public FeedbackResponse withFeedbackResponse(live.ding.dingSdk.models.shared.FeedbackResponse feedbackResponse) {
        Utils.checkNotNull(feedbackResponse, "feedbackResponse");
        this.feedbackResponse = Optional.ofNullable(feedbackResponse);
        return this;
    }

    /**
     * OK
     */
    public FeedbackResponse withFeedbackResponse(Optional<? extends live.ding.dingSdk.models.shared.FeedbackResponse> feedbackResponse) {
        Utils.checkNotNull(feedbackResponse, "feedbackResponse");
        this.feedbackResponse = feedbackResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public FeedbackResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public FeedbackResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedbackResponse other = (FeedbackResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.errorResponse, other.errorResponse) &&
            Objects.deepEquals(this.feedbackResponse, other.feedbackResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            errorResponse,
            feedbackResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FeedbackResponse.class,
                "contentType", contentType,
                "errorResponse", errorResponse,
                "feedbackResponse", feedbackResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends ErrorResponse> errorResponse = Optional.empty();
 
        private Optional<? extends live.ding.dingSdk.models.shared.FeedbackResponse> feedbackResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Bad Request
         */
        public Builder errorResponse(ErrorResponse errorResponse) {
            Utils.checkNotNull(errorResponse, "errorResponse");
            this.errorResponse = Optional.ofNullable(errorResponse);
            return this;
        }

        /**
         * Bad Request
         */
        public Builder errorResponse(Optional<? extends ErrorResponse> errorResponse) {
            Utils.checkNotNull(errorResponse, "errorResponse");
            this.errorResponse = errorResponse;
            return this;
        }

        /**
         * OK
         */
        public Builder feedbackResponse(live.ding.dingSdk.models.shared.FeedbackResponse feedbackResponse) {
            Utils.checkNotNull(feedbackResponse, "feedbackResponse");
            this.feedbackResponse = Optional.ofNullable(feedbackResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder feedbackResponse(Optional<? extends live.ding.dingSdk.models.shared.FeedbackResponse> feedbackResponse) {
            Utils.checkNotNull(feedbackResponse, "feedbackResponse");
            this.feedbackResponse = feedbackResponse;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public FeedbackResponse build() {
            return new FeedbackResponse(
                contentType,
                errorResponse,
                feedbackResponse,
                statusCode,
                rawResponse);
        }
    }
}

