package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {

    @JsonProperty("pagination")
    private Pagination pagination;

    public Pagination getPagination() {
        return pagination;
    }
}
