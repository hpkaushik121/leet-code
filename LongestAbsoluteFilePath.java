import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LongestAbsoluteFilePath{
    class Dir{
        String name;
        String path;
        List<Dir> directories=new ArrayList<>();
        List<String> files = new ArrayList<>();

    }
    public static void main(String[] args){

        System.out.println(new LongestAbsoluteFilePath().lengthLongestPath("dir\n        file.txt"));
    }
    public int lengthLongestPath(String input) {
        String[] ch = input.split("\n");
        HashMap<Integer,List<Dir>> map = new HashMap<>();
        int length = 0;
        for (int i = 0; i < ch.length; i++) {
            int tab = getTabCount(ch[i]);
            Dir dir = new Dir();
            dir.getClass().getPackage().getName();
                if(tab == 0){
                    dir.name = ch[i].replaceAll("\t","");
                    dir.path = ch[i].replaceAll("\t","");
                    System.out.println(dir.path);
                    if(isFile(ch[i])){
                        if(length<dir.path.length()){
                            length = dir.path.length();
                        }
                    }
                }else{
                    dir.name = ch[i].replaceAll("\t","");
                    Dir prvDir = map.get(tab-1).getLast();
                    dir.path = prvDir.path+"/"+(ch[i].replaceAll("\t",""));
                    System.out.println(dir.path);
                    
                    if(isFile(ch[i])){
                        if(length<dir.path.length()){
                            length = dir.path.length();
                        }
                        prvDir.files.add(dir.name);
                    }else{
                        prvDir.directories.add(dir);
                    }
                    
                }
                if(map.containsKey(tab)){
                    List<Dir> lDirs = map.get(tab);
                    lDirs.add(dir);
                    map.put(tab, lDirs);
                }else{
                    List<Dir> lDirs = new ArrayList<>();
                    lDirs.add(dir);
                    map.put(tab, lDirs);
                }
                
            
        }
        
        return length;
    }

    public int getTabCount(String input){
        Pattern pattern = Pattern.compile("[^\t]*\t");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public boolean isFile(String str){
        String[] s= str.split("\\.");
        return s.length >1;
    }
}