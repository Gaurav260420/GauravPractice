package Java8;

public class practice5 {
    public static void main(String args[]){
        String str ="my name is gaurav raj and i am a software enginner";
        int mid = str.length()/2;
        String lowercase="";
        String uppercase="";
        for(int i =0;i<str.length();i++){
            if(i<mid){
                lowercase+= Character.toLowerCase(str.charAt(i));
            }else{
                uppercase +=  Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(lowercase+""+uppercase);
    }
}
