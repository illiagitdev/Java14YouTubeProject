package main.java.core_project.response.components;

public class SearchID {
    private String kind;
    private String videoId;
    private String channelId;
    private String playlistId;

    public SearchID() {
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
        return "SearchID{" + "\n" +
                "kind='" + kind + '\'' + "\n" +
                ", videoId='" + videoId + '\'' + "\n" +
                ", channelId='" + channelId + '\'' + "\n" +
                ", playlistId='" + playlistId + '\'' + "\n" +
                '}';
    }
}
