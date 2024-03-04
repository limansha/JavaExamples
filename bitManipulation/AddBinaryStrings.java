class AddBinaryStrings {
    public static void main(String[] args) {
        String num1 = "110";
        String num2  = "101";
        String ans = addNums(num1,num2);
        System.out.println("normal answer is : "+ addNumsNormal(num1,num2));
 
        System.out.println("int answer is : "+ ans);
        System.out.println("long answer is : "+ addLongNums(num1,num2));
    }
    public static String addNums(String num1, String num2){
        int n1 = Integer.parseInt(num1,2);   
        int n2 = Integer.parseInt(num2,2);
        int ans = n1 + n2;
        return Integer.toBinaryString(ans);
    } 
    public static String addLongNums(String num1, String num2){
        long n1 = Long.parseLong(num1,2);   
        long n2 = Long.parseLong(num2,2);
        long ans = n1 + n2;
        return Long.toBinaryString(ans);
    }
    public static String addNumsNormal(String num1, String num2){
       //iterate the string num1,num2 and convert it to integer then sum is module by 2 and rem is added to string
       String ans = "";
       int len1 = num1.length();
       int len2 = num2.length();
       int n1 = 0;
       int n2 = 0;
       int ph = 0;
       for(int i=0;i<len1;i++){
            if(num1.charAt(len1-i-1) == '1'){
                n1 += (int)Math.pow(2,ph);
            }
            ph++;
       }
       ph = 0;
       for(int i=0;i<len2;i++){
            if(num2.charAt(len2-i-1) == '1'){
                n2 += (int)Math.pow(2,ph);
            }
            ph++;
       }
       int ans1 = n1 + n2;
       System.out.println("n1 : "+ n1 +" n2 : "+ n2+ " ans1 : "+ans1);
       return Integer.toBinaryString(ans1);
    }
}
