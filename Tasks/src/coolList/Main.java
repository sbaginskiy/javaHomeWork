package coolList;

public class Main {

    public static void main(String[] args) {
        MyCoolList<?> myCoolList = new MyCoolList();

        myCoolList.value = new Object[]{1,2,3};

        myCoolList.add(4);

        for (Object x: myCoolList.value) {
            System.out.println(x);
        }
    }
}
