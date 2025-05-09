package Queuess;

public class ArrayImplementationQueue {

    public static class queueA{
        int r = -1;
        int f = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            if(r == arr.length-1) {
                System.out.println("Queue is full !");
                return ;
            }
            if(f == -1){
                f = 0;
            }
                arr[++r] = val;
                size++;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            else{
                int x = arr[f];
                f++;
                size--;
                return x; 
            }
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            return arr[f];
        }

        public void Dispaly(){
            if(size==0){
                System.out.println("Queue is Empty !");
            }
            else{
                for(int i = f;i<=r ;i++){
                    System.out.print(arr[i] +" ");
                }
            }
            System.out.println();

            }
        }
    

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(5);
        q.add(5);
        q.add(5);
        q.add(5);
        q.add(5);
        q.remove();
        q.Dispaly();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
