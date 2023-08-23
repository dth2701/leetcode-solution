import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
class RandomizedSet {
    private Map<Integer, Integer> map;  // Value to its index in the list
    private List<Integer> list;         // List of values
    private Random rand;                // Random number generator

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        // Add value to list and update the map with its index
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        
        // Move the last element to the place of the element to remove
        int lastElement = list.get(list.size() - 1);
        int index = map.get(val);
        
        list.set(index, lastElement);
        map.put(lastElement, index);
        
        // Remove the last element
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
