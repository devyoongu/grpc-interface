package org.posicube.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: CampaignRequest.proto")
public final class CampaignGrpc {

  private CampaignGrpc() {}

  public static final String SERVICE_NAME = "Campaign";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.posicube.grpc.CampaignGrpcRequest,
      org.posicube.grpc.CampaignGrpcResponse> getReadCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadCampaign",
      requestType = org.posicube.grpc.CampaignGrpcRequest.class,
      responseType = org.posicube.grpc.CampaignGrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.posicube.grpc.CampaignGrpcRequest,
      org.posicube.grpc.CampaignGrpcResponse> getReadCampaignMethod() {
    io.grpc.MethodDescriptor<org.posicube.grpc.CampaignGrpcRequest, org.posicube.grpc.CampaignGrpcResponse> getReadCampaignMethod;
    if ((getReadCampaignMethod = CampaignGrpc.getReadCampaignMethod) == null) {
      synchronized (CampaignGrpc.class) {
        if ((getReadCampaignMethod = CampaignGrpc.getReadCampaignMethod) == null) {
          CampaignGrpc.getReadCampaignMethod = getReadCampaignMethod =
              io.grpc.MethodDescriptor.<org.posicube.grpc.CampaignGrpcRequest, org.posicube.grpc.CampaignGrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.posicube.grpc.CampaignGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.posicube.grpc.CampaignGrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignMethodDescriptorSupplier("ReadCampaign"))
              .build();
        }
      }
    }
    return getReadCampaignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignStub>() {
        @java.lang.Override
        public CampaignStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignStub(channel, callOptions);
        }
      };
    return CampaignStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBlockingStub>() {
        @java.lang.Override
        public CampaignBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBlockingStub(channel, callOptions);
        }
      };
    return CampaignBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignFutureStub>() {
        @java.lang.Override
        public CampaignFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignFutureStub(channel, callOptions);
        }
      };
    return CampaignFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CampaignImplBase implements io.grpc.BindableService {

    /**
     */
    public void readCampaign(org.posicube.grpc.CampaignGrpcRequest request,
        io.grpc.stub.StreamObserver<org.posicube.grpc.CampaignGrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadCampaignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadCampaignMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.posicube.grpc.CampaignGrpcRequest,
                org.posicube.grpc.CampaignGrpcResponse>(
                  this, METHODID_READ_CAMPAIGN)))
          .build();
    }
  }

  /**
   */
  public static final class CampaignStub extends io.grpc.stub.AbstractAsyncStub<CampaignStub> {
    private CampaignStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignStub(channel, callOptions);
    }

    /**
     */
    public void readCampaign(org.posicube.grpc.CampaignGrpcRequest request,
        io.grpc.stub.StreamObserver<org.posicube.grpc.CampaignGrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadCampaignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CampaignBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignBlockingStub> {
    private CampaignBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.posicube.grpc.CampaignGrpcResponse readCampaign(org.posicube.grpc.CampaignGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadCampaignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CampaignFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignFutureStub> {
    private CampaignFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.posicube.grpc.CampaignGrpcResponse> readCampaign(
        org.posicube.grpc.CampaignGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadCampaignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_CAMPAIGN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_CAMPAIGN:
          serviceImpl.readCampaign((org.posicube.grpc.CampaignGrpcRequest) request,
              (io.grpc.stub.StreamObserver<org.posicube.grpc.CampaignGrpcResponse>) responseObserver);
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

  private static abstract class CampaignBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.posicube.grpc.CampaignProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Campaign");
    }
  }

  private static final class CampaignFileDescriptorSupplier
      extends CampaignBaseDescriptorSupplier {
    CampaignFileDescriptorSupplier() {}
  }

  private static final class CampaignMethodDescriptorSupplier
      extends CampaignBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignFileDescriptorSupplier())
              .addMethod(getReadCampaignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
