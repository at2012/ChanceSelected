
public class ChanSel {

	public static int sel(double[] a){
		double ran=Math.random();
		double left=0;
		double right=a[0];
		int re=a.length;
		System.out.println("random="+ran);
		for(int i=0;i<a.length;i++){//这个不用i<a.length-1;开始-1是为了防止数组越界，但是，实际上，在进入到a[i+1]的时候，是不会出现越界的，因为已经到了最后一个区间了，如果前面都没匹配的话，这次一定匹配了。
			if(left<=ran && ran<=right){
				re=i;
				break;
			}else{
				left=right;
				right+=a[i+1];
			}
		}
		
		
		return re;
	}
}
