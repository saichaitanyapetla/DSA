
public class TestApp {
   public int[] max_min(int[]a) {
	   int max=a[0];
	   int min=a[0];
	   for (int i : a) {
		if(i>max)
			max=i;
		if(i<min)
			min=i;
	}
	   return new int[] {min,max};
   }
	public static void main(String[] args) {
		int[] a=new int[] {2,87,0,12};
		TestApp testApp = new TestApp();
		int[] res = testApp.max_min(a);
		System.out.println(res);
		for (int i : res) {
			System.out.println(i);
		}
	}   
   
}
