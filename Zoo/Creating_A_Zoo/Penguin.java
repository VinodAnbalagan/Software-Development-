class Penguin extends Animal implements Eat, Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(String name, int walkSpeed, String isSwimming, int swimSpeed) {
        super(name);
        this.walkSpeed = walkSpeed;
        this.isSwimming = isSwimming.equalsIgnoreCase("true");
        this.swimSpeed = swimSpeed;
    }

    public Penguin() {
        this("Penguin", 3, "false", 20);
    }


    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
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
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public void swimming() {
        System.out.println(getNameOfAnimal() + ": I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }


}