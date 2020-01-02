package datastructure;

public class StringPermutation {

    public static void main(String[] args){
        String str="ABC";
        StringPermutation permutation=new StringPermutation();
        permutation.permutation(str,0);
    }

    public String swap(String str,int i,int j){
        char[] arr=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return String.valueOf(arr);
    }

    public void permutation(String str,int startIndex){

        if(startIndex==str.length()-1){
            System.out.println(str);
            return;
        }
        for(int i=startIndex;i<str.length();i++){
            str=swap(str,startIndex,i);
            permutation(str,startIndex+1);
            str=swap(str,startIndex,i);
        }
    }
}
