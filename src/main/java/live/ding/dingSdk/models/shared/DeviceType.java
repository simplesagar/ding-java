/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DeviceType - The type of device the user is using.
 */
public enum DeviceType {
    IOS("IOS"),
    ANDROID("ANDROID"),
    WEB("WEB");

    @JsonValue
    private final String value;

    private DeviceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
