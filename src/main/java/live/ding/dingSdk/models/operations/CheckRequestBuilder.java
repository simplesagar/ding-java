/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.operations;

import java.util.Optional;
import live.ding.dingSdk.models.shared.CreateCheckRequest;
import live.ding.dingSdk.utils.Utils;

public class CheckRequestBuilder {

    private Optional<? extends CreateCheckRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCheck sdk;

    public CheckRequestBuilder(SDKMethodInterfaces.MethodCallCheck sdk) {
        this.sdk = sdk;
    }
                
    public CheckRequestBuilder request(live.ding.dingSdk.models.shared.CreateCheckRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CheckRequestBuilder request(java.util.Optional<? extends live.ding.dingSdk.models.shared.CreateCheckRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CheckResponse call() throws Exception {

        return sdk.check(
            request);
    }
}