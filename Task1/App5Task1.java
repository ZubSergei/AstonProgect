package Task1;

public class App5Task1 {
    public static void main(String[] args) {
        Animal animal = new Animal(500, 10);
        animal.run(233);
        animal.swim(400);
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        Dog dog = new Dog(30, 15);
        dog.run(500);
        dog.swim(10);
        Cat cat = new Cat(12, 0);
        Cat cat2 = new Cat(13, 0);
        cat.run(200);
        cat.swim(12);
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        Bowl bowl = new Bowl(3);
        Cat[] cats = {cat, cat2};
        for (Cat someCat : cats) someCat.eat(2, bowl);


        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isHungry()) {
                System.out.println("Кот под номером " + (i + 1) + " голоден");
            } else {
                System.out.println("Кот под номером " + (i + 1) + " сыт");
            }
        }
        System.out.println("Количество еды в миске " + bowl.getFoodAmount());
    }
}