package org.posicube.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: CallJob.proto")
public final class CallJobGrpc {

  private CallJobGrpc() {}

  public static final String SERVICE_NAME = "CallJob";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.posicube.grpc.CallJobGrpcRequest,
      org.posicube.grpc.CallJobGrpcResponse> getGenerateCallJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateCallJob",
      requestType = org.posicube.grpc.CallJobGrpcRequest.class,
      responseType = org.posicube.grpc.CallJobGrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.posicube.grpc.CallJobGrpcRequest,
      org.posicube.grpc.CallJobGrpcResponse> getGenerateCallJobMethod() {
    io.grpc.MethodDescriptor<org.posicube.grpc.CallJobGrpcRequest, org.posicube.grpc.CallJobGrpcResponse> getGenerateCallJobMethod;
    if ((getGenerateCallJobMethod = CallJobGrpc.getGenerateCallJobMethod) == null) {
      synchronized (CallJobGrpc.class) {
        if ((getGenerateCallJobMethod = CallJobGrpc.getGenerateCallJobMethod) == null) {
          CallJobGrpc.getGenerateCallJobMethod = getGenerateCallJobMethod =
              io.grpc.MethodDescriptor.<org.posicube.grpc.CallJobGrpcRequest, org.posicube.grpc.CallJobGrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateCallJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.posicube.grpc.CallJobGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.posicube.grpc.CallJobGrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CallJobMethodDescriptorSupplier("GenerateCallJob"))
              .build();
        }
      }
    }
    return getGenerateCallJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CallJobStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallJobStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallJobStub>() {
        @java.lang.Override
        public CallJobStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallJobStub(channel, callOptions);
        }
      };
    return CallJobStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CallJobBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallJobBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallJobBlockingStub>() {
        @java.lang.Override
        public CallJobBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallJobBlockingStub(channel, callOptions);
        }
      };
    return CallJobBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CallJobFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallJobFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallJobFutureStub>() {
        @java.lang.Override
        public CallJobFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallJobFutureStub(channel, callOptions);
        }
      };
    return CallJobFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CallJobImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateCallJob(org.posicube.grpc.CallJobGrpcRequest request,
        io.grpc.stub.StreamObserver<org.posicube.grpc.CallJobGrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateCallJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateCallJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.posicube.grpc.CallJobGrpcRequest,
                org.posicube.grpc.CallJobGrpcResponse>(
                  this, METHODID_GENERATE_CALL_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class CallJobStub extends io.grpc.stub.AbstractAsyncStub<CallJobStub> {
    private CallJobStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallJobStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallJobStub(channel, callOptions);
    }

    /**
     */
    public void generateCallJob(org.posicube.grpc.CallJobGrpcRequest request,
        io.grpc.stub.StreamObserver<org.posicube.grpc.CallJobGrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateCallJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CallJobBlockingStub extends io.grpc.stub.AbstractBlockingStub<CallJobBlockingStub> {
    private CallJobBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallJobBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallJobBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.posicube.grpc.CallJobGrpcResponse generateCallJob(org.posicube.grpc.CallJobGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCallJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CallJobFutureStub extends io.grpc.stub.AbstractFutureStub<CallJobFutureStub> {
    private CallJobFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallJobFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallJobFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.posicube.grpc.CallJobGrpcResponse> generateCallJob(
        org.posicube.grpc.CallJobGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateCallJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_CALL_JOB = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CallJobImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CallJobImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_CALL_JOB:
          serviceImpl.generateCallJob((org.posicube.grpc.CallJobGrpcRequest) request,
              (io.grpc.stub.StreamObserver<org.posicube.grpc.CallJobGrpcResponse>) responseObserver);
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

  private static abstract class CallJobBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CallJobBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.posicube.grpc.CallJobProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CallJob");
    }
  }

  private static final class CallJobFileDescriptorSupplier
      extends CallJobBaseDescriptorSupplier {
    CallJobFileDescriptorSupplier() {}
  }

  private static final class CallJobMethodDescriptorSupplier
      extends CallJobBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CallJobMethodDescriptorSupplier(String methodName) {
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
      synchronized (CallJobGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CallJobFileDescriptorSupplier())
              .addMethod(getGenerateCallJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
