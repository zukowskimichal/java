package pl.dev.java.essentials.pattern.abstractfactory.mapperfactory;

interface IOrderBuilder {

    default Order buildOrder() {
        return null;
    }

}
