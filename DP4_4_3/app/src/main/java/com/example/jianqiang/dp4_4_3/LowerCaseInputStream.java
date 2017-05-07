package com.example.jianqiang.dp4_4_3;

/**
 * Created by jianqiang on 16/8/12.
 */
import java.io.*;

public class LowerCaseInputStream extends FilterInputStream
{
    /**
     * Construct an inputstream which can convert uppercase to lowercase
     * @param in the input stream being decorated
     */
    public LowerCaseInputStream(InputStream in)
    {
        super(in);
    }

    /**
     * this read() is byte-oriented
     */
    public int read() throws IOException
    {
        int result = super.read();
        return (result==-1? result : Character.toLowerCase((char)result));
    }

    /**
     * this read method is <b>char-oriented</b>
     * Reads up to len bytes of data from the input stream into an array of bytes.
     * An attempt is made to read as many as len bytes,
     * but a smaller number may be read.
     * The number of bytes actually read is returned as an integer.
     * @param b the byte array to store the char having read from the stream
     * @param offset the index to start writing b
     * @param len the max number of char to store into b
     */
    public int read(byte[] b, int offset, int len) throws IOException
    {
        int result = super.read(b, offset, len);
        for (int i=offset; i<offset+len; ++i)
        {
            b[i]=(byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}