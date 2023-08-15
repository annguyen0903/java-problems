package src.tmp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class MapCopyTest {
    @Test
    public void testShadowCopyMap(){
        var map1 = new HashMap<Integer, MutableAccount>();
        map1.put(1, new MutableAccount(1, "acc1"));
        map1.put(2, new MutableAccount(2, "acc2"));
        var util = new MapCopy();
        var map2 = util.shadowCopyMap(map1);
        //change original map, then check it affect to the shadow copy map
        map1.get(1).setName("acc1-modified");
        assertTrue(map2.containsValue(map1.get(1)));
    }

    @Test
    public void testDeepCopyMap() throws CloneNotSupportedException{
        var map1 = new HashMap<Integer, MutableAccount>();
        map1.put(1, new MutableAccount(1, "acc1"));
        map1.put(2, new MutableAccount(2, "acc2"));
        var util = new MapCopy();
        var map2 = util.deepCopyMap(map1);
        //change original map, then check it affect to the shadow copy map
        map1.get(1).setName("acc1-modified");
        assertFalse(map2.containsValue(map1.get(1)));
    }

    //TODO: how to implement a library of deep copy (general type)
    //https:/​/​github.​com/kostaskougios/​cloning
}
