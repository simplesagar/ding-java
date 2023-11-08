/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package live.ding.dingSdk;

import live.ding.dingSdk.utils.HTTPClient;
import live.ding.dingSdk.utils.SpeakeasyHTTPClient;

/**
 * Ding: The OTP API allows you to send authentication codes to your users using their phone numbers
 */
public class Ding {
	/**
	 * AvailableServers contains identifiers for the servers available to the SDK.
	 */ 
	public enum AvailableServers {
        /**
         * PRODUCTION - The production Ding API server
         */
        PRODUCTION("production");

		public final String server;

		private AvailableServers(String server) {
			this.server = server;
		}
	}

	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final java.util.Map<AvailableServers, String> SERVERS = new java.util.HashMap<AvailableServers, String>() {{
		put(AvailableServers.PRODUCTION, "https://api.ding.live/v1");
	}};
  	
    /**
     * Send OTP codes to your users using their phone numbers.
     */
    public Otp otp;
    /**
     * Retrieve up-to-date metadata about a specific phone number
     */
    public Lookup lookup;	

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(live.ding.dingSdk.models.shared.Security security) {
			this.sdkConfiguration.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = live.ding.dingSdk.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by name
		 * @param server The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServer(AvailableServers server) {
			this.sdkConfiguration.server = server.toString();
			this.sdkConfiguration.serverUrl = SERVERS.get(server);
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public Ding build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.security != null) {
				this.sdkConfiguration.securityClient = live.ding.dingSdk.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, this.sdkConfiguration.security);
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS.get(AvailableServers.PRODUCTION);
				this.sdkConfiguration.server = AvailableServers.PRODUCTION.toString();
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new Ding(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private Ding(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.otp = new Otp(this.sdkConfiguration);
		
		this.lookup = new Lookup(this.sdkConfiguration);
	}
}