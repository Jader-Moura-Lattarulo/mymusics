package br.com.alura.mymusics.main;

import br.com.alura.mymusics.models.Music;
import br.com.alura.mymusics.models.MyFavorites;
import br.com.alura.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music mymusic = new Music();
        mymusic.setTitle("Forever");
        mymusic.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            mymusic.play();
        }

        for (int i = 0; i < 50; i++) {
            mymusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 500; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 185; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.includes(mymusic);
        favorites.includes(myPodcast);

    }
}