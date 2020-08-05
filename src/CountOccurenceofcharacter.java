import java.util.HashMap;

public class CountOccurenceofcharacter {

	private static void test(String text)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
  
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
  
        //Converting given string to char array
  
        char[] strArray = text.toCharArray();
  
        //checking each char of strArray
  
        for (char c : strArray)
        {
            if(map.containsKey(c))
            {
                //If char 'c' is present in map, incrementing it's count by 1
  
                map.put(c, map.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
  
                map.put(c, 1);
            }
        }
         
        //Printing inputString and charCountMap 
  
        System.out.println(text+" : "+map);
    }
  
    public static void main(String[] args)
    {
         test("aaabbc");
    }
	
	
	
}
