package helloWorld.design.Factory.MethodFactory;

import helloWorld.design.Factory.SimpleFactory.Phone;

public interface AbstractFactory {
    Phone makePhone();
    Pc makePc();
}
