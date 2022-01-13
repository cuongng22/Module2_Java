package Exercise.Arraylist;

public class Main {
    public static void main(String[] args) {
        Mylist<String> list = new Mylist<>();

        list.add("T");
        list.add("O");
        list.add("I");
        list.add(3,"M");

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
        System.out.println(list.contains("O"));
        System.out.println(list.indexOf("M"));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        list.add("T");
        list.add("O");
        list.add("I");
        list.add("T");
        list.add("O");
        list.add("I");
        list.add("T");
        list.add("O");
        list.add("I");
        list.add("T");
        list.add("O");
        list.add("I");
        System.out.println(list);
        System.out.println(list.contains("O"));
        System.out.println(list.indexOf("I"));
    }
}
