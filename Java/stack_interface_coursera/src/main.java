import java.util.Scanner;
public class main {

    public static void main(String argv[]){
        Scanner scanf = new Scanner(System.in);
        int q = Integer.parseInt(scanf.nextLine().split(" ")[0]);
        String[] query;
        String answer="";
        int max =0;
        int[] stack = new int[100000];
        int arrSize =0;
        for (int i =0 ; i<q ;i++){
            query = scanf.nextLine().split(" ");
            if(query[0].equals("push")){
                int h =Integer.parseInt(query[1]);
            stack[arrSize]=(h);
            arrSize++;

                if(h >max){max = h;}
            }
            if(query[0].equals("pop")){
                int yy =stack[arrSize-1];
                stack[arrSize-1]=0;
                arrSize--;
                if(yy == max){
                    max =0;
                    for(int j =0 ;j < arrSize;j++){

                        if((int)(stack[j])>max) max = (int)stack[j];
                    }
                }



            }
            if(query[0].equals("max")){

                answer+=""+max+"\n";

            }

        }
        System.out.println(answer);
    }
}
