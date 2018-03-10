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
    comments = "Source: bookshelf.proto")
public final class BookShelfServiceGrpc {

  private BookShelfServiceGrpc() {}

  public static final String SERVICE_NAME = "BookShelfService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example.Bookshelf.CreateBookShelfRequest,
      example.Bookshelf.BookShelf> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<example.Bookshelf.CreateBookShelfRequest,
      example.Bookshelf.BookShelf> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.Bookshelf.CreateBookShelfRequest,
      example.Bookshelf.BookShelf> getCreateMethod() {
    io.grpc.MethodDescriptor<example.Bookshelf.CreateBookShelfRequest, example.Bookshelf.BookShelf> getCreateMethod;
    if ((getCreateMethod = BookShelfServiceGrpc.getCreateMethod) == null) {
      synchronized (BookShelfServiceGrpc.class) {
        if ((getCreateMethod = BookShelfServiceGrpc.getCreateMethod) == null) {
          BookShelfServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<example.Bookshelf.CreateBookShelfRequest, example.Bookshelf.BookShelf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookShelfService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.Bookshelf.CreateBookShelfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.Bookshelf.BookShelf.getDefaultInstance()))
                  .setSchemaDescriptor(new BookShelfServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.Bookshelf.BookShelfs> METHOD_FIND_ALL = getFindAllMethod();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.Bookshelf.BookShelfs> getFindAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.Bookshelf.BookShelfs> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, example.Bookshelf.BookShelfs> getFindAllMethod;
    if ((getFindAllMethod = BookShelfServiceGrpc.getFindAllMethod) == null) {
      synchronized (BookShelfServiceGrpc.class) {
        if ((getFindAllMethod = BookShelfServiceGrpc.getFindAllMethod) == null) {
          BookShelfServiceGrpc.getFindAllMethod = getFindAllMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, example.Bookshelf.BookShelfs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookShelfService", "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.Bookshelf.BookShelfs.getDefaultInstance()))
                  .setSchemaDescriptor(new BookShelfServiceMethodDescriptorSupplier("FindAll"))
                  .build();
          }
        }
     }
     return getFindAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddBookMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example.Bookshelf.AddBookRequest,
      example.Bookshelf.BookShelf> METHOD_ADD_BOOK = getAddBookMethod();

  private static volatile io.grpc.MethodDescriptor<example.Bookshelf.AddBookRequest,
      example.Bookshelf.BookShelf> getAddBookMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.Bookshelf.AddBookRequest,
      example.Bookshelf.BookShelf> getAddBookMethod() {
    io.grpc.MethodDescriptor<example.Bookshelf.AddBookRequest, example.Bookshelf.BookShelf> getAddBookMethod;
    if ((getAddBookMethod = BookShelfServiceGrpc.getAddBookMethod) == null) {
      synchronized (BookShelfServiceGrpc.class) {
        if ((getAddBookMethod = BookShelfServiceGrpc.getAddBookMethod) == null) {
          BookShelfServiceGrpc.getAddBookMethod = getAddBookMethod = 
              io.grpc.MethodDescriptor.<example.Bookshelf.AddBookRequest, example.Bookshelf.BookShelf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookShelfService", "AddBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.Bookshelf.AddBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.Bookshelf.BookShelf.getDefaultInstance()))
                  .setSchemaDescriptor(new BookShelfServiceMethodDescriptorSupplier("AddBook"))
                  .build();
          }
        }
     }
     return getAddBookMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example.Bookshelf.DeleteBookShelfRequest,
      com.google.protobuf.Empty> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<example.Bookshelf.DeleteBookShelfRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.Bookshelf.DeleteBookShelfRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<example.Bookshelf.DeleteBookShelfRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = BookShelfServiceGrpc.getDeleteMethod) == null) {
      synchronized (BookShelfServiceGrpc.class) {
        if ((getDeleteMethod = BookShelfServiceGrpc.getDeleteMethod) == null) {
          BookShelfServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<example.Bookshelf.DeleteBookShelfRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookShelfService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.Bookshelf.DeleteBookShelfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BookShelfServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookShelfServiceStub newStub(io.grpc.Channel channel) {
    return new BookShelfServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookShelfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookShelfServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookShelfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookShelfServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookShelfServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(example.Bookshelf.CreateBookShelfRequest request,
        io.grpc.stub.StreamObserver<example.Bookshelf.BookShelf> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<example.Bookshelf.BookShelfs> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void addBook(example.Bookshelf.AddBookRequest request,
        io.grpc.stub.StreamObserver<example.Bookshelf.BookShelf> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    /**
     */
    public void delete(example.Bookshelf.DeleteBookShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.Bookshelf.CreateBookShelfRequest,
                example.Bookshelf.BookShelf>(
                  this, METHODID_CREATE)))
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                example.Bookshelf.BookShelfs>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getAddBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.Bookshelf.AddBookRequest,
                example.Bookshelf.BookShelf>(
                  this, METHODID_ADD_BOOK)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.Bookshelf.DeleteBookShelfRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class BookShelfServiceStub extends io.grpc.stub.AbstractStub<BookShelfServiceStub> {
    private BookShelfServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookShelfServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookShelfServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookShelfServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(example.Bookshelf.CreateBookShelfRequest request,
        io.grpc.stub.StreamObserver<example.Bookshelf.BookShelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<example.Bookshelf.BookShelfs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBook(example.Bookshelf.AddBookRequest request,
        io.grpc.stub.StreamObserver<example.Bookshelf.BookShelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(example.Bookshelf.DeleteBookShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookShelfServiceBlockingStub extends io.grpc.stub.AbstractStub<BookShelfServiceBlockingStub> {
    private BookShelfServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookShelfServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookShelfServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookShelfServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.Bookshelf.BookShelf create(example.Bookshelf.CreateBookShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.Bookshelf.BookShelfs findAll(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.Bookshelf.BookShelf addBook(example.Bookshelf.AddBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(example.Bookshelf.DeleteBookShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookShelfServiceFutureStub extends io.grpc.stub.AbstractStub<BookShelfServiceFutureStub> {
    private BookShelfServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookShelfServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookShelfServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookShelfServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.Bookshelf.BookShelf> create(
        example.Bookshelf.CreateBookShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.Bookshelf.BookShelfs> findAll(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.Bookshelf.BookShelf> addBook(
        example.Bookshelf.AddBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        example.Bookshelf.DeleteBookShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_ADD_BOOK = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookShelfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookShelfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((example.Bookshelf.CreateBookShelfRequest) request,
              (io.grpc.stub.StreamObserver<example.Bookshelf.BookShelf>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<example.Bookshelf.BookShelfs>) responseObserver);
          break;
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((example.Bookshelf.AddBookRequest) request,
              (io.grpc.stub.StreamObserver<example.Bookshelf.BookShelf>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((example.Bookshelf.DeleteBookShelfRequest) request,
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

  private static abstract class BookShelfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookShelfServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.Bookshelf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookShelfService");
    }
  }

  private static final class BookShelfServiceFileDescriptorSupplier
      extends BookShelfServiceBaseDescriptorSupplier {
    BookShelfServiceFileDescriptorSupplier() {}
  }

  private static final class BookShelfServiceMethodDescriptorSupplier
      extends BookShelfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookShelfServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookShelfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookShelfServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getAddBookMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
