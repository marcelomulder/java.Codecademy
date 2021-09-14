public class Droid {
    String name;
    int batteryLevel;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public void performTask(String task){
      System.out.println(this.name + " is performing task: " + task);
      batteryLevel -= 10;
  
    }
  
    public void energyReport(){
      System.out.println(this.name + " battery level is "+ this.batteryLevel + "%.");
  
    }  
    public static void main (String[] args){
      Droid newDroid = new Droid("Codey");
        
      System.out.println(newDroid);
      newDroid.performTask("Make some coffee.");
      newDroid.performTask("Fly around.");
      newDroid.performTask("Destroy human kind.");
      newDroid.energyReport();
      
  
    }
    public String toString(){
        return "Hello, I'm the droid: " + name;
      }
  
  }