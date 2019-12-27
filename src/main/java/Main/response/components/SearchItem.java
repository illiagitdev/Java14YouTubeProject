package main.java.core_project.response.components;

public class SearchItem {
    private String kind;
    private  String etag;
    private SearchID id;
    private Snippet snippet;

    public SearchItem() {
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

    public SearchID getId() {
        return id;
    }

    public void setId(SearchID id) {
        this.id = id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return "SearchItem{" + "\n"+
                "kind='" + kind + '\'' + "\n"+
                ", etag='" + etag + '\'' + "\n"+
                ", id=" + id + "\n"+
                ", snippet=" + snippet + "\n"+
                '}';
    }
}
