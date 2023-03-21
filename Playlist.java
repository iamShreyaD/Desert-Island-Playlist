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