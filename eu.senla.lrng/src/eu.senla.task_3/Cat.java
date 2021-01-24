package eu.senla.task_3;

public class Cat {

    public String name = "dasdsa";
    public int age = 1231;
    String catName = "feodor";
    String catAge = "12y.o";
    private String catName1;
    private int catAge1;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Cat() {

    }

    public String getCatName1() {
        return catName1;
    }

    public void setCatName1(String catName1) {
        this.catName1 = catName1;
    }

    public int getCatAge1() {
        return catAge1;
    }

    public void setCatAge1(int catAge1) {
        this.catAge1 = catAge1;
    }

    public void ts() {
        int count = 0;

        while (count < 10) {
            count++;
            System.out.println("Name:" + catName + " ");
            System.out.println("Age:" + catAge);

        }
    }


}


