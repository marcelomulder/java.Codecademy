public class MadLibs {
    /*
    This program generates a crazy story.
    Author: Marcelo Queiroz
    Date: 9/8/2021
    */
        public static void main(String[] args){
        String name1 = "Malungo";
        String adjective1 = "tired";
        String adjective2 = "awfull";
        String adjective3 = "busy";
        String verb1 = "cry";
        String noun1 ="flower";
        String noun2 ="computer";
        String noun3 ="cellphone";
        String noun4 ="ball";
        String noun5 ="dog";
        String noun6 ="planet";
        String name2 = "Clotilde";
        int number = 51;
        String place1 = "Canadá";
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
      }       
  }