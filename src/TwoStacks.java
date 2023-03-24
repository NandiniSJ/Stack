public class TwoStacks {

        int[] array;
        int size;
        int top1;
        int top2;

        // divining the array in to two halves;

        public TwoStacks(int n){
            array = new int[n];
            this.size = n;
            this.top1 = (n/2)-1;
            this.top2 = n/2;
        }

        // for pushing the elements in first halve;
        public void push1(int x){
            if(top1 >= 0){
                array[top1] = x;
                top1--;
            }else {
                System.out.println("Stack overflow" + "By Element" + x);
            }
        }

        // for pushing the elements in second halves;
        public void push2(int x){
           if(top2 < size){
               array[top2] = x;
               top2 ++;
           }else{
               System.out.println("Stack overflow" + "By Element" + x);
           }
        }

        public int pop1(){
            if(top1 == -1){
                top1 = 0;
            }
            if(top1 < size/2){
                int x = array[top1];
                top1++;
                return x;
            }else {
                System.out.println("Stack overflow");
            }
            return 0;
        }

        public int pop2(){
            if(top2 > size/2){
                int x = array[top2-1];
                top2--;
                return x;
            }else{
                System.out.println("Stack Overflow");
            }
            return 1;
        }

    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(6);
        twoStacks.push2(3);
        twoStacks.push1(4);
        twoStacks.push1(5);
        twoStacks.push1(6);
        twoStacks.push2(1);
        twoStacks.push2(2);
        twoStacks.push2(10);


        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
    }
}
