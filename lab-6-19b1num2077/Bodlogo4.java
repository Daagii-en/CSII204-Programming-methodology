import acm.program.*;
public class Bodlogo4 extends ConsoleProgram{
    public void run(){
        println("Tus program ni n toonii tus buriin k zergiig hevledeg program ym.");
        int n = readInt("n toog oruulna uu: ");
        int k = readInt("k toog oruulna uu: ");
        int i, j;
        int s;
        for(i=1; i<=n; i++){
            s=1;
            for(j=1; j<=k; j++ ){
                print( i );
                if(j<k)
                    print(" * ");
                s=s*i;
            }
            print(" = " +s);
            println(" ");
        }
    }
}