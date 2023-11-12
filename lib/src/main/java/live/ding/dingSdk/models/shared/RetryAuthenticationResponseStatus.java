/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RetryAuthenticationResponseStatus - The status of the retry. Possible values are:
 *   * `approved` - The retry was approved and a new code was sent.
 *   * `denied` - The retry was denied.
 *   * `no_attempt` - No attempt was sent yet so we cannot perform a retry.
 *   * `rate_limited` - The authentication was rate limited and cannot be retried.
 *   * `expired_auth` - The authentication has expired and cannot be retried.
 *   * `already_validated` - The authentication has already been validated.
 * 
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
