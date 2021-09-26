package Language;

public class SinoTibetan extends Language{
    String regionsSpoken = "Asia";
    String wordOrder = "subject-object-verb";
  
    public SinoTibetan(String name, int numSpeakers){
     
      super(name, numSpeakers);      
      if (name.contains("Chinese")){      
        this.wordOrder = "subject-verb-object";
      }     
    } 
  
    
    public void getInfo(){
      String info = name + " is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+". The language follows the order: "+wordOrder;
      System.out.println(info);
    }
    
  }
