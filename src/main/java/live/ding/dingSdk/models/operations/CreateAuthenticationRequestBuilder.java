/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.operations;

import java.util.Optional;
import live.ding.dingSdk.models.shared.CreateAuthenticationRequest;
import live.ding.dingSdk.utils.Utils;

public class CreateAuthenticationRequestBuilder {

    private Optional<? extends CreateAuthenticationRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateAuthentication sdk;

    public CreateAuthenticationRequestBuilder(SDKMethodInterfaces.MethodCallCreateAuthentication sdk) {
        this.sdk = sdk;
    }
                
    public CreateAuthenticationRequestBuilder request(live.ding.dingSdk.models.shared.CreateAuthenticationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateAuthenticationRequestBuilder request(java.util.Optional<? extends live.ding.dingSdk.models.shared.CreateAuthenticationRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAuthenticationResponse call() throws Exception {

        return sdk.createAuthentication(
            request);
    }
}
