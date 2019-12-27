package main.java.core_project.response;

import main.java.core_project.response.components.PageInfo;
import main.java.core_project.response.components.SearchItem;

import java.util.Arrays;

public class Response {
    private String kind;
    private String etag;
    private String nextPageToken;
    private String prevPageToken;
    private String regionCode;
    private PageInfo pageInfo;
    private SearchItem[] items;

    public Response() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }

    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public SearchItem[] getItems() {
        return items;
    }

    public void setItems(SearchItem[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Response{" + "\n" +
                "kind='" + kind + '\'' + "\n" +
                ", etag='" + etag + '\'' + "\n" +
                ", nextPageToken='" + nextPageToken + '\'' + "\n" +
                ", prevPageToken='" + prevPageToken + '\'' + "\n" +
                ", regionCode='" + regionCode + '\'' + "\n" +
                ", pageInfo=" + pageInfo + "\n" +
                ", items=" + Arrays.toString(items) + "\n" +
                '}';
    }
}
