import java.util.*;

public class SourceCleanup {

    public static void main(String[] args) {

        String str = "abc##d#e";

        LinkedList<Character> list = new LinkedList<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch != '#')
            {
                list.add(ch);
            }
            else
            {
                if(!list.isEmpty())
                {
                    list.removeLast();
                }
            }
        }

        for(char c : list)
        {
            System.out.print(c);
        }
    }
}
