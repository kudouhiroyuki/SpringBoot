class Test {
  public static void main(String[] args) {
    System.out.println("Test");
    
    String name;
    int old;
    int height;
    name = "Tarou Yamada";
    old = 20;
    height = 184;
    System.out.println("名前：" + name);
    System.out.println("年齢：" + old);
    System.out.println("身長：" + height);

    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      sum += i;
    }
    System.out.println("合計：" + sum);
  }
}