package practice_homework9.task19;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONValidator {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
