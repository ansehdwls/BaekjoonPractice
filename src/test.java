public class test {
    
    public static void main(String ars[]){
                String answer = "";
                String s = "aukks";
                String skip = "wbqd";
                int index = 5;
                int i = 0;
                while(i != s.length() ){
                    int a = (int) s.charAt(i);
                    for(int j = 0 ; j < index ; j++){
                        a = a + 1;
                        if(a > (int) 'z' ) a = (int) 'a';
                        for(int k = 0 ; k < skip.length() ; k++){
                            if(a == (int)skip.charAt(k)) a = a+1;
                        }
                        if(a > (int) 'z' ) a = (int) 'a';
                    }
                    answer += (char) a;
                    i++;
                }
                System.out.println(answer);
        }
}
