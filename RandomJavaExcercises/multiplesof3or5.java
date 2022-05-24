
public class multiplesof3or5 {
	public static void power(long end,long n1, long n2, long n3 , long sum) {
		if(end>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2=n3;
			if(n3 %2 == 0)
			sum+=n3;
		System.out.println("n3= "+n3);
		System.out.println("sum= "+ sum);
		power(end-1, n1, n2 ,n3, sum);
		}
	}
	public static void main(String[] args) {
		int result = 0, var= 0 ;
		for( int i = 999; i>0; i--) {
			for (int z = 999;z>0; z-- ) {	
				result = i * z;
			if (result/100000 == result%10 && ((result/10000)%10) == ((result%100)/10) && ((result%10000)/1000) == ((result%1000)/100))
				if(var<result)
				var = result;
			}
		}
		System.out.println("with the result being: " +var);
}
}