
public class Linear {
public static void main(String[] args) {
    int[] arr = {2,4,6,7,9,8,0};
    int t = 7;
    int idx=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==t){
            idx=i;
            break;
        }
    }
    if(idx!=-1){
        System.out.println("Element found at "+ idx);
    }else{
        System.out.println("Element not found");
    }
}
    
}
