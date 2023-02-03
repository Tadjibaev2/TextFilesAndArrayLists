package Cat;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Cat) {
            return ((Cat) obj).name.equals(this.name) &&
                    ((Cat) obj).age == age;
        }
        return false;
    }


    public static void main(String[] args) {

    }

}
