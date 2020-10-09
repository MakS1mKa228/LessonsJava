import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x,y,maxX=-1,maxY=-1;
        for(int i=0;i<n;i++) {
            x=in.nextInt();
            y=in.nextInt();
            if(x*y==0) {
                if(x!=0) {
                    if(x<0) x=-x;
                    if(x>maxX) maxX=x;
                }
                if(y!=0) {
                    if(y<0) y=-y;
                    if(y>maxY) maxY=y;
                }
            }
        }
        if(maxX==-1 || maxY==-1)
            System.out.println("Беда!");
        else
            System.out.println(maxX*maxY/2);
        in.close();
    }
}
