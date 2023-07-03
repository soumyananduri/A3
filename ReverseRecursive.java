import java.util.*;
public class ReverseRecursive {
    public String reverseString(char []str){
        Stack<Character> st = new Stack<>();
        // char[] arr= s.toCharArray();
        // char[] res = new char[arr.length];

    for(int i=0;i<str.length;i++){
        st.push(str[i]);
    }
    //reversing
    for(int i=0;i<str.length;i++){
        str[i]= st.peek();
        st.pop();
    }
    return String.valueOf(str);
}
    
    public static void main(String[] args){
        ReverseRecursive rev= new ReverseRecursive();
        String s="SoumyaRocks";
        String res= rev.reverseString(s.toCharArray());
        System.out.println(res);
    }
}
