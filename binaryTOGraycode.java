
public class binaryTOGraycode
{
    public static void main(String[] args) {
        String binary="0110";
        String gray = "";
        gray += binary.charAt(0);
        for (int i = 1; i < binary.length(); i++) 
        {
            gray +=binary.charAt(i - 1) ^ binary.charAt(i);
        }
        System.out.println(gray); //TC:O(Noofbits);

        
    }
    
}
