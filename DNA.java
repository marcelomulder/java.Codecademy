//This program determines whether thure is a protein in a strad of DNA
public class DNA{
    public static void main(String[] args){
      
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATGAATATGTACTGA";
      String dna = dna3;
      
      if ((dna.indexOf("ATG") == 0) && (dna.lastIndexOf("TGA") == dna.length() - 3) && ((dna.length() - 6) % 3 == 0) ){
        String protein = dna.substring(3, dna.length() - 3);
        System.out.println("We found the protein "+ protein);
      }
      else{
        System.out.println("No protein.");
      } 
    }
  }