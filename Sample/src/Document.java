import java.util.HashSet;
import java.util.Set;

/*
 * The United Nations Organization released an official document regarding themost important events from the 
 * beginning of time (dated 00-00-0000) with a briefdescription of the events. 
 * The date of all the events is mentioned in the 'DD-MM-YYYY format
 * Find the total number of distinct years referenced in the document.
 * 
 * Input Specification:input1: String containing the content of the documentOutput 
 * Specification:Return the total number of distinct years referenced in the document
 */

 
// Java Program to find the total
// number of distinct years
public class Document {
 
// function to find the total
// number of distinct years
    static int distinct_year(String str) {
        String str2 = "";
 
        Set<String> uniqueDates = new HashSet<>();
 
        for (int i = 0; i < str.length(); i++) {
 
            if (Character.isDigit(str.charAt(i))) {
                str2 += (str.charAt(i));
            }
 
            // if we found - then clear the str2
            if (str.charAt(i) == '-') {
                str2 = "";
            }
 
            // if length of str2 becomes 4
            // then store it in a set
            if (str2.length() == 4) {
                uniqueDates.add(str2);
                str2 = "";
            }
        }
 
        // return the size of set
        return uniqueDates.size();
    }
 
// Driver code
    static public void main(String[] args) {
        String str = "UN was established on 24-10-1945."
                + "India got freedom on 15-08-1947.";
 
        System.out.println(distinct_year(str));
    }
}