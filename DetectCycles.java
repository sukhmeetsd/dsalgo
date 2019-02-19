import java.util.ArrayList;
import java.util.HashMap;

public class DetectCycles {
    public static void main(String[] args) {
        if(args.length<3){
            if(args.length==2){
                if(args[0].equals(args[1])) {
                    System.out.println(args[0]+" "+args[1]);
                    return;
                }
            }
            else if(args.length==1) {
                System.out.println(args[0]);
                return;
            }
            else return;
        }
        int x1 = 1, x2 = 2, diff=0;
        String fin="";
        for(;x1<args.length && x2<args.length;x1++,x2+=2){
            if(args[x1].equals(args[x2])){
                diff=x2-x1;
                if(diff==1) {
                    fin+=args[x1];
                    break;
                }
                else if(diff==2 && args[x1+1].equals(args[x1])){
                    fin+=args[x1];
                    break;
                }
                while(args[x1--].equals(args[x2--]) && x1>-1);
                for(int i=x1+2;i<diff+x1+2;i++){
                    fin+=args[i]+" ";
                }
                break;
            }
        }
        System.out.println(fin);
    }
}
