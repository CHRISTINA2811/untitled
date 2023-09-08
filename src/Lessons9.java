public class Lessons9<x> {
    public static void main(String[] args) {
       Integer x = null;
       try {
           x.toString();
       } catch (NullPointerException ex){
           System.out.println( "обращение к пустому объекту");
       }






    }
}
