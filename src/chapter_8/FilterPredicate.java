package chapter_8;

public interface FilterPredicate<T> {
    public boolean filter(T fruit);
}

// class FilterType implements FilterPredicate{
//     private String type;
//     public FilterType(String type) {
//         this.type = type;
//     }
 
//     @Override
//     public boolean filter(Melon melon) {
//         if(melon == null) return false;
//         if(this.type.equals(melon.getType())) {
//             return true;
//         } else {
//             return false;
//         }
//     }
    
// }

// class FilterWeight implements FilterPredicate{
//     private int minWeight;
//     private int maxWeight;
//     public FilterWeight(int minWeight, int maxWeight) {
//         this.minWeight = minWeight;
//         this.maxWeight = maxWeight;
//     }
 
//     @Override
//     public boolean filter(Melon melon) {
//         if(melon == null) return false;
//         if(melon.getWeight() >= minWeight && melon.getWeight() <= maxWeight) {
//             return true;
//         } else {
//             return false;
//         }
//     }
    
// }
