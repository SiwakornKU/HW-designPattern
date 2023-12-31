package ku.cs.duck;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

    public abstract Quackable createQuackCounter( Quackable duck);

    public abstract Quackable createQuackEchoAndCounter( Quackable duck);
}
