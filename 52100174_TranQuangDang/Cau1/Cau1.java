class Cau1{
	public static int maxEvenPos(int a[]) {
		//code here
		if(a.length==0) return -1;
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(i%2==0 && a[i]>max) max=a[i];
		}
		return max;
	}
	
	
	public static String lowercaseFirstLetter(String str){
		//code here
		if(str.length()==0) return "";
		String[] str1=str.split(" ");
		String s="";
		for(int i=0;i<str1.length;i++){
			s+=str1[i].substring(0,1).toLowerCase()+str1[i].substring(1)+" ";
		}
		return s.trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Khoa Cong nghe thong tin";
		System.out.println(lowercaseFirstLetter(s));
	}
}