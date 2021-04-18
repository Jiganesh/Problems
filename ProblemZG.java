public class ProblemZG {
    
    // Find the count of vowels present in String 

    public static void main(String[] args) {
        
        String str = "this is as trip to codeland, come on ride with us !!";

        int count = str.replaceAll("(?i)[^aeiou]", "").length();

        System.out.println(count);
    }
}


/*
Lets understand Regex behind this
      

(?i) case-insensitive mode , (?-i) case-insensitive mode off

[aeiou] check for each word inside

^ : not

*/
