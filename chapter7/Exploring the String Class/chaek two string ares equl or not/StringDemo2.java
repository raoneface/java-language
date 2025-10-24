public class StringDemo2 {

    static String a = "bhagg bhsri ke ";

    public static void main(String[] args) {
        String str01 = "First String";
        String str02 = "Second String";
        String str03 = str01;

        System.out.println("Length of str01 " + str01.length());
        System.out.println("Char At index 3 on str01 : " + str01.charAt(3));
        System.out.println(a);

        if (str01.equals(str02))
            System.out.println("str01 == str02");
        else
            System.out.println("str01 != str01");
        
            if (str01.equals(str03))
            System.out.println("str01 == str03");
        else
            System.out.println("str01 != str03");

        
    }
}
