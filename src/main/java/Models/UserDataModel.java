package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserDataModel {

    @JsonProperty("code")
    private int code;

    @JsonProperty("data")
    private List<DataItem> data;

    @JsonProperty("meta")
    private Meta meta;

    public int getCode() {
        return code;
    }

    public List<DataItem> getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }
}
