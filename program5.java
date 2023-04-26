import java.io.*;
class Demo{
	public static void main(String []Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array:");
		int size =Integer.parseInt(br.readLine());

		int arr[] =new int[size];
		System.out.print("Enter the elements of array:");
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}for (int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.println("divisible by 5"+arr[i]);
			}
		}
	}
}
