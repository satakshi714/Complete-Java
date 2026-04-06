public class HappyNumber
{
	public static void main(String[] args) {
	    
	    
	    for(int i=7;i<=500;i++){
	        
	         int temp=digitSum(i);
	         while(!isSingle(temp)){
	            temp=digitSum(temp);
	        }
	        if(temp==1){
	            System.out.println(i+" ");
	        }
	   }
	        
}

	public static int digitSum(int num){
	    int sum=0;
	    for(int j=num;j>0;j/=10){
	            int t=j%10;
	            sum+=(t*t);
	        }
	    return sum;
	}
	
	public static boolean isSingle(int a){
	    int count=0;
	    for(int i=a;i>0;i/=10){
	            count++;
	    }
	    if(count==1)return true;
	    
	    else return false;
	}
}