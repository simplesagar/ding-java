/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package live.ding.dingSdk.utils;

import java.util.Optional;

public class EventStreamMessage {
    
    private final Optional<String> event;
    private final Optional<String> id;
    private final Optional<Integer> retryMs;
    private final String data;

    public EventStreamMessage(Optional<String> event, Optional<String> id, Optional<Integer> retryMs, String data) {
        if (data == null) {
            throw new IllegalArgumentException("data cannot be null");
        }
        this.event = event;
        this.id = id;
        this.retryMs = retryMs;
        this.data = data;
    }

    public Optional<String> event() {
        return event;
    }

    public Optional<String> id() {
        return id;
    }

    public Optional<Integer> retryMs() {
        return retryMs;
    }

    public String data() {
        return data;
    }

    public boolean isEmpty() {
        return !event.isPresent() && !id().isPresent() && !retryMs().isPresent() && data.isEmpty();
    }
    
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        event.ifPresent(value -> b.append("event: " + value + "\n"));
        id.ifPresent(value -> b.append("id: " + value + "\n"));
        retryMs.ifPresent(value -> b.append("retry: " + value + "\n"));
        if (!data.isEmpty()) {
            b.append("data: " + data);
        }
        return b.toString();
    }
}