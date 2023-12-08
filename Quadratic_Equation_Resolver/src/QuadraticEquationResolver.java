import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationResolver {
    public static List<Float> resolve(float firstNum, float secondNum, float thirdNum) {
        List<Float> result;
        float delta = (secondNum * secondNum) - (4 * firstNum * thirdNum);

        if (delta < 0) {
            result = null;
        } else {
            result = new ArrayList<>();
            if (delta == 0) {
                float root = -secondNum / (2 * firstNum);
                result.add(root);
            } else {
                float firstRoot = (float) ((- secondNum + Math.sqrt(delta)) / (2 * firstNum));
                float secondRoot = (float) ((- secondNum - Math.sqrt(delta)) / (2 * firstNum));
                result.add(firstRoot);
                result.add(secondRoot);
            }
        }

        return result;
    }
}
