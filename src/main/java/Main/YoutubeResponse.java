package main.java.core_project;

import java.io.Serializable;
import java.util.Arrays;

public class YoutubeResponse implements Serializable {
    private String kind;
    private String etag;
    private String nextPageToken;
    private String prevPageToken;
    private String regionCode;
    private PageInfo pageInfo;
    private SearchItem[] items;

    public YoutubeResponse() {
    }

    public YoutubeResponse(String kind, String etag, String nextPageToken, String prevPageToken, String regionCode, PageInfo pageInfo, SearchItem[] items) {
        this.kind = kind;
        this.etag = etag;
        this.nextPageToken = nextPageToken;
        this.prevPageToken = prevPageToken;
        this.regionCode = regionCode;
        this.pageInfo = pageInfo;
        this.items = items;
    }

    private static class PageInfo {
        private int totalResults;
        private int resultsPerPage;

        public PageInfo() {
        }

        public PageInfo(int totalResults, int resultsPerPage) {
            this.totalResults = totalResults;
            this.resultsPerPage = resultsPerPage;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }

        @Override
        public String toString() {
            return "PageInfo{" +
                    "totalResults=" + totalResults + "\n" +
                    ", resultsPerPage=" + resultsPerPage +
                    '}';
        }
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
        return "YoutubeResponse{" +
                "kind='" + kind + '\'' + "\n" +
                ", etag='" + etag + '\'' + "\n" +
                ", nextPageToken='" + nextPageToken + '\'' + "\n" +
                ", prevPageToken='" + prevPageToken + '\'' + "\n" +
                ", regionCode='" + regionCode + '\'' + "\n" +
                ", pageInfo=" + pageInfo.toString() + "\n" +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
