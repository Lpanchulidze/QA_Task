package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

    @JsonProperty("total")
    private int total;

    @JsonProperty("pages")
    private int pages;

    @JsonProperty("page")
    private int page;

    @JsonProperty("limit")
    private int limit;

    public int getTotal() {
        return total;
    }

    public int getPages() {
        return pages;
    }

    public int getLimit() {
        return limit;
    }

    public int getPage() {
        return page;
    }

}
