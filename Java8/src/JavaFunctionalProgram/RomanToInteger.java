package JavaFunctionalProgram;

public class RomanToInteger {

    public void romanToInt(String s){

        int total=0;
        for(int i=s.length()-1;i>=0;i--){
            int value= getValue(s.charAt(i));
            if(i< s.length()-1 && value <getValue(s.charAt(i+1))){
                total-=value;
            }
            else{
                total+=value;
            }
        }

        System.out.println(total);
    }
    private int getValue(char c){   
        switch (c) {
            case 'I':return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        
            default:
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        RomanToInteger r=new RomanToInteger();
        r.romanToInt("MXVI");
    }

}