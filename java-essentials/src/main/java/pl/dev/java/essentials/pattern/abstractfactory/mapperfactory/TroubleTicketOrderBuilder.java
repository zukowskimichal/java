package pl.dev.java.essentials.pattern.abstractfactory.mapperfactory;

class TroubleTicketOrderBuilder implements IOrderBuilder {

    TroubleTicketOrderBuilder() {

    }

    static Order buildOrder() {
        return new Order();
    }
}
