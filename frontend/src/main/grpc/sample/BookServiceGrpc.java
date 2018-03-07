package sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: book.proto")
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<sample.BookOuterClass.CreateRequest,
      sample.BookOuterClass.Book> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<sample.BookOuterClass.CreateRequest,
      sample.BookOuterClass.Book> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<sample.BookOuterClass.CreateRequest,
      sample.BookOuterClass.Book> getCreateMethod() {
    io.grpc.MethodDescriptor<sample.BookOuterClass.CreateRequest, sample.BookOuterClass.Book> getCreateMethod;
    if ((getCreateMethod = BookServiceGrpc.getCreateMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getCreateMethod = BookServiceGrpc.getCreateMethod) == null) {
          BookServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<sample.BookOuterClass.CreateRequest, sample.BookOuterClass.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.BookOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.BookOuterClass.Book.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      sample.BookOuterClass.Books> METHOD_FIND_ALL = getFindAllMethod();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      sample.BookOuterClass.Books> getFindAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      sample.BookOuterClass.Books> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, sample.BookOuterClass.Books> getFindAllMethod;
    if ((getFindAllMethod = BookServiceGrpc.getFindAllMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getFindAllMethod = BookServiceGrpc.getFindAllMethod) == null) {
          BookServiceGrpc.getFindAllMethod = getFindAllMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, sample.BookOuterClass.Books>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.BookOuterClass.Books.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("FindAll"))
                  .build();
          }
        }
     }
     return getFindAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<sample.BookOuterClass.DeleteRequest,
      com.google.protobuf.Empty> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<sample.BookOuterClass.DeleteRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<sample.BookOuterClass.DeleteRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<sample.BookOuterClass.DeleteRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = BookServiceGrpc.getDeleteMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getDeleteMethod = BookServiceGrpc.getDeleteMethod) == null) {
          BookServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<sample.BookOuterClass.DeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.BookOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    return new BookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(sample.BookOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<sample.BookOuterClass.Book> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<sample.BookOuterClass.Books> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void delete(sample.BookOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sample.BookOuterClass.CreateRequest,
                sample.BookOuterClass.Book>(
                  this, METHODID_CREATE)))
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                sample.BookOuterClass.Books>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sample.BookOuterClass.DeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractStub<BookServiceStub> {
    private BookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(sample.BookOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<sample.BookOuterClass.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<sample.BookOuterClass.Books> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(sample.BookOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sample.BookOuterClass.Book create(sample.BookOuterClass.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public sample.BookOuterClass.Books findAll(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(sample.BookOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractStub<BookServiceFutureStub> {
    private BookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sample.BookOuterClass.Book> create(
        sample.BookOuterClass.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sample.BookOuterClass.Books> findAll(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        sample.BookOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((sample.BookOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<sample.BookOuterClass.Book>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<sample.BookOuterClass.Books>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((sample.BookOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sample.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
