import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    // Choosing songs
    desertIslandPlaylist.add("Somewhere only we know");
    desertIslandPlaylist.add("Crystal Ball");
    desertIslandPlaylist.add("A ghost");
    desertIslandPlaylist.add("Happier");
    desertIslandPlaylist.add("Paranoid Android");
    desertIslandPlaylist.add("Eye of Tiger");
    desertIslandPlaylist.add("Little by Little");
    desertIslandPlaylist.add("This is Gospel");

    System.out.println("\nEssas são as músicas escolhidas: \n"+ desertIslandPlaylist+"\n");
    System.out.println("Quantidade de músicas na playlist: "+ desertIslandPlaylist.size() +"\n");

    System.out.println("==== Removendo 3 músicas da playlist ==== \n ");

    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(2);
    desertIslandPlaylist.remove(4);
    System.out.println("Essas são as músicas escolhidas: \n"+ desertIslandPlaylist+"\n");
    System.out.println("Quantidade de músicas na playlist: "+ desertIslandPlaylist.size() +"\n");

    //Swapping 2 songs
    System.out.println("Posição da primeira música a ser trocada: "+ desertIslandPlaylist.indexOf("Happier")+ "\n");
    System.out.println("Posição da segunda música a ser trocada: "+ desertIslandPlaylist.indexOf("Paranoid Android")+ "\n");
    String tempA = desertIslandPlaylist.get(2);
    desertIslandPlaylist.set(desertIslandPlaylist.indexOf("Happier"), desertIslandPlaylist.get(desertIslandPlaylist.indexOf("Paranoid Android")));
    desertIslandPlaylist.set(3,tempA);

    System.out.println("Músicas trocadas de posição. Segue a nova disposição da playlist:\n ");
    System.out.println( desertIslandPlaylist+"\n");    
  }  
}