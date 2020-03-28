package importJAVASE;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import importJAVASE.Enum.AccountType;
import importJAVASE.Enum.Pizza;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * @author cl
 * function:
 * Created on  2020-03-24 15:03
 */
public class EnumTest {

    @Test
    public void test1() throws IOException {
        Pizza testPz = new Pizza();
        testPz.setStatus(Pizza.PizzaStatus.DELIVERED);
        testPz.printTimeToDeliver();

        assertTrue(testPz.isDeliverable());
    }

    @Test
    public void enumToJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValueAsString(AccountType.FIXED);
    }
}
