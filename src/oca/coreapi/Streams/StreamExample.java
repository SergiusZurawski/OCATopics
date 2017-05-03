package oca.coreapi.Streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
        java.io.InputStream  - abstract, bytes
                    implementation:
                        ByteArrayInputStream
                        PipedInputStream

        java.io.Reader -       abstract, chars;
                int read()
                int read(byte [] buff) - InputStream
                int read(char [] buff) - Reader


        java.io.OutputStream  - abstract, bytes
                ByteArrayOutputStream
        java.io.Writer -        abstract, chars;
            void write(int b)
            void write(byte[] b)

     */

public class StreamExample {
    /** _Bytes_ */

    //Abstract
    InputStream iStream;

    //Implementations
    public void anonimusClassImplementationExample(){

        iStream = new InputStream() {
            @Override
            public int read() throws IOException {
                //This won't work, for demonstration purposes only
                return 0;
            }
        };

        System.out.println(read(iStream));
    }

    public void byteArrayInputStreamExample(){

        byte [] byteArr = new byte[10];
        iStream = new ByteArrayInputStream(byteArr);
        System.out.println(read(iStream));
    }

    public void pipedInputStreamExample(){

        byte [] byteArr = new byte[10];
        iStream = new PipedInputStream();
        System.out.println(read(iStream));
    }

    private List<Byte> read(InputStream is){
        int intVal;
        List<Byte> l = new ArrayList<Byte>();
        try {

            while ((intVal = is.read()) >= 0) {
                byte byteVal = (byte) intVal;
                l.add(byteVal);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            for(Throwable t:e.getSuppressed()) { System.out.println("Suppressed" + t);};
        }
        return l;
    }

//    private List<Byte> read(InputStream is, byte[] arr){
//        int intVal;
//        List<Byte> l = new ArrayList<Byte>();
//        try {
//
//            while ((intVal = is.read()) >= 0) {
//                byte byteVal = (byte) intVal;
//                l.add(byteVal);
//            }
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            for(Throwable t:e.getSuppressed()) { System.out.println("Suppressed" + t);};
//        }
//        return l;
//    }



    /** _Text_*/
    Reader reader;
    int intVal;

    while ((intVal = istream.read()) >= 0) {
        char charVal = (char) intVal;

    }
}
