// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package shopping.cart.proto

@SerialVersionUID(0L)
final case class ItemQuantityAdjusted(
    cartId: _root_.scala.Predef.String = "",
    itemId: _root_.scala.Predef.String = "",
    quantity: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ItemQuantityAdjusted] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = cartId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = itemId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = quantity
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = cartId
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = itemId
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = quantity
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withCartId(__v: _root_.scala.Predef.String): ItemQuantityAdjusted = copy(cartId = __v)
    def withItemId(__v: _root_.scala.Predef.String): ItemQuantityAdjusted = copy(itemId = __v)
    def withQuantity(__v: _root_.scala.Int): ItemQuantityAdjusted = copy(quantity = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = cartId
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = itemId
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = quantity
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(cartId)
        case 2 => _root_.scalapb.descriptors.PString(itemId)
        case 3 => _root_.scalapb.descriptors.PInt(quantity)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = shopping.cart.proto.ItemQuantityAdjusted
}

object ItemQuantityAdjusted extends scalapb.GeneratedMessageCompanion[shopping.cart.proto.ItemQuantityAdjusted] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[shopping.cart.proto.ItemQuantityAdjusted] = this
  def merge(`_message__`: shopping.cart.proto.ItemQuantityAdjusted, `_input__`: _root_.com.google.protobuf.CodedInputStream): shopping.cart.proto.ItemQuantityAdjusted = {
    var __cartId = `_message__`.cartId
    var __itemId = `_message__`.itemId
    var __quantity = `_message__`.quantity
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __cartId = _input__.readStringRequireUtf8()
        case 18 =>
          __itemId = _input__.readStringRequireUtf8()
        case 24 =>
          __quantity = _input__.readInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    shopping.cart.proto.ItemQuantityAdjusted(
        cartId = __cartId,
        itemId = __itemId,
        quantity = __quantity,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[shopping.cart.proto.ItemQuantityAdjusted] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      shopping.cart.proto.ItemQuantityAdjusted(
        cartId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        itemId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        quantity = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ShoppingCartServiceProto.javaDescriptor.getMessageTypes.get(11)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ShoppingCartServiceProto.scalaDescriptor.messages(11)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = shopping.cart.proto.ItemQuantityAdjusted(
    cartId = "",
    itemId = "",
    quantity = 0
  )
  implicit class ItemQuantityAdjustedLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, shopping.cart.proto.ItemQuantityAdjusted]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, shopping.cart.proto.ItemQuantityAdjusted](_l) {
    def cartId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.cartId)((c_, f_) => c_.copy(cartId = f_))
    def itemId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.itemId)((c_, f_) => c_.copy(itemId = f_))
    def quantity: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.quantity)((c_, f_) => c_.copy(quantity = f_))
  }
  final val CARTID_FIELD_NUMBER = 1
  final val ITEMID_FIELD_NUMBER = 2
  final val QUANTITY_FIELD_NUMBER = 3
  def of(
    cartId: _root_.scala.Predef.String,
    itemId: _root_.scala.Predef.String,
    quantity: _root_.scala.Int
  ): _root_.shopping.cart.proto.ItemQuantityAdjusted = _root_.shopping.cart.proto.ItemQuantityAdjusted(
    cartId,
    itemId,
    quantity
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[shoppingcart.ItemQuantityAdjusted])
}
