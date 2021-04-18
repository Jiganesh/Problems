
public class ProblemZE{
    public static void main(String[] args) {
      System.out.println(toTime(3600)); // 1 hours and 0 minutes
      System.out.println(toTime(3500)); // 0 hours and 58 minutes
    }

    public static String toTime(int seconds){ 
      
      int hours = 0;
      int minutes= 0;
      
      hours = seconds / 3600;
      minutes = seconds%3600/60;
      
      return String.format("%s hour(s) and %s minute(s)",hours, minutes);
    }
  }