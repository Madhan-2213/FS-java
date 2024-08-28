package jfs;
import java.util.Arrays;
import java.util.Scanner;
public class fsd {

	public static void main(String[] args) {
	Scanner aakash = new Scanner(System.in);
	int n = aakash.nextInt();
	int m = aakash.nextInt();
	int varuna[] = new int[n];
	int keerthana[] = new int[m];
	for(int i =0;i<n;i++) {
		varuna[i] = aakash.nextInt();
	}
	for(int i =0;i<m;i++) {
		keerthana[i] = aakash.nextInt();
	}
	int o = n+m;
	int santhoshh[] = new int[o];
	int c = 0;
	for (int i = 0;i<n;i++) {
		santhoshh[c++] = varuna[i];
	}
	for(int i = 0;i<m;i++) {
		santhoshh[c++] =keerthana[i]; 
	}
	Arrays.sort(santhoshh);
	int soni[] = new int[100];
	for(int i = 0;i<o;i++) {
		soni[santhoshh[i]]++;
	}
	for(int i1=0;i1<o;i1++) {
		if(soni[santhoshh[i1]]>0)
			System.out.print(santhoshh[i1]);
		int k = 0;
		soni[santhoshh[k]]=0;
	}
	}	
}
