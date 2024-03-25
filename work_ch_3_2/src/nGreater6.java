public class nGreater6 {

        public static void main(String[] args) {
            int n=1;
            double sum=1.0;

            while(sum<6){
                n++;
                sum+=(1.0/n);
            }
            System.out.println("n="+(n-1));
            System.out.println("sum="+sum);
        }

}
