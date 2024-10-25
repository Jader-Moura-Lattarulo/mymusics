package br.com.alura.mymusics.models;

public class Podcast extends Audio{
    private String host;
    private String preview;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    @Override
    public int getClassification(){
        if(this.getTotalLikes() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
