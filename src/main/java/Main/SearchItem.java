package main.java.core_project;

public class SearchItem {
    private String kind;
    private  String etag;
    private SearchID id;
    private Snippet snippet;

    private static class SearchID {
        private String kind;
        private String videoId;
        private String channelId;
        private String playlistId;

        public SearchID() {
        }

        public SearchID(String kind, String videoId, String channelId, String playlistId) {
            this.kind = kind;
            this.videoId = videoId;
            this.channelId = channelId;
            this.playlistId = playlistId;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getPlaylistId() {
            return playlistId;
        }

        public void setPlaylistId(String playlistId) {
            this.playlistId = playlistId;
        }

        @Override
        public String toString() {
            return "SearchID{" +
                    "kind='" + kind + '\'' + "\n" +
                    ", videoId='" + videoId + '\'' + "\n" +
                    ", channelId='" + channelId + '\'' + "\n" +
                    ", playlistId='" + playlistId + '\'' + "\n" +
                    '}';
        }
    }

    public SearchItem() {
    }

    public SearchItem(String kind, String etag, SearchID id, Snippet snippet) {
        this.kind = kind;
        this.etag = etag;
        this.id = id;
        this.snippet = snippet;
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
        return "SearchItem{" +
                "kind='" + kind + '\'' + "\n" +
                ", etag='" + etag + '\'' + "\n" +
                ", id=" + id.toString() + "\n" +
                ", snippet=" + snippet.toString() + "\n" +
                '}';
    }
}
