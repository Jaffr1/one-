package fsd53.str;
/*
find duplicate - mals
remove duplicate - Imutablecs
 */
public final class ImmutableClass {
    private final String name;
    public ImmutableClass(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        ImmutableClass i = new ImmutableClass("java");
        System.out.println(i.getName());
        //we cannot change the original object
        //instead we create new object
        i = new ImmutableClass("spring");
        System.out.println(i.getName());
//        p1();
//        evenWords();
        upperLower();
    }
    private static void p1() {
        String s = "namseo";
        char largeCharacter = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > largeCharacter) {
                largeCharacter = c;
            }
        }
        System.out.println(largeCharacter);
    }
    private static void evenWords() {
        String s = "india is my country but i like java";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);
            if (i==s.length()-1){//this is for last char checking
                temp=temp.concat(c+"");
                if (temp.length()%2==0){
                    System.out.println(temp);
                }
            }
            if (c!=' '){
                temp=temp.concat(c+"");
            }else {
                if (temp.length()%2==0){
                    System.out.println(temp);
                }
                temp="";
            }
        }
    }
    private static void upperLower(){
        String s = "AppLeJaVA";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println((int)'a');
        System.out.println((int)'A');
        System.out.println((int)('a'-'A'));
        System.out.println((int)('A'-'a'));
    }
}