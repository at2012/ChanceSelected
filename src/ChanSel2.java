
public class ChanSel2 {
	
	
	public static int sel(double[] a){
		double ran=Math.random();
		double left=0;
		double right=a[0];
		int re=a.length;

		double[] temp=new double[a.length];
		temp[0]=0;
		for(int i=0;i<a.length-1;i++){
//			for(int j=0;j<a.length;j++)
//				temp[i]+=a[j];
			temp[i+1]=temp[i]+a[i];
		}
//		for(int i=0;i<a.length;i++){
//			System.out.println("temp"+i+":"+temp[i]);
//		}
		
		if(0<=ran && ran<temp[1]){
			re=0;
		}else if(temp[1]<=ran && ran<temp[2]){
			re=1;
		}else if(temp[2]<=ran && ran<temp[3]){
			re=2;
		}else if(temp[3]<=ran && ran<1){
			re=3;
		}
		

//		if(0<=ran && ran<=){}
		
		return re;
	}

}
