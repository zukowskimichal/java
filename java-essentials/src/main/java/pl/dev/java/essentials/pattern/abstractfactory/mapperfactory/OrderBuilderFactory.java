package pl.dev.java.essentials.pattern.abstractfactory.mapperfactory;

import java.util.HashMap;
import java.util.Map;

class OrderBuilderFactory {

    private OrderBuilderFactory() {
    }

    private static Map<ProductEnum, IOrderBuilder> orderBuilderMap = new HashMap<>();

    static {
        orderBuilderMap.put(ProductEnum.TROUBLE_TICKET, new TroubleTicketOrderBuilder());
    }

    static IOrderBuilder getMapper(ProductEnum productMapper) {
        return orderBuilderMap.get(productMapper);
    }

}
