public class CRUD_Oparetion_Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int p=0;
        p = insert(arr,p,40);
        p = insert(arr,p,20);
        p = insert(arr,p,60);
        p = insert(arr,p,50);

        p= delete(arr,p,40);

        update(arr,p,20,10);
        System.out.println(arr[0]);
    }

    public static int insert (int[]arr,int p,int value){
        arr[p]=value;
        p++;
        return p;
    }

    public static void update(int[] arr,int p,int oldv,int newv){
        for(int i=0;i<p;i++){
            if(arr[i]==oldv){
                arr[i]=newv;
                return;
            }
        }
    }
    public static int delete(int[] arr,int p,int value){
        for(int i=0;i<p;i++){
            if(arr[i]==value){
                for(int j=i;j<p-1;j++){
                    arr[j]=arr[j+1];
                }
                p--;
            }
        }
        return p;
    }
}