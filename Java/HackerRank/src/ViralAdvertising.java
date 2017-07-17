/**
 * Created by vmurakami on 12/07/17.
 */
import java.util.*;

public class ViralAdvertising {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a value for days: ");
            int n = scan.nextInt();
            int like=0 , people=5, total_people=0;
            for(int i =1; i<=n; i++){
                like = (Math.floorDiv(people,2));
                people = like * 3;
                total_people = total_people + like;
        }
            System.out.println(total_people);

    }

}
