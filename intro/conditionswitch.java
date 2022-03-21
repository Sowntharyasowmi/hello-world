import javax.sql.rowset.spi.SyncFactory;
import java.util.*;
    public class conditionswitch {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("day");
            int day = input.nextInt();
            switch (day) {
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
            }
        }
    }


