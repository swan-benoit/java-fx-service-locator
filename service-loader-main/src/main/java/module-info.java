module org.example{
    requires com.example.codec;
    uses com.example.codec.CodecLocator;
    uses com.example.codec.CodecSet;
    uses com.example.codec.Decoder;
    exports org.example;
}