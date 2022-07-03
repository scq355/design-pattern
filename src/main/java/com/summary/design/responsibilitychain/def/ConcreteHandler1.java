package com.summary.design.responsibilitychain.def;

import com.summary.design.responsibilitychain.def.Handler;

public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
