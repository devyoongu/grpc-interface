package org.posicube.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: CallHistory.proto")
public final class CallHistoryGrpc {

  private CallHistoryGrpc() {}

  public static final String SERVICE_NAME = "CallHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.posicube.grpc.HistoryGrpcRequest,
      org.posicube.grpc.HistoryGrpcResponse> getSendHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendHistory",
      requestType = org.posicube.grpc.HistoryGrpcRequest.class,
      responseType = org.posicube.grpc.HistoryGrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.posicube.grpc.HistoryGrpcRequest,
      org.posicube.grpc.HistoryGrpcResponse> getSendHistoryMethod() {
    io.grpc.MethodDescriptor<org.posicube.grpc.HistoryGrpcRequest, org.posicube.grpc.HistoryGrpcResponse> getSendHistoryMethod;
    if ((getSendHistoryMethod = CallHistoryGrpc.getSendHistoryMethod) == null) {
      synchronized (CallHistoryGrpc.class) {
        if ((getSendHistoryMethod = CallHistoryGrpc.getSendHistoryMethod) == null) {
          CallHistoryGrpc.getSendHistoryMethod = getSendHistoryMethod =
              io.grpc.MethodDescriptor.<org.posicube.grpc.HistoryGrpcRequest, org.posicube.grpc.HistoryGrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.posicube.grpc.HistoryGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.posicube.grpc.HistoryGrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CallHistoryMethodDescriptorSupplier("SendHistory"))
              .build();
        }
      }
    }
    return getSendHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CallHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallHistoryStub>() {
        @java.lang.Override
        public CallHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallHistoryStub(channel, callOptions);
        }
      };
    return CallHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CallHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallHistoryBlockingStub>() {
        @java.lang.Override
        public CallHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallHistoryBlockingStub(channel, callOptions);
        }
      };
    return CallHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CallHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallHistoryFutureStub>() {
        @java.lang.Override
        public CallHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallHistoryFutureStub(channel, callOptions);
        }
      };
    return CallHistoryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CallHistoryImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendHistory(org.posicube.grpc.HistoryGrpcRequest request,
        io.grpc.stub.StreamObserver<org.posicube.grpc.HistoryGrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.posicube.grpc.HistoryGrpcRequest,
                org.posicube.grpc.HistoryGrpcResponse>(
                  this, METHODID_SEND_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class CallHistoryStub extends io.grpc.stub.AbstractAsyncStub<CallHistoryStub> {
    private CallHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallHistoryStub(channel, callOptions);
    }

    /**
     */
    public void sendHistory(org.posicube.grpc.HistoryGrpcRequest request,
        io.grpc.stub.StreamObserver<org.posicube.grpc.HistoryGrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CallHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<CallHistoryBlockingStub> {
    private CallHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallHistoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.posicube.grpc.HistoryGrpcResponse sendHistory(org.posicube.grpc.HistoryGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CallHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<CallHistoryFutureStub> {
    private CallHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallHistoryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.posicube.grpc.HistoryGrpcResponse> sendHistory(
        org.posicube.grpc.HistoryGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_HISTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CallHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CallHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_HISTORY:
          serviceImpl.sendHistory((org.posicube.grpc.HistoryGrpcRequest) request,
              (io.grpc.stub.StreamObserver<org.posicube.grpc.HistoryGrpcResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CallHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CallHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.posicube.grpc.CallHistoryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CallHistory");
    }
  }

  private static final class CallHistoryFileDescriptorSupplier
      extends CallHistoryBaseDescriptorSupplier {
    CallHistoryFileDescriptorSupplier() {}
  }

  private static final class CallHistoryMethodDescriptorSupplier
      extends CallHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CallHistoryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CallHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CallHistoryFileDescriptorSupplier())
              .addMethod(getSendHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
