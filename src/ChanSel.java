
public class ChanSel {

	public static int sel(double[] a){
		double ran=Math.random();
		double left=0;
		double right=a[0];
		int re=a.length;
		System.out.println("random="+ran);
		for(int i=0;i<a.length;i++){//�������i<a.length-1;��ʼ-1��Ϊ�˷�ֹ����Խ�磬���ǣ�ʵ���ϣ��ڽ��뵽a[i+1]��ʱ���ǲ������Խ��ģ���Ϊ�Ѿ��������һ�������ˣ����ǰ�涼ûƥ��Ļ������һ��ƥ���ˡ�
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
