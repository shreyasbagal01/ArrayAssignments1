import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Array Size :");
		int size =Integer.parseInt(br.readLine());
		int pro =1;

		int arr[]=new int[size];
		System.out.println("Enter the array elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}for(int i=0;i<arr.length;i++){
			if(arr[i] %2==0){
				pro=pro*arr[i];
			}
		}System.out.println("Product ="+pro);
	}
}

