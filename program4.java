import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the array Size:");
		int size =Integer.parseInt(br.readLine());
		int add =0;

		char arr[]=new char[size];
		System.out.print("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)br.read();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				System.out.println(arr[i]);
			}
		}//System.out.println(add);
	}
}
				

