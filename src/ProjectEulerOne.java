/**
 * E15: ProjectEulerOne test
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerOne {
  public static void main(String[] args){

    int sum;
    sum = 0;

    for(int i = 0; i < 1000; i++){
      if(i%5 == 0){
        sum = sum + i;
      }
      else if(i%3 == 0){
        sum = sum + i;
      }
    }

    System.out.print(sum);
  }
}
