

public class StringPool{
    public static void main(String[] args) {
        
        String s1="Hello";
        String s2= "Hello";
        
        String s3= new String("Hello");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equalsIgnoreCase(s3));

        Integer a=2;
        int b= a;

        Integer c= a;

        System.out.println(a.getClass().getName());

        Class<?> clss=int.class;
        System.out.println(clss.getName());
        

    }
}