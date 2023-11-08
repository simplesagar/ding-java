/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RetryAuthenticationResponseStatus - The status of the authentication.
 */
public enum RetryAuthenticationResponseStatus {
    APPROVED("approved"),
    DENIED("denied"),
    NO_ATTEMPT("no_attempt"),
    RATE_LIMITED("rate_limited"),
    EXPIRED_AUTH("expired_auth"),
    ALREADY_VALIDATED("already_validated");

    @JsonValue
    public final String value;

    private RetryAuthenticationResponseStatus(String value) {
        this.value = value;
    }
}