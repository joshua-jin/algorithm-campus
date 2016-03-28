import java.util.ArrayList;
import java.util.Arrays;

public class MajorityNumber {
    public int majorityNumber(final ArrayList<Integer> nums) {
        Object[] objects = nums.toArray();
        Arrays.sort(objects);
        if (objects.length == 1) {
            return (int) objects[0];
        }
        Arrays.sort(objects);
        return (int) objects[objects.length / 2];
    }
}