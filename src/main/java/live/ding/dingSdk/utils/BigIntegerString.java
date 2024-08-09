/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.utils;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

// Internal API only

// Note that Jackson 2.16.1 does not support @JsonValue and @JsonFormat combined so we must use
// a custom serializer/deserializer

@JsonSerialize(using = BigIntegerString.BigIntegerStringSerializer.class)
@JsonDeserialize(using = BigIntegerString.BigIntegerStringDeserializer.class)
public class BigIntegerString {

    private final BigInteger value;

    public BigIntegerString(BigInteger value) {
        this.value = value;
    }
    
    public BigIntegerString(String value) {
        this(new BigInteger(value));
    }
    
    public BigInteger value() {
        return value;
    }
    
    @Override
    public String toString() {
        return value.toString();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BigIntegerString other = (BigIntegerString) obj;
        return Objects.equals(value, other.value);
    }
    
    public static final class BigIntegerStringSerializer extends StdSerializer<BigIntegerString> {

        private static final long serialVersionUID = -2474225842945673085L;

        public BigIntegerStringSerializer() {
            this(null);
        }

        public BigIntegerStringSerializer(Class<BigIntegerString> t) {
            super(t);
        }

        @Override
        public void serialize(BigIntegerString value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeString(value.value.toString());
        }
    }

    public static final class BigIntegerStringDeserializer extends StdDeserializer<BigIntegerString> {

        private static final long serialVersionUID = -2474225842945673085L;

        public BigIntegerStringDeserializer() {
            this(null);
        }

        public BigIntegerStringDeserializer(Class<BigIntegerString> t) {
            super(t);
        }

        @Override
        public BigIntegerString deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String s = p.readValueAs(String.class);
            return new BigIntegerString(new BigInteger(s));
        }
    }
}
