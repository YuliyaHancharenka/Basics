package javabasic.module5.string;

public class StringConcatenationExample {
	/*public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1 == "abc");
	}*/
	
	/*
        public static void main(String[]args){ 
                String str1 = "abc"; 
                String str2 = "abc"; 
                String str3 = new String("abc"); 
                System.out.println(str1 == str2); 
                System.out.println(str1 == str3); 
        } */
        
        public static void main(String[]args){ 
            String str1 = "abc"; 
            String str2 = "ab"; 
            str2 = str2+"c"; 
            System.out.println("str1 :" +str1+", str2 :"+str2); 
            System.out.println(str1 == str2); 
   } 
}


