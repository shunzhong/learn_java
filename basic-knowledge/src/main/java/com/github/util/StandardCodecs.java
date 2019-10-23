package com.github.util;

import java.util.ServiceLoader;

public class StandardCodecs implements CodecSet {
    private static ServiceLoader<CodecSet> codecSetLoader  =  ServiceLoader.load(CodecSet.class);

    @Override
    public Encoder getEncoder(String encodingName) {
        for (CodecSet cp : codecSetLoader) {
            Encoder enc = cp.getEncoder(encodingName);
            if (enc != null)
                return enc;
        }
        return null;
    }


    @Override
    public Decoder getDecoder(String encodingName) {
        return null;
    }

    public static void main(String[] args) {
        CodecSet  codecSet = new StandardCodecs();
        Encoder encoder = codecSet.getEncoder("com.github.util.StandardCodecs");
    }
}
