import java.util.List;

class SimpleMaths {

   public static int calculateAverage(List<Integer> listOfIntegers) {
      int average=0;
      for (int value: listOfIntegers) {
         average+=value;
      }
      average/=listOfIntegers.size();
      return average;
   }
}