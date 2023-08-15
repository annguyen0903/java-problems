package src.tmp;

import java.util.HashMap;
import java.util.Map;

public class MapCopy {

    public <K, V> Map<K, V> shadowCopyMap(HashMap<K, V> map1) {
        var result = new HashMap<K, V>(map1);
        return result;
    }

    public Map<Integer, MutableAccount> deepCopyMap(HashMap<Integer, MutableAccount> map1) 
    throws CloneNotSupportedException {
        var result = new HashMap<Integer, MutableAccount>(map1);
        for(Map.Entry<Integer, MutableAccount> entry : map1.entrySet()) {
            var curAcc = entry.getValue();
            if(curAcc == null) {
                result.put(entry.getKey(), null);
            } else {
                result.put(entry.getKey(), curAcc.clone());
            }
        }
        return result;
    }

}

class MutableAccount implements Cloneable{
    private Integer id;
    private String name;

    @Override
    protected MutableAccount clone() throws CloneNotSupportedException {
        var clonedObj = new MutableAccount(this.id, this.name);
        return clonedObj;
    }

    public MutableAccount(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MutableAccount other = (MutableAccount) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
}
