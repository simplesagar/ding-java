/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import live.ding.dingSdk.utils.OneOfDeserializer;
import live.ding.dingSdk.utils.TypedObject;
import live.ding.dingSdk.utils.Utils.JsonShape;
import live.ding.dingSdk.utils.Utils.TypeReferenceWithShape;
import live.ding.dingSdk.utils.Utils;


@JsonDeserialize(using = Events._Deserializer.class)
public class Events {

    @JsonValue
    private TypedObject value;
    
    private Events(TypedObject value) {
        this.value = value;
    }

    public static Events of(Attempt value) {
        Utils.checkNotNull(value, "value");
        return new Events(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Attempt>(){}));
    }

    public static Events of(Check value) {
        Utils.checkNotNull(value, "value");
        return new Events(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Check>(){}));
    }

    public static Events of(DeliveryStatus value) {
        Utils.checkNotNull(value, "value");
        return new Events(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DeliveryStatus>(){}));
    }

    public static Events of(BalanceUpdate value) {
        Utils.checkNotNull(value, "value");
        return new Events(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BalanceUpdate>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code live.ding.dingSdk.models.shared.Attempt}</li>
     * <li>{@code live.ding.dingSdk.models.shared.Check}</li>
     * <li>{@code live.ding.dingSdk.models.shared.DeliveryStatus}</li>
     * <li>{@code live.ding.dingSdk.models.shared.BalanceUpdate}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Events other = (Events) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Events> {

        public _Deserializer() {
            super(Events.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Attempt>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DeliveryStatus>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Check>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<BalanceUpdate>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Events.class,
                "value", value);
    }
 
}
