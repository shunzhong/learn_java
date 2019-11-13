package com.github.util;

public  interface CodecSet {
   Encoder getEncoder(String encodingName);
   Decoder getDecoder(String encodingName);
}
