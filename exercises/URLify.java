import java.util.Arrays;

public class URLify {
  
  private static char[] URLify(char[] str, int length) {
    int spaceCounter = 0;

    //First lets calculate number of spaces
    for (int i = 0; i < length; i++) {
      if (str[i] == ' ') 
        spaceCounter++;
    }

    //calculate new size
    int newLength = length + 2*spaceCounter;

    char[] newArray = new char[newLength+1];
    newArray[newLength] = '\0';

    int newArrayPosition = 0;

    for (int i = 0; i < length; i++) {
      if (str[i] == ' ') {
        newArray[newArrayPosition] = '%';
        newArray[newArrayPosition+1] = '2';
        newArray[newArrayPosition+2] = '0';
        newArrayPosition = newArrayPosition + 3;

        System.out.println("Found a space: " + Arrays.toString(newArray));
        System.out.println("New index: " + newArrayPosition + "\n");


      }
      else {
    newArray[newArrayPosition] = str[i];
    newArrayPosition++;

    System.out.println("Found a letter: " + Arrays.toString(newArray));
    System.out.println("New index: " + newArrayPosition + "\n");
      }
    }               
    return newArray;
  }

  public static void main(String[] args) {
    char[] array = {'a','b','c','d',' ','e','f','g',' ','h',' ','j'};
    System.out.println(Arrays.toString(array));
    System.out.println(URLify(array, array.length));
  }

}