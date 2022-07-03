package com.summary.design.responsibilitychain.base;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    private Handler next;

    public Handler(int level) {
        this.level = level;
    }

    protected abstract void response(IWomen women);

    public void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.next != null) {
                this.next.handleMessage(women);
            } else {
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }

    public void setNext(Handler handler) {
        this.next = handler;
    }
}
