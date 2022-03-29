package States;
import com.states.cg.Gujrat;
import com.states.cg.Maharastra;
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
    public void TestForWestBengal() {

        WestBengal wbt = new WestBengal();

        Map<String, List<String>> westbengal = new HashMap<String, List<String>>();
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

    @Test
    public void TestForMaharastra() {
        Maharastra mht = new Maharastra();
        Map<String, List<String>> maharastra = new HashMap<>();
        List<String> mh = new ArrayList<>();
        mh.add("Pune");
        mh.add("Mumbai");
        mh.add("Nashik");
        mh.add("Nagpur");
        mh.add("Solapur");

        maharastra.put("Maharastra", mh);

        assertTrue(mht.checkKey(maharastra));

        assertFalse(mht.checkValue(maharastra));


    }

    @Test
    public void TestForGujrat(){
        Gujrat gjt = new Gujrat();
        Map<String, List<String>> gujrat = new HashMap<>();
        List<String> gj = new ArrayList<>();
        gj.add("Surat");
        gj.add("Ahmedabad");
        gj.add("Vadodara");
        gj.add("Rajkot");
        gj.add("Jamnagar");

        gujrat.put("Gujrat", gj);

        assertTrue(gjt.checkKey(gujrat));

        assertFalse(gjt.checkValue(gujrat));
    }
}
