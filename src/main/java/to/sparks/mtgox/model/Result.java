package to.sparks.mtgox.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author SparksG
 */
@JsonAutoDetect
public class Result<T> extends DtoBase {

    private String result;
    private T ret;
    private String error;
    private String token;

    @JsonCreator
    public Result(@JsonProperty("result") String result,
            @JsonProperty("return") T ret,
            @JsonProperty("error") String error,
            @JsonProperty("token") String token) {
        this.result = result;
        this.ret = ret;
        this.error = error;
        this.token = token;
    }

    public String getResult() {
        return result;
    }

    public T getReturn() {
        return ret;
    }

    public String getError() {
        return error;
    }

    public String getToken() {
        return token;
    }
}
