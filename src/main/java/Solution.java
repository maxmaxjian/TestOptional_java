import com.google.common.base.Optional;

public class Solution {

    public static void main(String[] args) {
        Optional<String> result = Optional.fromNullable(null);
//        System.out.println(result.get());
        Optional<String> res = Optional.absent();
        System.out.println(result.equals(res));
        System.out.println(result.isPresent());
    }

}
