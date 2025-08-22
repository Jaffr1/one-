//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word="3[ab2[c]]";
        int start=0;
        int end=0;
        while(word.contains("[")){
            for(int i=0; i<word.length();i++){
                if(word.charAt(i)==91){
                  start=i;
                }
                else if(word.charAt(i)==93){
                    end=i;
                    int n=Integer.parseInt(word.charAt(start-1)+"");
                    String temp=word.substring(0,start-1);
                    String temp2=word.substring(end+1);
                    String rep=word.substring(start+1,end);
                    for(int j=0; j<n;j++){
                        temp=temp.concat(rep);
                    }
                    word=temp+temp2;
                    System.out.println(word);
                }
            }
        }
       }
    }