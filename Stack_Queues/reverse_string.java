package Stack_Queues;
import java.util.*;;
public class reverse_string {
    public static void main(String[] args) {
        String str="abc";
        String result=reverse(str);
        System.out.println(result);
    }

    public static String reverse(String s)
    {
        Stack<Character> ch=new Stack<>();
        int idx=0;
        while (idx<s.length()) {
            ch.push(s.charAt(idx));
            idx++;
        }

        StringBuilder SB= new StringBuilder("");
        while (!ch.isEmpty()) {
            char curr=ch.pop();
            SB.append(curr);
        }
        return SB.toString();
    }
}
