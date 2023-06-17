public class Stat {
    public static void main(String[] args) {
        System.out.println(Application.language);
    }
}

class Application{
   public static String language;

   static{
       if (System.getProperty("lang") != null && System.getProperty("lang").equals("en")) {
           language = "english";
       }else{
           language = "spanish";
       }
   }
}