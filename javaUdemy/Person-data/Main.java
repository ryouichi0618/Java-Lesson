import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("何人分の情報を入力しますか：");
    int count = scanner.nextInt();
    int oldest = 0;
    int averageAge = 0;
    for(int i = 1; i <= count; i++) {
      System.out.println(i + "人目");
      System.out.print("名前：");
      String firstName = scanner.next();
      
      System.out.print("名字：");
      String lastName = scanner.next();
      
      
      System.out.print("年齢：");
      int age = scanner.nextInt();
      
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      
      String name = Person.fullName(firstName, lastName);
      
      Person.printData(name, age, height, weight);
      if (oldest < age) {
        oldest = age;
      }
      averageAge += age;
    }
    System.out.println("最高年齢は"+ oldest +"歳です");
    averageAge /= count;
    System.out.print("平均年齢は"+ averageAge +"歳です");
  }
    
  
}
