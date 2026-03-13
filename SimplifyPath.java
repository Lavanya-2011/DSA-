import java.util.*;

public class SimplifyPath {

    public static void main(String[] args) {

        String path = "/a/./b/../../c/";

        LinkedList<String> list = new LinkedList<>();

        String parts[] = path.split("/");

        for(String p : parts)
        {
            if(p.equals("") || p.equals("."))
            {
                continue;
            }
            else if(p.equals(".."))
            {
                if(!list.isEmpty())
                {
                    list.removeLast();
                }
            }
            else
            {
                list.add(p);
            }
        }

        String result = "";

        for(String dir : list)
        {
            result = result + "/" + dir;
        }

        if(result.equals(""))
        {
            result = "/";
        }

        System.out.println(result);
    }
}