/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk;

import java.lang.String;
import java.util.Optional;
import live.ding.dingSdk.utils.HTTPClient;
import live.ding.dingSdk.utils.Hooks;
import live.ding.dingSdk.utils.RetryConfig;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
    public String serverUrl;
    public int serverIdx = 0;
    private static final String LANGUAGE = "java";
    public static final String OPENAPI_DOC_VERSION = "1.0.0";
    public static final String SDK_VERSION = "0.7.8";
    public static final String GEN_VERSION = "2.438.15";
    private static final String BASE_PACKAGE = "live.ding.dingSdk";
    public static final String USER_AGENT = 
            String.format("speakeasy-sdk/%s %s %s %s %s", 
                LANGUAGE, SDK_VERSION, GEN_VERSION, OPENAPI_DOC_VERSION, BASE_PACKAGE);

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {

    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
