import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] strM = br.readLine().split(" ");
		int M[] = new int[N];
		
		for(int i = 0; i < strM.length; i++){
		    M[i] = Integer.parseInt(strM[i]);
		}
		
		check(N, M);
	    if(isSorted(M)){
	        System.out.println("YES");
	    }
	}
	
	public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; 
            }
        }
        return true;
    }
	
	public static void check(int N, int[] M){
	    for(int i = 0; i < N; i++){
	        try{
	            for(int j = i+1; i < N; j++){
    	            double sqrt = Math.sqrt(M[i] * M[j]);
    	            if((M[i] > M[j]) && sqrt%1 != 0){
    	                System.out.println("NO");
    	                break;
    	            }
    	            else if((M[i] > M[j]) && sqrt%1 == 0){
    	                int temp = M[j];
    	                M[j] = M[i];
    	                M[i] = temp;
    	            }
    	            else{
    	                continue;
    	            }
	            }
	        } catch(ArrayIndexOutOfBoundsException e){
	            continue;
	        }
	    }
	}
}
