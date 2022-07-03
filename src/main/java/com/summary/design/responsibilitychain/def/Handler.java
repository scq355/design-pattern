package com.summary.design.responsibilitychain.def;

public abstract class Handler {
    private Handler next;
    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        } else {
            if (this.next != null) {
                response = this.next.handleMessage(request);
            } else {
                //没有适当的处理者，业务自行处理
            }
        }
        return response;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
