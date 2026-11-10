import java.util.*;

/** Represents a block-specific scheduling request and its mandatory/preferred classification. */
public class SpecialRequest {
    private String sessionId;
    private String requestType;
    private String value;
    private boolean mandatory;

    public SpecialRequest(String sessionId, String requestType, String value, boolean mandatory) {
        this.sessionId = sessionId; this.requestType = requestType; this.value = value; this.mandatory = mandatory;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getValue() {
        return value;
    }

    public boolean isMandatory() {
        return mandatory;
    }
}
