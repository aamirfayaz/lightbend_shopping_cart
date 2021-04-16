
// Generated by Akka gRPC. DO NOT EDIT.
package shopping.cart.proto


trait ShoppingCartService {
  
  
  def addItem(in: shopping.cart.proto.AddItemRequest): scala.concurrent.Future[shopping.cart.proto.Cart]
  
  
  def checkout(in: shopping.cart.proto.CheckoutRequest): scala.concurrent.Future[shopping.cart.proto.Cart]
  
  
  def getCart(in: shopping.cart.proto.GetCartRequest): scala.concurrent.Future[shopping.cart.proto.Cart]
  
  
  def getItemPopularity(in: shopping.cart.proto.GetItemPopularityRequest): scala.concurrent.Future[shopping.cart.proto.GetItemPopularityResponse]
  
}

object ShoppingCartService extends akka.grpc.ServiceDescription {
  val name = "shoppingcart.ShoppingCartService"

  val descriptor: com.google.protobuf.Descriptors.FileDescriptor =
    shopping.cart.proto.ShoppingCartServiceProto.javaDescriptor;

  object Serializers {
    import akka.grpc.scaladsl.ScalapbProtobufSerializer
    
    val AddItemRequestSerializer = new ScalapbProtobufSerializer(shopping.cart.proto.AddItemRequest.messageCompanion)
    
    val CheckoutRequestSerializer = new ScalapbProtobufSerializer(shopping.cart.proto.CheckoutRequest.messageCompanion)
    
    val GetCartRequestSerializer = new ScalapbProtobufSerializer(shopping.cart.proto.GetCartRequest.messageCompanion)
    
    val GetItemPopularityRequestSerializer = new ScalapbProtobufSerializer(shopping.cart.proto.GetItemPopularityRequest.messageCompanion)
    
    val CartSerializer = new ScalapbProtobufSerializer(shopping.cart.proto.Cart.messageCompanion)
    
    val GetItemPopularityResponseSerializer = new ScalapbProtobufSerializer(shopping.cart.proto.GetItemPopularityResponse.messageCompanion)
    
  }
}
