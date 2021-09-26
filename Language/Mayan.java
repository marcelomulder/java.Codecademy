package Language;


public class Mayan extends Language{
    String regionsSpoken = "Central America";
    String wordOrder = "verb-object-subject";
      
    public Mayan(String name, int numSpeakers){
      super(name, numSpeakers);
  
    }
    @Override
    public void getInfo(){
      String info = name + " is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+". The language follows the order: "+wordOrder+". Fun fact: "+name+" is a ergative language.";
      System.out.println(info);
    }
  
  }
