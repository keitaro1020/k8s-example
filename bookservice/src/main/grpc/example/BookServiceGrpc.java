package example;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
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
  public static final io.grpc.MethodDescriptor<example.BookOuterClass.CreateBookRequest,
      example.BookOuterClass.Book> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<example.BookOuterClass.CreateBookRequest,
      example.BookOuterClass.Book> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.BookOuterClass.CreateBookRequest,
      example.BookOuterClass.Book> getCreateMethod() {
    io.grpc.MethodDescriptor<example.BookOuterClass.CreateBookRequest, example.BookOuterClass.Book> getCreateMethod;
    if ((getCreateMethod = BookServiceGrpc.getCreateMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getCreateMethod = BookServiceGrpc.getCreateMethod) == null) {
          BookServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<example.BookOuterClass.CreateBookRequest, example.BookOuterClass.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.BookOuterClass.CreateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.BookOuterClass.Book.getDefaultInstance()))
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
      example.BookOuterClass.Books> METHOD_FIND_ALL = getFindAllMethod();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.BookOuterClass.Books> getFindAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.BookOuterClass.Books> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, example.BookOuterClass.Books> getFindAllMethod;
    if ((getFindAllMethod = BookServiceGrpc.getFindAllMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getFindAllMethod = BookServiceGrpc.getFindAllMethod) == null) {
          BookServiceGrpc.getFindAllMethod = getFindAllMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, example.BookOuterClass.Books>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.BookOuterClass.Books.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("FindAll"))
                  .build();
          }
        }
     }
     return getFindAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindByIdsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example.BookOuterClass.FindBookByIdsRequest,
      example.BookOuterClass.Books> METHOD_FIND_BY_IDS = getFindByIdsMethod();

  private static volatile io.grpc.MethodDescriptor<example.BookOuterClass.FindBookByIdsRequest,
      example.BookOuterClass.Books> getFindByIdsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.BookOuterClass.FindBookByIdsRequest,
      example.BookOuterClass.Books> getFindByIdsMethod() {
    io.grpc.MethodDescriptor<example.BookOuterClass.FindBookByIdsRequest, example.BookOuterClass.Books> getFindByIdsMethod;
    if ((getFindByIdsMethod = BookServiceGrpc.getFindByIdsMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getFindByIdsMethod = BookServiceGrpc.getFindByIdsMethod) == null) {
          BookServiceGrpc.getFindByIdsMethod = getFindByIdsMethod = 
              io.grpc.MethodDescriptor.<example.BookOuterClass.FindBookByIdsRequest, example.BookOuterClass.Books>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "FindByIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.BookOuterClass.FindBookByIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.BookOuterClass.Books.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("FindByIds"))
                  .build();
          }
        }
     }
     return getFindByIdsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example.BookOuterClass.DeleteBookRequest,
      com.google.protobuf.Empty> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<example.BookOuterClass.DeleteBookRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.BookOuterClass.DeleteBookRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<example.BookOuterClass.DeleteBookRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = BookServiceGrpc.getDeleteMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getDeleteMethod = BookServiceGrpc.getDeleteMethod) == null) {
          BookServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<example.BookOuterClass.DeleteBookRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.BookOuterClass.DeleteBookRequest.getDefaultInstance()))
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
    public void create(example.BookOuterClass.CreateBookRequest request,
        io.grpc.stub.StreamObserver<example.BookOuterClass.Book> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<example.BookOuterClass.Books> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void findByIds(example.BookOuterClass.FindBookByIdsRequest request,
        io.grpc.stub.StreamObserver<example.BookOuterClass.Books> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByIdsMethod(), responseObserver);
    }

    /**
     */
    public void delete(example.BookOuterClass.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.BookOuterClass.CreateBookRequest,
                example.BookOuterClass.Book>(
                  this, METHODID_CREATE)))
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                example.BookOuterClass.Books>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getFindByIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.BookOuterClass.FindBookByIdsRequest,
                example.BookOuterClass.Books>(
                  this, METHODID_FIND_BY_IDS)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.BookOuterClass.DeleteBookRequest,
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
    public void create(example.BookOuterClass.CreateBookRequest request,
        io.grpc.stub.StreamObserver<example.BookOuterClass.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<example.BookOuterClass.Books> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByIds(example.BookOuterClass.FindBookByIdsRequest request,
        io.grpc.stub.StreamObserver<example.BookOuterClass.Books> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(example.BookOuterClass.DeleteBookRequest request,
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
    public example.BookOuterClass.Book create(example.BookOuterClass.CreateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.BookOuterClass.Books findAll(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.BookOuterClass.Books findByIds(example.BookOuterClass.FindBookByIdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(example.BookOuterClass.DeleteBookRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<example.BookOuterClass.Book> create(
        example.BookOuterClass.CreateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.BookOuterClass.Books> findAll(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.BookOuterClass.Books> findByIds(
        example.BookOuterClass.FindBookByIdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        example.BookOuterClass.DeleteBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_FIND_BY_IDS = 2;
  private static final int METHODID_DELETE = 3;

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
          serviceImpl.create((example.BookOuterClass.CreateBookRequest) request,
              (io.grpc.stub.StreamObserver<example.BookOuterClass.Book>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<example.BookOuterClass.Books>) responseObserver);
          break;
        case METHODID_FIND_BY_IDS:
          serviceImpl.findByIds((example.BookOuterClass.FindBookByIdsRequest) request,
              (io.grpc.stub.StreamObserver<example.BookOuterClass.Books>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((example.BookOuterClass.DeleteBookRequest) request,
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
      return example.BookOuterClass.getDescriptor();
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
              .addMethod(getFindByIdsMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
