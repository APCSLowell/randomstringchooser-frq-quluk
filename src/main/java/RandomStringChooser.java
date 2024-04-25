
import java.util.*;
public class RandomStringChooser{
private ArrayList<String> wordsLeft;
public RandomStringChooser(String[] values){
    wordsLeft = new ArrayList<String>();
    for(int i = 0; i<values.length; i++){
      wordsLeft.add(values[i]);
    }
  }

  public String getNext(){
    if(wordsLeft.size() == 0){
      return "NONE";
    }
    int index = (int) (Math.random() * wordsLeft.size());
    return wordsLeft.remove(index);
  }
}
