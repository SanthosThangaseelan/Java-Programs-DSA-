
public class MoveFront{
    
    public static  String moveFront(String str){
        String hash = "";
        String str1 = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#'){
                hash+="#";
            }
            else{
                str1+=str.charAt(i);
            }
        }
        String result = hash+str1;
        return  result;
        
    }

    public static void main(String[] args) {
        System.out.println(moveFront("Move#Hash#to#Front"));
    }
}