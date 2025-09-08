
public class Linearsearch {
    public static void main(String[] args) {
        char[] arr = {'s','r','k','o','m'};
        char t = 'r';
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
    