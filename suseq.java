public class suseq {
    public static void main(String[] args) {
        string q="abc";
        string ans="";
        sub(q,ans);
        
    }

    public static void sub(String q,String ans) {
        if(q.length()==0){
            System.out.println(ans);
        }
        char ch=charAt(0);
        sub(q.substring(1),ans);
        sub(q.substring(1),ans+ch);
        

    }
}