package br.com.alura.mymusics.models;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int classification;

    public int getClassification() {
        return classification;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void like(){
        this.totalLikes++;

    }

    public void play(){
        this.totalPlays++;
    }
}
