
public class ShuXue
{
    public static void main(String[] args) {
        double z = 11.3 ;
        System.out.println("round"+Math.round(z));
        System.out.println(Math.floor(z));
        System.out.println(Math.ceil(z));
        System.out.println(Math.random()*100);

        int[] nums = new int[10];
        for (int i=0; i<10; i++){
            int x = (int)(Math.random()*10);
            nums[i] = x;
        }

        for (int num : nums){
            System.out.println(num);
        }
    }
}
