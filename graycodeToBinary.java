
public class graycodeToBinary 
{
    public static void main(String[] args) {
        String gray="1111";
        String binary ="";
        binary+=gray.charAt(0);
        for(int i=1;i<gray.length();i++)
        {
            binary += binary.charAt(i-1) ^ gray.charAt(i);
        }
        System.out.println(binary);  //TC:O(NOofbits);
        
    }
    
}
