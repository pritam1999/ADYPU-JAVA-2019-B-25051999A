package arrays;

public class ArrayDemo {
	void onedArray()
	{
		int array[]= {1,2,3,4,5};
		
		int array1[]= new int[5];
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
	}
	public static void main(String[] args)
	{
		ArrayDemo demo=new ArrayDemo();
		demo.onedArray();
	}

}
