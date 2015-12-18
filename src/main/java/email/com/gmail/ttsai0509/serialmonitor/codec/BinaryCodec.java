package email.com.gmail.ttsai0509.serialmonitor.codec;

public class BinaryCodec implements Codec {

    @Override
    public String encode(byte[] dat) {
        if (dat == null)
            return NO_STR;
        else
            return org.apache.commons.codec.binary.BinaryCodec.toAsciiString(dat);
    }

    @Override
    public byte[] decode(String str) {
        if (str == null)
            return NO_DAT;
        else
            return org.apache.commons.codec.binary.BinaryCodec.fromAscii(str.getBytes());
    }

    @Override
    public String toString() {
        return "BINARY CODEC";
    }

}