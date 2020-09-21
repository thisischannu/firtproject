package programms;

public class Permutation 
{ 
    public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int n = str.length(); 
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, n-1); 
    } 
  
    /** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
    	
    	System.out.println("string :"+str);
    	System.out.println("first index is :"+l);
    	System.out.println("last index :"+r);
    	
    	
        if (l == r) 
            System.out.println("inside if :"+str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
            	System.out.println("i is ::"+i);
                str = swap(str,l,i); 
                System.out.println("returned value is::"+str);
                permute(str, l+1, r); 
                str = swap(str,l,i); 
                System.out.println("returned value is 11::"+str);
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
    	System.out.println("inside swap :: values i "+i+"value of j :"+j);
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        System.out.println("temp ::"+temp);
        charArray[i] = charArray[j]; 
        System.out.println("j val :"+charArray[i]);
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 