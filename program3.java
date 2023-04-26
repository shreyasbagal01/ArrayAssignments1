import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size of array:");
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int [size];
		int product =1;

		System.out.println("Enter the array of element :");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				product =product*arr[i];
			}
		}System.out.println("Product"+product);
	}
}



