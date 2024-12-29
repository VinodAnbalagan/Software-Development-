class Tiger extends Animal implements Eat, Walk {
    private int numberOfStripes;
    private int speed;
    private int roarSoundLevel;

    public Tiger(String name, int numberOfStripes, int speed, int roarSoundLevel) {
        super(name);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.roarSoundLevel = roarSoundLevel;
    }

    public Tiger() {
        this("Tiger", 0, 40, 0);
    }


    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return roarSoundLevel;
    }

    public void setSoundLevel(int roarSoundLevel) {
        this.roarSoundLevel = roarSoundLevel;
    }

    @Override
    public void eatingFood() {
        System.out.println("The animal: " + getNameOfAnimal() + " is eating.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am moving at the speed " + speed);
    }
}

