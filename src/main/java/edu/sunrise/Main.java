package edu.sunrise;

import com.google.protobuf.InvalidProtocolBufferException;
import edu.sunrise.context.RequestContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte[] msg = RequestContext.newBuilder()
                .setId(1).setName("张三")
                .setEmail("zhangsan@rayo.com")
                .build().toByteArray();

        try {
            RequestContext requestContext = RequestContext.parseFrom(msg);
            System.out.println(requestContext.toString());
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}