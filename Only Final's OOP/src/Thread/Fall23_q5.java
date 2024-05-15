package Thread;

public class Fall23_q5 extends Thread {
    int []arr;
    int max;
    Fall23_q5(int arr[]){
        this.arr=arr;
    }
    public void run(){
        max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int []arr={3, 1, -5, 10};
        int []brr= {-2, 6, 7, 8, 0};
        int []crr= {12, -6, 4, 2, 1};
        int []drr= {10, 5, -9, 18, 7};
        Fall23_q5 p1=new Fall23_q5(arr);
        Fall23_q5 p2=new Fall23_q5(brr);
        Fall23_q5 p3=new Fall23_q5(crr);
        Fall23_q5 p4=new Fall23_q5(drr);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        try {
            p1.join();
            p2.join();
            p3.join();
            p4.join();
        }
        catch (Exception e){

        }
        System.out.println(p1.max);
        System.out.println(p2.max);
        System.out.println(p3.max);
        System.out.println(p4.max);
    }
}
