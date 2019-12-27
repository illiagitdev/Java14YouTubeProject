package main.java.core_project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnails {
    @JsonProperty("default")
    private Elements default_value;
    private Elements medium;
    private Elements high;
    private Elements standard;
    private Elements maxres;

    public Thumbnails() {
    }

    public Thumbnails(Elements default_value, Elements medium, Elements high, Elements standard, Elements maxres) {
        this.medium = medium;
        this.high = high;
        this.standard = standard;
        this.maxres = maxres;
    }

    public Elements getMedium() {
        return medium;
    }

    public void setMedium(Elements medium) {
        this.medium = medium;
    }

    public Elements getHigh() {
        return high;
    }

    public void setHigh(Elements high) {
        this.high = high;
    }

    public Elements getStandard() {
        return standard;
    }

    public void setStandard(Elements standard) {
        this.standard = standard;
    }

    public Elements getMaxres() {
        return maxres;
    }

    public void setMaxres(Elements maxres) {
        this.maxres = maxres;
    }

    public Elements getDefault_value() {
        return default_value;
    }

    public void setDefault_value(Elements default_value) {
        this.default_value = default_value;
    }

    private class Elements{
        private String url;
        private int width;
        private int height;

        public Elements() {
        }

        public Elements(String url, int width, int height) {
            this.url = url;
            this.width = width;
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Elements{" +
                    "url='" + url + '\'' + "\n" +
                    ", width=" + width + "\n" +
                    ", height=" + height + "\n" +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Thumbnails{" + "\n" +
                "default_value" + default_value + "\n" +
                "medium=" + medium + "\n" +
                ", high=" + high + "\n" +
                ", standard=" + standard + "\n" +
                ", maxres=" + maxres + "\n" +
                '}';
    }
}
