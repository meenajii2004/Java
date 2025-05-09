package Queuess;


// Array Implementation in circular Queue
public class CircularQueue {

    public static class CQA{
        int f =-1; 
        int r =-1; 
        int size = 0;
        int arr[] = new int[5];

        public void add(int x) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is Full!");
            }
            if(size == 0){
                f = r = 0;
                arr[0] = x;
            }
            else if(r<arr.length-1){
                arr[++r] =x;
            }
            else{
                r = 0;
                arr[r] = x;
            }
            size++;
        }

        public int remove() throws  Exception{
            if(size ==0 ){
                throw new Exception("Queue is Empty!");
            }
            int val = arr[f];
            if(f == arr.length-1) {
                f=0;
            }
            else {f++;}
            size--;

            if(size ==0){
                f=-1;
                r=-1;
            }
            return val;
        }
            
            public int peek() throws Exception{
                if(size ==0 ){
                    throw new Exception("Queue is Empty !");
                }
                return arr[f];
                
            }

            public boolean isEmpty(){
                if(size ==0 ){
                    return true ;
                }
                else return false;
            }

            public void Display(){
                if(size ==0 ){
                    System.out.print("Queue is Empty!");
                }
                else if(f<=r){
                    for(int i =f ;i<=r ;i++){
                        System.out.print(arr[i] +" ");
                    }
                }
                else{
                    for(int i = f ; i<= arr.length-1 ;i++){
                        System.out.print(arr[i] + " ");
                    }
                    for(int i =0 ; i <=r ;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
                System.out.println();
            }
        

    }

    public static void main(String[] args) {
        CQA q = new CQA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
    }
    
}
