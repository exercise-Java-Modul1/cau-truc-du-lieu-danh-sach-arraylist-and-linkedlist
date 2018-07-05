package trienKhaiCacPhuongThucCuaArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(7);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(15);
        for (int i = 0; i < list.getSize(); i++) {
            list.getlist(i);
        }
        list.remove(4);
        list.remove(4);
        list.remove(4);
        System.out.println("-----------------------------");
        for (int i = 0; i < list.getSize(); i++) {
            list.getlist(i);
        }
        list.coverNumber(3, 200);
        System.out.println("-----------------------------");
        for (int i = 0; i < list.getSize(); i++) {
            list.getlist(i);
        }
        list.clear();
        System.out.println("-----------------------------");
        System.out.println(list.getSize());
        list.getlist(0);
        list.add(5);
        list.getlist(0);
        list.getlist(3);
    }
}
