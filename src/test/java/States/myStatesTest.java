package States;
import com.states.cg.WestBengal;
import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class myStatesTest {
    @Test
    public void DistrictTest() {

        WestBengal wbt = new WestBengal();

        Map<String,List<String>> westbengal= new HashMap<String,List<String>>();
        List<String> wb = new ArrayList<>();
        wb.add("Kolkata");
        wb.add("North 24 Parganas");
        wb.add("South 24 Parganas");
        wb.add("Howrah");
        wb.add("Bankura");

        westbengal.put("West Bengal", wb);

        assertTrue(wbt.checkKey(westbengal));

        assertFalse(wbt.checkValue(westbengal));

    }

}
