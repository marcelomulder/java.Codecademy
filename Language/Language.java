package Language;

public class Language{
        protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;
    }
    public Language(String name, int numSpeakers){
      this.name = name;
      this.numSpeakers = numSpeakers; 
    }
  
    public void getInfo(){
      String info = name + " is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+". The language follows the order: "+wordOrder;
      System.out.println(info);
    }
  
    public static void main(String[] args){
      Language portugues = new Language("Português",300000000, "Angola, Brasil, Cabo Verde, Timor-Leste, Guiné-Bissau, Guiné Equatorial, Moçambique, Portugal e São Tomé e Príncipe","subject-verb-object.");
      portugues.getInfo();
      Language chontal = new Mayan("Chontal", 36810);
      chontal.getInfo();
      Language chinese = new SinoTibetan("Mandarin Chinese", 36810);
      Language nonchinese = new SinoTibetan("Burmese", 36810);
      chinese.getInfo();
      nonchinese.getInfo();
      
  
    }
  }