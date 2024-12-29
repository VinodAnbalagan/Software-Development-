class Dolphin extends Animal implements Eat, Swim {
    private String color;
    private int swimmingSpeed;

    public Dolphin(String name, String color, int swimmingSpeed) {
        super(name);
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {
        this("Dolphin", "Gray", 30);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ": I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println(getNameOfAnimal() + ": I am swimming at the speed " + swimmingSpeed);
    }
}