import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.auth.x500.X500Principal;

public class Main {
    public static void main(String[] args) throws IOException{
        int minx = 10000,miny = 10000;
        int maxx = -10000,maxy = -10000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            minx = minx >= x ? x : minx;
            maxx = maxx <= x ? x : maxx;

            miny = miny >= y ? y : miny;
            maxy = maxy <= y ? y : maxy;
        }

        if(maxx == minx || maxy == miny){
            System.out.println("0");
        }
        else{
            System.out.println((maxx-minx)*(maxy-miny));
        }
    }
}
