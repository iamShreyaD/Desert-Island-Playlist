/*
 * Shreya B Deshpande
 * This project is done through codecademy course "Learn: Java".
 * This project demonstrates a situation where a person is heading to a desert island, cut off from the world
 * for six months. Luckily, the person has a playlist of his/her favorite music.
 * The Playlist.java is build with best possible playlist of music using a Java ArrayList.
 */

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Unstoppable");
    desertIslandPlaylist.add("Havana");
    desertIslandPlaylist.add("Despacito");
    desertIslandPlaylist.add("Dreamers");
    desertIslandPlaylist.add("No lie");
    desertIslandPlaylist.add("Believer");
    desertIslandPlaylist.add("Breathless");

    desertIslandPlaylist.remove(2);
    desertIslandPlaylist.remove(5);

    System.out.println(desertIslandPlaylist);

    int a = desertIslandPlaylist.indexOf("Havana");
    int b = desertIslandPlaylist.indexOf("Dreamers");

    String tempA = "Havana";
    String tempB = "Dreamers";

    desertIslandPlaylist.set(b, tempA);
    desertIslandPlaylist.set(a, tempB);

    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

  }
  
}