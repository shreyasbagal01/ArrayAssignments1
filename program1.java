import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size of Array :");
		int size =Integer.parseInt(br.readLine());
		int sum =0;

		int arr[] = new int [size];
		System.out.println("Enter the array elements : ");
		for (int i = 0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i =0;i<arr.length;i++){
			if(arr[i]%2 == 1){
				sum =sum+arr[i];
			}
		}System.out.println("Sum Of ="+sum);

	}
}
