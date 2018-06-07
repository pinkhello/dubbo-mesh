package com.alibaba.dubbo.performance.demo.agent.protocol.dubbo;

import io.netty.buffer.ByteBuf;

public class DubboRpcResponse {

    private long requestId;
    private ByteBuf bytes;

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public ByteBuf getBytes() {
        return bytes;
    }

    public void setBytes(ByteBuf bytes) {
        this.bytes = bytes;
    }

}